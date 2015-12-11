package com.elite.api.service;

import com.elite.api.dao.domain.News;
import com.elite.api.dao.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wjc133
 * Date: 2015/12/11
 * Time: 14:47
 */
@Service
public class NewsService {
    @Autowired
    private NewsMapper newsMapper;

    public News queryById(Long id) {
        return newsMapper.selectByPrimaryKey(id);
    }

}
