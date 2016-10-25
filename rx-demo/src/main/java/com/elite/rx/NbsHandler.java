package com.elite.rx;

import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.http.converter.json.GsonBuilderUtils;
import rx.Observable;
import rx.schedulers.Schedulers;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wjc133
 * Date: 2016/10/25
 * Time: 10:12
 * 多线程异步Obser示例
 */
public class NbsHandler {
    private static final Gson GSON = new Gson();
    private ExecutorService httpExecutor = Executors.newFixedThreadPool(24, new ThreadFactoryBuilder()
            .setNameFormat("nbs-thread-%d")
            .build());

    public Observable<List<JokeEntity>> getJokeAsync(JokeRequest req) {
        Observable<List<JokeEntity>> observable =
                Observable.fromCallable(new Callable<List<JokeEntity>>() {
                    @Override
                    public List<JokeEntity> call() throws Exception {
                        Thread t = Thread.currentThread();
                        System.out.println("download thread:" + t.getName());

                        String path = HttpUtils.getJokeFromNetwork(req.getApikey(), req.getPage());
                        JokeResponse jokeResponse = GSON.fromJson(path, JokeResponse.class);
                        List<JokeEntity> jokeEntities = Lists.newArrayList();
                        if (jokeResponse.getShowapi_res_code() != 0) {
                            return jokeEntities;
                        }
                        List<JokeResponse.ShowapiResBody.Contentlist> contentlist = jokeResponse.getShowapi_res_body().getContentlist();
                        if (CollectionUtils.isEmpty(contentlist)) {
                            return jokeEntities;
                        }
                        for (JokeResponse.ShowapiResBody.Contentlist content : contentlist) {
                            JokeEntity entity = new JokeEntity();
                            entity.setCreateTime(content.getCt());
                            entity.setText(content.getText());
                            entity.setTitle(content.getTitle());
                            entity.setType(content.getType());
                            jokeEntities.add(entity);
                        }
                        return jokeEntities;
                    }
                })
                        .subscribeOn(Schedulers.from(httpExecutor));
        return observable;
    }
}
