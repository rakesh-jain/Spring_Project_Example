package com.spring.pgdata;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static ApplicationContext applicationContext;

    private  static  ApplicationContext getApplicationContext(){
        applicationContext=new ClassPathXmlApplicationContext("pgdata.xml");
        return applicationContext;
    }

    public static void main(String[] args) {
        PgData pgd1=(PgData) getApplicationContext().getBean("pgdata1");
        pgd1.details();
    }
}
