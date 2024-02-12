package com.polinasuvorova.hibernatelesson.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeTest5 {
    public static void main(String[] args) {
        //Создаём сессии
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
                       // открытие транзакции и изменение данных
            session.beginTransaction();
            session = factory.getCurrentSession();
            session.beginTransaction();
            session.createQuery( "delete Employee " +
                    "where  name='Elena'").executeUpdate();
            session.getTransaction().commit();


        } finally {
            factory.close();
        }

    }
}
