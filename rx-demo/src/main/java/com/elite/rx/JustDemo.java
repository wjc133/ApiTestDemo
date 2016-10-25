package com.elite.rx;

import rx.Observable;
import rx.functions.Action1;

/**
 * Created by wjc133
 * Date: 2016/10/24
 * Time: 10:57
 */
public class JustDemo {
    public static void main(String[] args) {
        Observable<String> observable = Observable.just("Hello RxJava");
        observable.subscribe(new Action1<String>() {
            @Override
            public void call(String s) {
                System.out.println("call:" + s);
            }
        });

        Observable.just("grd").subscribe(s -> {
            System.out.println("call:" + s);
        });
    }
}
