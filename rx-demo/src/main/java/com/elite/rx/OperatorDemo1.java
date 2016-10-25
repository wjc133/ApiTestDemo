package com.elite.rx;

import com.sun.org.apache.regexp.internal.RE;
import rx.Observable;
import rx.functions.Func1;

/**
 * Created by wjc133
 * Date: 2016/10/24
 * Time: 11:02
 * 加入operator，可以用于改变数据（处理事件）
 */
public class OperatorDemo1 {
    public static void main(String[] args) {
        Observable.just("#Basic Markdown To HTML").map(new Func1<String, String>() {
            @Override
            public String call(String s) {
                if (s != null && s.startsWith("#")) {
                    return "<h1>" + s.substring(1, s.length()) + "</h1>";
                }
                return null;
            }
        }).subscribe(System.out::println);
    }
}
