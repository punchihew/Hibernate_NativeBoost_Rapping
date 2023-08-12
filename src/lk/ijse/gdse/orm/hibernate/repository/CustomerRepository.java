package lk.ijse.gdse.orm.hibernate.repository;

import lk.ijse.gdse.orm.hibernate.config.SessionFactoryConfig;
//import lk.ijse.gdse.orm.hibernate.entity.Customer1;
import lk.ijse.gdse.orm.hibernate.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerRepository {

    private final Session session;

    public CustomerRepository() {
        session = SessionFactoryConfig
                .getInstance()
                .getSession();
    }

    public int saveCustomer(Customer customer1) {
        Transaction transaction = session.beginTransaction();
        try {
            int customerId = (int) session.save(customer1);
            transaction.commit();
            session.close();
            return customerId;
        } catch (Exception e) {
            transaction.rollback();
            session.close();
            e.printStackTrace();
            return -1;
        }
    }

    public Customer getCustomer(int id) {
        try {
            Customer customer1 = session.get(Customer.class, id);
            session.close();
            return customer1;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public boolean updateCustomer(Customer customer1) {
        Transaction transaction = session.beginTransaction();
        try {
            session.update(customer1);
            transaction.commit();
            session.close();
            return true;
        } catch (Exception e) {
            transaction.rollback();
            session.close();
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteCustomer(Customer customer1) {
        Transaction transaction = session.beginTransaction();
        try {
            session.delete(customer1);
            transaction.commit();
            session.close();
            return true;
        } catch (Exception e) {
            transaction.rollback();
            session.close();
            e.printStackTrace();
            return false;
        }
    }
}
