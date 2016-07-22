package com.elite.api.dao.utils;

import com.elite.api.dao.domain.News;

import java.util.Date;

/**
 * Created by wjc133
 * Date: 2015/12/11
 * Time: 17:36
 */
public class NewsBuilder {
    private News news;

    public NewsBuilder() {
        news = new News();
        news.setCreateTime(new Date());
        news.setUpdateTime(new Date());
    }

    public NewsBuilder id(Long id) {
        news.setId(id);
        return this;
    }

    public NewsBuilder id(int id) {
        news.setId((long) id);
        return this;
    }

    public NewsBuilder id(String id) {
        news.setId(Long.parseLong(id));
        return this;
    }

    public NewsBuilder title(String title) {
        news.setTitle(title);
        return this;
    }

    public NewsBuilder content(String content) {
        news.setContent(content);
        return this;
    }

    public NewsBuilder creator(String creator) {
        news.setCreator(creator);
        return this;
    }

    public NewsBuilder visitCount(Integer count) {
        news.setVisitCount(count);
        return this;
    }

    public NewsBuilder visitCount(String count) {
        news.setVisitCount(Integer.parseInt(count));
        return this;
    }

    public News build() {
        return news;
    }
}
