package com.elite.api.web;

import com.elite.api.dao.domain.News;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by wjc133
 * DATE: 16/5/20
 * TIME: 下午5:55
 */
@Controller
@RequestMapping("soar")
public class SoarController {

    @RequestMapping(value = "news",method = RequestMethod.GET)
    @ResponseBody
    public News getNews(){
        News news = new News();
        news.setId(1L);
        news.setContent("Hello World!");
        news.setCreateTime(new Date());
        news.setTitle("Welcome");
        news.setVisitCount(23);
        news.setCreateTime(new Date());
        return news;
    }
}
