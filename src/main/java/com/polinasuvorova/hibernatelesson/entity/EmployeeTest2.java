package com.polinasuvorova.hibernatelesson.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class EmployeeTest2 {
    public static void main(String[] args) {
        //Создаём сессии
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            List<Employee> emps = session.createQuery("from Employee where name = 'Polina' and salary = 1000" )
                    .getResultList();

            for (Employee emp:emps) {
                System.out.println(emp);
            }
            session.getTransaction().commit();

        } finally {
            factory.close();
        }

    }
}
