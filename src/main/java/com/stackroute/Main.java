package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args) {
        Movie movie= new Movie();
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        movie.setApplicationContext(context);
        movie.setBeanName("movie");
        System.out.println(movie.getBeanName()+" movie bean 1 by application context ");
      

    }
}
