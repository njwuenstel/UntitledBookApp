package persistence;

import entity.UserRoleBean;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.BookingtonLoggers;

/**
 * Created by Sun Prairie PC on 11/28/2015.
 */
public class UserRoleBeanDao {

    /* Method to CREATE a UserRole in the database */
    public Integer addUserRole(UserRoleBean userRole) {

        Logger log = BookingtonLoggers.getDatabaseLog();

        log.debug("Add UserRole - Opening session");
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;
        Integer userId = null;

        try {
            transaction = session.beginTransaction();
            userId = (Integer) session.save(userRole);
            transaction.commit();
            log.info("UserRole: " + userRole.getUserAlias() + " added to database");

        } catch (MappingException e) {

            if (transaction != null) transaction.rollback();
            log.error("Exception attempting to map " + userRole.getUserAlias());
            log.error(e);
            e.printStackTrace();

        } catch (HibernateException e) {

            if (transaction != null) transaction.rollback();
            log.error("Exception attempting to add " + userRole.getUserAlias() + " to database");
            log.error(e);
            e.printStackTrace();

        } finally {

            session.close();
            log.debug("Add UserRole - Session closed");
        }
        return userId;
    }
}
