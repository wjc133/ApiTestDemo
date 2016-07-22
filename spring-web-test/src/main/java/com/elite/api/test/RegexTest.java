package com.elite.api.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by wjc133
 * Date: 2016/4/25
 * Time: 18:07
 */
public class RegexTest {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(?<=.*image/).+(?=/score)");
        String str = "task2/image/shuang/wai/wais/score";
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
