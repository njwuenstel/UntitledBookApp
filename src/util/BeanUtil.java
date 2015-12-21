package util;

import common.RoleNameEnum;
import entity.UserBean;
import entity.UserRoleBean;
import entity.WorkBean;
import persistence.UserBeanDao;
import persistence.UserRoleBeanDao;
import persistence.WorkBeanDao;

public class BeanUtil {

    UserBeanDao userDao = new UserBeanDao();
    UserRoleBeanDao userRoleDao = new UserRoleBeanDao();
    WorkBeanDao workDao = new WorkBeanDao();


    public UserBean addNewAppUser(String firstName, String lastName,
                   String alias, String password, String emailAddress) {

        /* create new UserBean and commit it to table */
        UserBean user = new UserBean(firstName, lastName, alias,
                                        password, emailAddress, null);
        userDao.addUser(user);

        /* create new UserRoleBean and commit it to table */
        UserRoleBean userRole = new UserRoleBean(alias, RoleNameEnum.appuser.name());
        userRoleDao.addUserRole(userRole);

        return user;
    }

    /* add a works read to user */
    public void addWorksReadToUser(String userAlias, WorkBean work) {

        /* get user */
        UserBean user = userDao.getUserByAlias(userAlias);

        /* add work to works table if it doesn't exist */
        WorkBean existingWork = workDao.getWorkByGoodreadsId(work.getGoodreadsId());

        if (existingWork == null) {
            workDao.addWork(work);
        }

        /* add work to hasRead */
        userDao.addReadWorkToUser(user, work);
        //TODO error handling and log add work to hasread
    }

}