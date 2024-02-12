package com.polinasuvorova.hibernatelesson.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeTest3 {
    public static void main(String[] args) {
        //Создаём сессии
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Elena", "Petrova", "IT", 2000);

            // открытие транзакции и изменение данных
            session.beginTransaction();
            session.persist(emp);
            session.getTransaction().commit();

            int myId = emp.getId();
            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee empGet = session.get(Employee.class, myId);
            session.getTransaction().commit();

            System.out.println(empGet);
        } finally {
            factory.close();
        }

    }
}
