package nwafu.ssm.ioc_di;

public class UserServiceImpl implements UserService{
    private UserDao userDao;
    //用来实现setter依赖注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void login() {
        userDao.login();
        System.out.println("service UserDao");
    }
}
