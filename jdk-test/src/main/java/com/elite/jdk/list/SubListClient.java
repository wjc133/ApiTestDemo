package com.elite.jdk.list;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by wjc133
 * Date: 2016/8/12
 * Time: 11:22
 */
public class SubListClient {
    public static void main(String[] args) {
        List<String> list = Lists.newArrayList();
        list.add("wjc133");
        list.add("dream");
        list.add("computer");

        System.out.println("list=" + list);
        System.out.println("(0-0) subList=" + list.subList(0, 0));
        System.out.println("(0-1) subList=" + list.subList(0, 1));
        System.out.println("(0-size) subList=" + list.subList(0, list.size()));
    }
}
