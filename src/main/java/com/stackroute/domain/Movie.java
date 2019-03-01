package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware
{
    Actor actor;
    ApplicationContext context;
    BeanFactory beanFactory;
    String beanName;


    public Actor getActor() {
        return actor;
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory=beanFactory;


    }

    public void setBeanName(String s) {
        this.beanName=s;

    }
    public String getBeanName()
    {
       Movie  movie=(Movie)context.getBean(beanName);
       return movie.toString();
    }

    public Movie() {
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
       this.context = applicationContext;
    }
}
