package com.stackroute.demo;

public class BeanLifecycleDemoBean
{
    String name;

    public BeanLifecycleDemoBean(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BeanLifecycleDemoBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
