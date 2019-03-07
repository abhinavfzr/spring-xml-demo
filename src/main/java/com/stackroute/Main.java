package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// From the constructor-injection branch of spring-xml-demo repo create a
// autowire-xml branch.
// For the Movie bean, delete the constructor based object injection in the bean definition file
// (beans.xml) that injects an Actor bean.
// Use autowire byName in the Movie bean to inject an Actor bean.
// Run the application.
// Create another Movie bean and try autowire byType.
// Run the application and note the exception thrown.
// Fix the Movie bean by removing autowire byType and using constructor injection instead.
// Push the code to autowire-xml branch. : 

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
