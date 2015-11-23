package persistence;

import entity.WorkBean;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author paulawaite
 * @version 1.0 10/21/15.
 */
public class WorkBeanDao {

    /* Method to CREATE a work in the database */
    public Integer addWork(WorkBean work) {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;
        Integer publicId = null;

        try {
            transaction = session.beginTransaction();
            publicId = (Integer) session.save(work);
            transaction.commit();

        } catch (HibernateException e) {

            if (transaction != null) transaction.rollback();
            e.printStackTrace();

        } finally {

            session.close();
        }
        return publicId;
    }
}