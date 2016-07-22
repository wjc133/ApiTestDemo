package com.elite.exts;

/**
 * Created by wjc133 on 16-6-22.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("JNI Test Program");
        HelloJni jni = HelloJni.getInstance();
        jni.setName("wjc133");
        jni.display();
    }
}