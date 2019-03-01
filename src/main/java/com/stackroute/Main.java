package com.stackroute;

import com.stackroute.demo.BeanLifeCycleDemoBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ((ClassPathXmlApplicationContext) context).registerShutdownHook();
        BeanLifeCycleDemoBean beanLifeCycleDemoBean= (BeanLifeCycleDemoBean)context.getBean("BeanLifeCycleDemoBean");

    }
}
