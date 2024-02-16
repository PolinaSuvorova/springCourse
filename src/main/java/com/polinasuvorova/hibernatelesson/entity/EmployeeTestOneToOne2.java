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

            Employee employee = new Employee("Pavel", "Smith", "HR", 100000);
            Detail empDetail = new Detail("London", "8888866", "misha@gmail.com");

            employee.setEmpDetail(empDetail);
            empDetail.setEmployee(employee);

            // открытие транзакции и изменение данных
            session.beginTransaction();
            session.persist(empDetail);
            session.getTransaction().commit();

            int myId = employee.getId();
            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee empGet = session.get(Employee.class, myId);
            System.out.println(empGet.getEmpDetail());
            //session.remove(empGet);
            session.getTransaction().commit();


        } finally {
            session.close();
            factory.close();
        }

    }
}
