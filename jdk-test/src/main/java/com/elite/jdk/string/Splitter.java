package com.elite.jdk.string;

/**
 * Created by wjc133
 * Date: 2016/9/1
 * Time: 15:56
 */
public class Splitter {
    public static void main(String[] args) {
        String str = "hello+world";
        String[] ss = str.split("\\+");
        for (String s : ss) {
            System.out.println(s);
        }

    }
}
