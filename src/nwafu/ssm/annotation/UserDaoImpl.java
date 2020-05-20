package nwafu.ssm.annotation;

import org.springframework.stereotype.Repository;
//＜bean id=”userDao” class=" com.ssm.annotation.UserDaolmpl ／
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("UserDaoImpl");
    }
}
