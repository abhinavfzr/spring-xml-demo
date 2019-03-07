package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// From the master branch of spring-xml-demo repo create a constructor-injection
// branch.
// Add constructor to the Actor class to initialize with name and gender, and age
// Create three beans of type Actor in the bean definition file.
// Use constructor-based injection in the bean definition file (beans.xml) to inject property values in
// each of the three beans via name, index, and type respectively.
// For the Movie bean, use constructor based object injection in the bean definition file
// (beans.xml) to inject an Actor bean.
// In the Main class, look up Movie bean using ApplicationContext and print out Author
// information.
// Use the same ApplicationContext to again look up the same Movie bean.
// Print out the equality result of the two Movie beans.
// System.out.println(beanA==beanB);
// Change the scope of the Movie bean in beans.xml to prototype and run the application again.
// Note the output.
// Replace id of the Movie bean with name having two values, like this: 

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
