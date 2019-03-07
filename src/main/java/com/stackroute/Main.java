package com.stackroute;
import com.stackroute.demo.BeanLifecycleDemoBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// From the bean-lifecycle branch of spring-xml-demo repo create a bean-postprocessor branch.
// Add a BeanPostProcessorDemoBean class in com.stackroute.demo that implements
// BeanPostProcessor
// Override the required methods to print out messages.
// Define BeanLifecycleDemoBean as a bean in beans.xml.
// Run the application and observe the result.
// Push the code to bean-post-processor branch. 


public class Main
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    }
}
