package com.elite.api.web;

import com.elite.api.common.exception.ApiException;
import com.elite.api.dao.domain.News;
import com.elite.api.service.NewsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wjc133
 * Date: 2015/12/11
 * Time: 16:10
 */
@Controller
@RequestMapping(value = "news")
public class NewsController {
    private static final Logger LOG = LoggerFactory.getLogger(NewsController.class);
    @Autowired
    private NewsService newsService;

    @RequestMapping(value = "list-by-id")
    @ResponseBody
    public News listNewsById(@RequestParam Long id) throws ApiException {
        if (id == null) {
            throw new ApiException("id can't be null");
        }
        return newsService.queryById(id);
    }
}