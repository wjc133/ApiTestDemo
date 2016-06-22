package com.elite.jni;

/**
 * Created by wjc133
 * Date: 2016/6/21
 * Time: 19:42
 */
public class HelloJni {
    static {
        System.loadLibrary("hellolib");
    }

    public native void display();

    public native void setName(String name);
}
