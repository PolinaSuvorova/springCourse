package com.polinasuvorova.hibernatelesson.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeTestOneToOne {
    public static void main(String[] args) {
        //Создаём сессии
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        try {

//            Employee employee = new Employee("Polina", "TTT", "HR", 300000);
//            Detail empDetail = new Detail("Moscow", "8888888", "polina@gmail.com");
//            employee.setEmpDetail(empDetail);
//            // открытие транзакции и изменение данных
//            session.beginTransaction();
//            session.persist(employee);
//            session.getTransaction().commit();
//            int myId = employee.getId();
//
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee empGet = session.get(Employee.class, myId);
//            System.out.println(empGet.getEmpDetail());
//            session.remove(pGet);
//            session.getTransaction().commit();


        } finally {
            session.close();
            factory.close();
        }

    }
}
