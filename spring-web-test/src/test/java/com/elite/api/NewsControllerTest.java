package com.elite.api;

import com.elite.api.dao.domain.News;
import com.elite.api.dao.utils.NewsBuilder;
import com.elite.api.service.NewsService;
import com.elite.api.web.NewsController;
import com.elite.test.utils.TestUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by wjc133
 * Date: 2015/12/11
 * Time: 16:24
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/application-context-web.xml", "classpath:/test/spring-mvc.xml"})
@WebAppConfiguration
public class NewsControllerTest {
    @Autowired
    private ApplicationContext applicationContext;

    private MockMvc mockMvc;
    @Mock
    private NewsService newsServiceMock = mock(NewsService.class);
    @InjectMocks
    private NewsController newsController;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(newsController).build();
    }

    @Test
    public void testListById() throws Exception {
        News mockNews = new NewsBuilder()
                .id(1)
                .title("hello")
                .content("hello everyone")
                .creator("wjc133")
                .visitCount(10)
                .build();

        when(newsServiceMock.queryById(1L)).thenReturn(mockNews);

        mockMvc.perform(get("/news/list-by-id?id=1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(TestUtils.APPLICATION_JSON_UTF8))
                .andExpect(jsonPath("$.id", is(1)))
                .andExpect(jsonPath("$.title", is("hello")))
                .andExpect(jsonPath("$.content", is("hello everyone")))
                .andExpect(jsonPath("$.creator", is("wjc133")));

        verify(newsServiceMock, times(1)).queryById(1L);
        verifyNoMoreInteractions(newsServiceMock);
    }
}
