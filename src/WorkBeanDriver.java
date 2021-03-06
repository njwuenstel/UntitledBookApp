import common.RoleNameEnum;
import entity.UserBean;
import entity.UserRoleBean;
import entity.WorkBean;
import goodreads.service.GoodreadsServiceGateway;
import persistence.UserBeanDao;
import persistence.UserRoleBeanDao;
import persistence.WorkBeanDao;

public class WorkBeanDriver {


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

    public static void main(String[] args) {

        WorkBeanDriver wbd = new WorkBeanDriver();
        GoodreadsServiceGateway gateway = new GoodreadsServiceGateway();

        String isbn = "038039586X";

        WorkBean isbnBean = gateway.getBookFromIsbn(isbn);
        System.out.println(isbnBean.toString());

//        WorkBeanDao dao = new WorkBeanDao();
//        WorkBean work = new WorkBean("Title of Book2", "Author of Book2", "1345678");
//        dao.addWork(work);

//        wbd.addNewAppUser("Henry", "Cooper", "cooper", "password", "test@test.com");

    }
}