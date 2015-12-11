package com.elite.api;

import com.elite.api.common.exception.ApiException;
import com.elite.api.dao.domain.News;
import com.elite.api.web.NewsController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by wjc133
 * Date: 2015/12/11
 * Time: 16:24
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/application-context-web.xml", "classpath:/test/spring-mvc.xml"})
public class NewsControllerTest {
    @Autowired
    private NewsController newsController;

    @Test
    public void testListById() throws ApiException {
        Long id = 1L;
        News news = newsController.listNewsById(id);
        assertEquals(news.getTitle(), "hello");
    }
}
