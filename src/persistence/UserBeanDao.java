package persistence;

import entity.UserBean;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author paulawaite
 * @version 1.0 10/21/15.
 */
public class UserBeanDao {

    /* Method to CREATE a work in the database */
    public Integer addUser(UserBean user) {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;
        Integer userId = null;

        try {
            transaction = session.beginTransaction();
            userId = (Integer) session.save(user);
            transaction.commit();

        } catch (HibernateException e) {

            if (transaction != null) transaction.rollback();
            e.printStackTrace();

        } finally {

            session.close();
        }
        return userId;
    }
}