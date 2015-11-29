package persistence;

import entity.UserBean;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.BookieLogger;

/**
 * @author paulawaite
 * @version 1.0 10/21/15.
 */
public class UserBeanDao {

    /* Method to CREATE a user in the database */
    public Integer addUser(UserBean user) {

        Logger log = BookieLogger.getDatabaseLog();

        log.debug("Add User - Opening session");
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;
        Integer userId = null;

        try {
            transaction = session.beginTransaction();
            userId = (Integer) session.save(user);
            transaction.commit();
            log.info("User: " + user.getUserAlias() + "added to database");

        } catch (HibernateException e) {

            if (transaction != null) transaction.rollback();
            log.error("Exception attempting to add " + user.getUserAlias() + " to database");
            log.error(e);
            e.printStackTrace();

        } finally {

            session.close();
            log.debug("Add User - Session closed");
        }
        return userId;
    }
}