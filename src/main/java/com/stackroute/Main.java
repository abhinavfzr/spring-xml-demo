package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// From the autowire-xml branch of spring-xml-demo repo create an aware-interface
// branch.
// Implement ApplicationContextAware, BeanFactoryAware, BeanNameAware in the
// Movie class and print out their results.
// Push the code to aware-interface branch. 

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
