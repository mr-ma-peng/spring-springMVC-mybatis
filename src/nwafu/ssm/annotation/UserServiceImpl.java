package nwafu.ssm.annotation;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//＜bean id= ”userService " class＝”com.ssm.annotation.UserServicelmpl＂／＞
@Service("userService")
public class UserServiceImpl implements UserService {
    //<property name="userDao” ref="userDao”> jdk8 后不支持，主动引入javax.annotation.api 包
    //@Resource(name = "userDao")
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
        System.out.println("UserServiceImpl");
    }
}
