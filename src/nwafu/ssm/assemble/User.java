package nwafu.ssm.assemble;

import java.util.List;

public class User {
    private String userName;
    private String password;
    private List<String> list;
    //构造注入
    //有参构造
    public User(String userName, String password, List<String> list){
        super();
        this.userName = userName;
        this.password = password;
        this.list = list;
    }

    @Override
    public String toString() {
        return "User{" + "userName='" + userName + '\'' + ", password='" + password + '\'' + ", list=" + list + '}';
    }
    //设值注入
    //默认无惨
    //提供setter（）方法

    public User() {
        super();
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
