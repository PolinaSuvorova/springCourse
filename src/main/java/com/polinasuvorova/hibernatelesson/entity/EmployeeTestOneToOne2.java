package com.polinasuvorova.hibernatelesson.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeTestOneToOne2 {
    public static void main(String[] args) {
        //Создаём сессии
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        try {

            // открытие транзакции и изменение данных

            int myId = 10;

            session = factory.getCurrentSession();
            session.beginTransaction();
            Detail detGet = session.get(Detail.class, myId);
            System.out.println(detGet);
            detGet.getEmployee( ).setEmpDetail(null);//DELETE relation with detail in employee
            //Delete only details
            session.remove(detGet);
            session.getTransaction().commit();


        } finally {
            session.close();
            factory.close();
        }

    }
}
