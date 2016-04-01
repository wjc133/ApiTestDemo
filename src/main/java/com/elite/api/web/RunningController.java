package com.elite.api.web;

import com.elite.api.schema.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wjc133
 * Date: 2015/12/10
 * Time: 21:14
 */
@Controller
@RequestMapping("spring")
public class RunningController {
    @RequestMapping("people")
    @ResponseBody
    public People getPeopleFromSpringContextXmlFiles() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-people.xml");
        People people = (People) context.getBean("wjc133");
        System.out.println(people.getId() + ":" + people.getName() + " age = " + people.getAge());
        return people;
    }
}
