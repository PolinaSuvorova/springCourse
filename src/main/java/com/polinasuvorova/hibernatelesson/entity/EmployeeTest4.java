package com.polinasuvorova.hibernatelesson.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeTest4 {
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
            Employee empGet = session.get(Employee.class, 1);
            System.out.println(empGet);
            empGet.setSalary(777);
            session.getTransaction().commit();

            session = factory.getCurrentSession();
            session.beginTransaction();
            session.createQuery( "update Employee set salary=1000 " +
                    "where  name='Polina'").executeUpdate();
            session.getTransaction().commit();

            session = factory.getCurrentSession();
            session.beginTransaction();

            empGet = session.get(Employee.class, 1);

            session.getTransaction().commit();
            System.out.println(empGet);
        } finally {
            factory.close();
        }

    }
}
