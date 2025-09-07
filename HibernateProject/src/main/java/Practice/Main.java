package Practice;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.postgresql.largeobject.LargeObjectManager;

public class Main {
    public static void main(String[] args) {

        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(Practice.Student.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session= sessionFactory.openSession();

        Student student = new Student();
        student.setCity("Pune");
        student.setAge(23);
        student.setName("Rudra");

        Transaction transaction = session.beginTransaction();
        session.persist(student);
        transaction.commit();

       Student s=session.get(Student.class,2);
       System.out.println(s.toString());

        s=session.find(Student.class,1);
        System.out.println(s.toString());

        session.close();
        sessionFactory.close();
    }
}