package com.elite.api.client;

import com.elite.api.schema.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wjc133
 * Date: 2016/4/13
 * Time: 10:47
 */
public class CustomBeanClient {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-people.xml");
        People people = (People) context.getBean("wjc133");
        People p2 = people.getBean();
        System.out.println(people.getId() + ":" + people.getName() + " age = " + people.getAge());
        System.out.println(p2.getId() + ":" + p2.getName() + " age = " + p2.getAge());
    }
}
