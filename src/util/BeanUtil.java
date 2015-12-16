package util;

import common.RoleNameEnum;
import entity.UserBean;
import entity.UserRoleBean;
import persistence.UserBeanDao;
import persistence.UserRoleBeanDao;

public class BeanUtil {

    public void addNewAppUser(String firstName, String lastName,
                   String alias, String password, String emailAddress) {

        UserBeanDao userDao = new UserBeanDao();
        UserRoleBeanDao userRoleDao = new UserRoleBeanDao();

        /* create new UserBean and commit it to table */
        UserBean user = new UserBean(firstName, lastName, alias,
                                        password, emailAddress, null);
        userDao.addUser(user);

        /* create new UserRoleBean and commit it to table */
        UserRoleBean userRole = new UserRoleBean(alias, RoleNameEnum.appuser.name());
        userRoleDao.addUserRole(userRole);
    }

}