import entity.UserBean;
import entity.WorkBean;
import persistence.UserBeanDao;
import persistence.WorkBeanDao;

public class WorkBeanDriver {

    public static void main(String[] args) {

//        WorkBeanDao dao = new WorkBeanDao();
//        WorkBean work = new WorkBean("Title of Book2", "Author of Book2", "1345678");
//        dao.addWork(work);

        UserBeanDao userDao = new UserBeanDao();
        UserBean user = new UserBean("Craig", "Bricks");
        userDao.addUser(user);

    }
}