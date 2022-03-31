package com.onuryalcin.spring_orm.dao;

import com.onuryalcin.spring_orm.entity.Person;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.ArrayList;
import java.util.List;

public class PersonDao {

    HibernateTemplate template;

    public HibernateTemplate getTemplate() {
        return template;
    }

    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }

    public void addPerson(Person person){
        template.save(person);
    }

    public void updatePerson(Person person){
        template.update(person);
    }

    public void deletePerson(Person person){
        template.delete(person);
    }

    public Person getPersonById(int id){
        Person p = (Person) template.get(Person.class, id);
        return p;
    }

    public List<Person> getPersons(){
        List<Person> personList = new ArrayList<>();
        personList = template.loadAll(Person.class);
        return personList;
    }






}
