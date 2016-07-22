package com.elite.jdk;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by wjc133
 * Date: 2016/6/30
 * Time: 16:04
 * 使用Lambda表达式访问SAM接口外部的变量
 */
public class LambdaStudy2 {
    public static void main(String[] args) {
        String[] array = {"a", "b", "c"};
        for (Integer i : Lists.newArrayList(1, 2, 3)) {
            Stream.of(array).map(item -> Strings.padEnd(item, i, '@')).forEach(System.out::println);
        }

        List<Integer> nums = Lists.newArrayList(1, 1, null, 2, 3, 4, null, 5, 6, 7, 8, 9, 10);
        System.out.println("sum is: " + nums.stream().filter(num -> num != null).distinct().mapToInt(num -> num * 2)
                .peek(System.out::println).skip(2).limit(4).sum());
    }
}
