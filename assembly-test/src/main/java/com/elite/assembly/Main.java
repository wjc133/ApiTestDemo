package com.elite.assembly;

import java.io.File;

/**
 * Created by wjc133
 * Date: 2016/9/20
 * Time: 11:43
 */
public class Main {
    public static void main(String[] args) {
        File file = ConfigUtils.loadFile("config.xml");
        if (file != null && file.exists()) {
            System.out.println("文件存在:" + file.getAbsolutePath());
        } else {
            System.out.println("文件不存在");
        }
    }
}
