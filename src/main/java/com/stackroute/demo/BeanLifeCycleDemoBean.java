package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleDemoBean implements InitializingBean, DisposableBean
{

    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("after properties set");

    }
    public  void  customInit()
    {
        System.out.println("start custom bean");
    }
    public  void  customDestroy()
    {
        System.out.println("Destroy custom bean");

    }
}
