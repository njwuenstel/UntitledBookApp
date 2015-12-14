package persistence;

import entity.UserBean;
import entity.WorkBean;
import org.apache.log4j.Logger;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;
import util.BookieLogger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author paulawaite
 * @version 1.0 10/21/15.
 */
public class UserBeanDao {

    Logger log = BookieLogger.getDatabaseLog();

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
            log.info("User: " + user.getUserAlias() + " added to database");

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

    /* Method to CREATE or UPDATE a user in the database */
    public void addOrUpdateUser(UserBean user) {

        log.debug("Add User - Opening session");
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(user);
            transaction.commit();
            log.info("User: " + user.getUserAlias() + " added to database");

        } catch (HibernateException e) {

            if (transaction != null) transaction.rollback();
            log.error("Exception attempting to add " + user.getUserAlias() + " to database");
            log.error(e);
            e.printStackTrace();

        } finally {

            session.close();
            log.debug("Add User - Session closed");
        }
    }

    /* Method to CREATE or UPDATE a user in the database */
    public void addReadWorkToUser(UserBean user, WorkBean work) {

        log.debug("zzz - Opening session");
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            Set<WorkBean> userReads = new HashSet<>();

            // add all current read works to set
            userReads.addAll(user.getHaveReads());
            // add new read work to set
            userReads.add(work);
            // add userReads list back to user
            user.setHaveReads(userReads);

            session.update(user);
            transaction.commit();
            log.info("User: " + user.getUserAlias() + " added to database");

        } catch (HibernateException e) {

            if (transaction != null) transaction.rollback();
            log.error("Exception attempting to add " + user.getUserAlias() + " to database");
            log.error(e);
            e.printStackTrace();

        } finally {

            session.close();
            log.debug("Add User - Session closed");
        }
    }

    public UserBean getUserByAlias (String userAlias) {

        UserBean user = null;
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(UserBean.class);
        criteria.add(Restrictions.like("userAlias", userAlias));

        try {

            user = (UserBean) criteria.list().get(0);

        } catch (HibernateException e) {
            log.error("Exception attempting search for user with alias: " + userAlias);
            log.error(e);
            e.printStackTrace();
        } finally {
            session.close();
            log.debug("Add User - Session closed");
        }
        return user;
    }

}