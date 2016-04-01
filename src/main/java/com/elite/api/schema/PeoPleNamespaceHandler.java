package com.elite.api.schema;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by wjc133
 * Date: 2016/4/1
 * Time: 11:59
 */
public class PeopleNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        registerBeanDefinitionParser("people", new PeopleBeanDefinitionParser());
    }
}
