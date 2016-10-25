package com.elite.rx.service;

import com.google.common.collect.Lists;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wjc133
 * Date: 2016/10/24
 * Time: 15:24
 */
@Service
public class TvShowService {
    public List<String> getTvShowList() {
        List<String> list = Lists.newArrayList();
        list.add("eee");
        list.add("fff");
        list.add("ddd");
        return list;
    }
}
