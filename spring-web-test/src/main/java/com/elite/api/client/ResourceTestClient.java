package com.elite.api.client;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;

/**
 * Created by wjc133
 * Date: 2016/4/8
 * Time: 10:55
 */
public class ResourceTestClient {
    public static void main(String[] args) {
        try {
            Resource txt = new UrlResource("file:F:/fortest/test.txt");
            System.out.println(txt.getFilename());
            System.out.println(txt.getDescription());
            File f = txt.getFile();
            BufferedReader reader = new BufferedReader(new FileReader(f));
            String content;
            while ((content = reader.readLine()) != null) {
                System.out.println(content);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
