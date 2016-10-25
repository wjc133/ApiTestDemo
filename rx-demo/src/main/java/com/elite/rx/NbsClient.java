package com.elite.rx;

import rx.Observable;
import rx.functions.Action1;

import java.util.List;

/**
 * Created by wjc133
 * Date: 2016/10/25
 * Time: 10:54
 */
public class NbsClient {
    public static void main(String[] args) {
        NbsHandler nbsHandler = new NbsHandler();
        JokeRequest request = new JokeRequest();
        request.setPage(1);
        Observable<List<JokeEntity>> jokeAsync = nbsHandler.getJokeAsync(request);
        for (int i = 0; i < 10; i++) {
            jokeAsync.subscribe(new Action1<List<JokeEntity>>() {
                @Override
                public void call(List<JokeEntity> jokeEntities) {
                    for (JokeEntity jokeEntity : jokeEntities) {
                        System.out.println(jokeEntity.getText());
                    }
                }
            });
        }
    }
}
