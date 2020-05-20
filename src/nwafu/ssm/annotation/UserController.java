package nwafu.ssm.annotation;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
//<bean id="userController" class=" com .ssm.annotation.UserController＂／＞
@Controller("userController")
public class UserController {
    //<property name＝userService" ref=” userService"/>
    //@Resource(name = "userService")
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void save(){
        this.userService.save();
        System.out.println("userController");
    }
}
