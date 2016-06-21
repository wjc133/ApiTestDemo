package com.elite.api.schema;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by wjc133
 * Date: 2016/4/1
 * Time: 11:22
 */
public class People implements InitializingBean, ApplicationContextAware, BeanNameAware, ApplicationListener, DisposableBean {
    private String id;
    private String name;
    private int age;

    private ApplicationContext applicationContext;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Hello World!");
        System.out.println("yes i am afterPropertiesSet()");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        System.out.println("yes i am setApplicationContext()");
    }

    public People getBean() {
        return (People) applicationContext.getBean(id);
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("yes i am onApplicationEvent()");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("yes i am setBeanName()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("yes i am destroy()");
    }
}
