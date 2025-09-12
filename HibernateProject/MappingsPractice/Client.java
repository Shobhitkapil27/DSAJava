package MappingsPractice;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {
    public static void main(String[] args) {
        DCN_details dcn_details = new DCN_details("UK");

        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(MappingsPractice.Invoice.class);
        configuration.addAnnotatedClass(MappingsPractice.DCN_details.class);
        configuration.addAnnotatedClass(MappingsPractice.Currency.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            session.beginTransaction();

            Currency ukCurrency = session.find(Currency.class, "UK");
            if (ukCurrency == null) {
                ukCurrency = new Currency("UK", "Pound Sterling");
                session.persist(ukCurrency);
            }

            Invoice invoice1 = new Invoice(dcn_details, "INV002", "2025-09-11", 3000, ukCurrency);
            //Invoice invoice2 = new Invoice(dcn_details, "INV002", "2025-09-12", 2000, ukCurrency);

            session.persist(invoice1);
            //session.persist(invoice2);

            session.getTransaction().commit();
        } catch (Exception e) {
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

    }

}
