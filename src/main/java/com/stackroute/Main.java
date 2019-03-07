package com.stackroute;

import com.stackroute.demo.BeanLifeCycleDemoBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// From the aware-interface branch of spring-xml-demo repo create a bean-lifecycle
// branch.
// Add a BeanLifecycleDemoBean class in com.stackroute.demo that implements
// InitializingBean and DisposableBean.
// Override the required methods to print out messages.
// Define BeanLifecycleDemoBean as a bean in beans.xml.
// Run the application and observe the result. 
// Add two methods customInit() and customDestroy() to the BeanLifecycleDemoBean
// class and print out custom messages.
// In the BeanLifecycleDemoBean bean definition, in beans.xml, set the customInit()
// and customDestroy() methods to be called.
// Run the application.
// Push the code to bean-lifecycle branch. 


public class Main
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ((ClassPathXmlApplicationContext) context).registerShutdownHook();
        BeanLifeCycleDemoBean beanLifeCycleDemoBean= (BeanLifeCycleDemoBean)context.getBean("BeanLifeCycleDemoBean");

    }
}
