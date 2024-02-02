package com.polinasuvorova.hibernatelesson.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeTest {
    public static void main(String[] args) {
        //Создаём сессии
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Polina", "Suvorova", "IT", 1000);

            // открытие транзакции и изменение данных
            session.beginTransaction();
            session.persist(emp);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }

    }
}
