package com.elite.api.schema;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;

/**
 * Created by wjc133
 * Date: 2016/4/13
 * Time: 10:49
 */
@Lazy(false)
public class ServiceBean implements InitializingBean,ApplicationContextAware {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Hello World");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
