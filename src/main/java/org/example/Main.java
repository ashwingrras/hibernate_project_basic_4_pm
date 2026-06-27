package org.example;

/*

       class, interface, object, constructor, abstraction,
       inheritance, polymorphism, encapsulation

        JDBC ( java database connectivity )

        in jdbc we will run SQL queries

        Hibernate Code :
        1. xml

        2. annotation


        Project : Coaching Management System

        1. Student : id, name, mobile_no, email_id
        2. Trainer : id, name, mobile_no, email_id
        3. Course  : id, name, description, fees
        4. Batch   : id, name, batch_no, time, trainer_id
        5. Batch_Students : batch_id, student_id


        Relations:
                            Digilocker
        1. one to one     Users : Ashwin : Documents : aadhar card
                table 1 : id, name , mobile_no , id primary key
                           1,

                table 2 : id, aadhar_no, address, id primary key , table_1_id foreign key ( unique )
                       option 1: we can make id as foreign key
                       option 2 : table_1_id

        2. one to many :
                table 1 : id, name , mobile_no , id primary key
                           1,
                table 2 : id primary key, address, table_1_id ( non - unique )
        3. many to one   :
        4. many to many  : extra table create :
                            table 1  : id, name , id primary
                            table 2  : id, name , id primary

                            table 1_2 : table_1_id, table_2_id

                            Student table : student_id, 1, 2, 3
                                                        ab, ac, ad
                            Batch Table   : batch_id ; 7, 8, 9
                                                       j, p, m

                            student_batch : student_id ( student table ) batch_id ( batch table )
                                               1        7
                                               1        9
                                               2        7
                                               2        9


        Relations with Hibernate

        Collections : List, Set
        Inheritance :

        College Management System:
        Dashboard : Total Students, Total Course,

        July 2026 : 1200

        fetch from db
        select count(*) from students;   5 sec
        store in cache ( in-memory db ) : so it is very fast, less than  1 sec

        again request : count:

        inheritance : get property from another / parent class

        User    :  id, name , user_type : student / trainer

        Student ext User  : id, name, batch

        Trainer ext User  : id, name, batch

        Inheritance : 1. single table
        Vehicle:
        id type name  seatingCapacity engineCapacity
        1  car  swift    5              null
        2  bike pulsar   null           150

        Inheritance 2. join table:
        1. Vehicle  : id, name  : id primary
        2. Car      : id, seatingCapacity : id primary + foreign key : Vehicle (id)
        3. Bike     : id, engineCapacity  : id primary + foreign key : Vehicle (id)

        Vehicle : 1, Swift
        Car     : 1, 5

        Vehicle : 2, Pulsar
        Bike    : 2, 150

        Inheritance 3. union
        Vehicle : table will not create, id, name
        1. Car   : id, name, seatingCapacity
        2. Bike  : id, name, engineCapacity


 */

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        System.out.println(" at Main class main method ");

        // hibernate connection steps:
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();


        // queries

        tx.commit();
        session.close();
        System.out.println(" main end ");

    }
}