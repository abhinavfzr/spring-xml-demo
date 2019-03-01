package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie= (Movie) context.getBean("movie");
        System.out.println(movie+" by application context ");
        XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie mybean= (Movie)beanFactory.getBean("movie");
        System.out.println(mybean+" by xml bean factory");

    }
}
