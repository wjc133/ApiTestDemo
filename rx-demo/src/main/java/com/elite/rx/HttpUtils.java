package com.elite.rx;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.File;
import java.io.IOException;

/**
 * Created by wjc133
 * Date: 2016/10/25
 * Time: 10:39
 */
public class HttpUtils {
    private static final OkHttpClient HTTP_CLIENT = new OkHttpClient();
    public static String getJokeFromNetwork(String apikey, int page) throws IOException {
        Request request = new Request.Builder()
                .url("http://apis.baidu.com/showapi_open_bus/showapi_joke/joke_text?page=" + page)
                .addHeader("apikey", apikey)
                .get()
                .build();
        Call call = HTTP_CLIENT.newCall(request);
        Response response = call.execute();
        byte[] bytes = response.body().bytes();
        return new String(bytes, "utf-8");
    }
}
