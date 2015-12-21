package persistence;

import entity.WorkBean;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import util.BookingtonLoggers;

/**
 * @author paulawaite
 * @version 1.0 10/21/15.
 */
public class WorkBeanDao {

    Logger log = BookingtonLoggers.getDatabaseLog();

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

    public WorkBean getWorkByGoodreadsId(String goodreadsId) {

        WorkBean work = null;
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(WorkBean.class);
        criteria.add(Restrictions.like("goodreadsId", goodreadsId));

        /* null safe for criteria list() */
        if(criteria.list().size() > 0) {
            try {

                work = (WorkBean) criteria.list().get(0);

            } catch (HibernateException e) {
                /* catch and log error */
                log.error("Exception attempting search for work with goodreads id: " + goodreadsId);
                log.error(e);

            } finally {
                session.close();
                log.debug("Get Work By Goodreads Id - Session closed");
            }
        }
        return work;
    }
}