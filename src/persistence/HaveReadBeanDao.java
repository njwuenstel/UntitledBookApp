package persistence;

import entity.HaveReadBean;
import entity.UserBean;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author paulawaite
 * @version 1.0 10/21/15.
 */
public class HaveReadBeanDao {

    /* Method to CREATE a work in the database */
    public Integer addHaveRead(HaveReadBean haveRead) {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;
        Integer haveReadId = null;

        try {
            transaction = session.beginTransaction();
            haveReadId = (Integer) session.save(haveRead);
            transaction.commit();

        } catch (HibernateException e) {

            if (transaction != null) transaction.rollback();
            e.printStackTrace();

        } finally {

            session.close();
        }
        return haveReadId;
    }
}