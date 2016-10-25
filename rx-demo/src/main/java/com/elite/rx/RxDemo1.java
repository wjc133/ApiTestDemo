package com.elite.rx;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;

/**
 * Created by wjc133
 * Date: 2016/10/24
 * Time: 10:41
 */
public class RxDemo1 {
    public static void main(String[] args) {
        Observable<String> observable = Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> o) {
                o.onNext("hello");
                o.onCompleted();
            }
        });
        Subscriber<String> subscriber = new Subscriber<String>() {
            @Override
            public void onCompleted() {
                System.out.println("completed");
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("error");
            }

            @Override
            public void onNext(String s) {
                System.out.println("next:" + s);
            }
        };

        observable.subscribe(subscriber);
    }
}
