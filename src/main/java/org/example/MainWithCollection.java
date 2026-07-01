package org.example;

import org.example.modal.collection.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.*;

public class MainWithCollection
{
    public static void main(String[] args) {

        System.out.println(" at Main class main method ");

        // hibernate connection steps:
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();

        List<String> courses = new ArrayList<>();
        courses.add("java");
        courses.add("java");
        courses.add("python");

        Map<String, String> addresses = new HashMap<>();
        addresses.put("home","mansarover");
        addresses.put("office","gopalpura");

        Student student = new Student();
        student.setName("apra");
        student.setCourses(courses);
        student.setAddresses(addresses);
        // save
        session.save(student);

        /*student = new Student();
        student.setName("vishal");
        student.setCourses(courses);

        // save
        session.save(student);*/


        tx.commit();
        session.close();
        System.out.println(" main end ");

    }
}
