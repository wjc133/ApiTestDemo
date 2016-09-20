package com.elite.jdk.saveload;

import java.io.File;

/**
 * Created by wjc133
 * Date: 2016/9/20
 * Time: 11:20
 */
public class RelativePath {
    public static void main(String[] args) {
        File file = new File("doc/Lambda.md");
        if (file.exists()) {
            System.out.println("文件存在:" + file.getAbsolutePath());
        } else {
            System.out.println("文件不存在");
        }
        System.out.println(file.getAbsolutePath());
    }
}
