package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie= (Movie) context.getBean("movie");
        Movie movie1= (Movie) context.getBean("movie1");
        System.out.println(movie+" movie bean 1 by application context ");
        System.out.println(movie1+" movie bean 2 by application context ");
        System.out.println(movie==movie1);

    }
}
