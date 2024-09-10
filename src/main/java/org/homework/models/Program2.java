package org.homework.models;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.management.Query;

public class Program2 {
    public static void main(String[] args) {
        Person john = new Person("John",45);
        Person sarah = new Person("Sarah",40);
        try(SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .buildSessionFactory()){
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            session.save(john);
            session.save(sarah);
            session.getTransaction().commit();
        }
    }
}
