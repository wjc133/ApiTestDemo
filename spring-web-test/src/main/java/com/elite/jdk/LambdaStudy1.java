package com.elite.jdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by wjc133
 * Date: 2016/6/30
 * Time: 15:19
 */
public class LambdaStudy1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tisl");
        names.add("YY");
        names.add("wjc133");
//        Collections.sort(names,(o1,o2)->o1.compareTo(o2));
        //完整写法
        List<String> lower=names.stream().map((String name)->{return
            name.toLowerCase();}).collect(Collectors.toList());
        //当从上下文可以推断出参数类型时，可以不用写参数类型
        List<String> lower2=names.stream().map((name)->{return name.toLowerCase();}).collect(Collectors.toList());
        //当只有一个参数时，可以省略参数列表的括号
        List<String> lower3=names.stream().map(name->{return name.toLowerCase();}).collect(Collectors.toList());
        //当Lambda表达式只有一条需要执行的语句时，可以省略大括号、return和语句结尾的分号
        //此时，lambda表达式可以简化成param1->statement
        List<String> lower4=names.stream().map(name->name.toLowerCase()).collect(Collectors.toList());
        //使用方法引用  todo 后续介绍
        List<String> lower5 = names.stream().map(String::toLowerCase).collect(Collectors.toList());

        System.out.println(lower);
        System.out.println(lower2);
        System.out.println(lower3);
        System.out.println(lower4);
        System.out.println(lower5);
    }
}
