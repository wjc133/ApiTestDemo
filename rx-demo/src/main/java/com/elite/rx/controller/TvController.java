package com.elite.rx.controller;

import com.elite.rx.service.TvShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import rx.Observable;
import rx.Observer;
import rx.Subscription;

import java.util.List;

/**
 * Created by wjc133
 * Date: 2016/10/24
 * Time: 15:13
 */
@Controller
@RequestMapping("tv")
public class TvController {
    @Autowired
    private TvShowService tvShowService;

    @RequestMapping("list")
    @ResponseBody
    public String getList() {
        Observable<List<String>> tvShowObservable = Observable.fromCallable(() -> tvShowService.getTvShowList());
        Subscription subscription = tvShowObservable.subscribe(new Observer<List<String>>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onNext(List<String> list) {
                display(list);
            }
        });
        return "ok";
    }

    private void display(List<String> list) {
        System.out.println(list);
    }

}
