package com.onuryalcin.spring_orm.util;


import com.onuryalcin.spring_orm.dao.PersonDao;
import com.onuryalcin.spring_orm.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        PersonDao pDao = (PersonDao) appContext.getBean("pDao");
        Person person = new Person("Onur" , "Yalcin", "Erkek" , 13500.50f);

        pDao.addPerson(person);




    }
}
