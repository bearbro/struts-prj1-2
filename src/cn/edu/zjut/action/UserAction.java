package cn.edu.zjut.action;

import cn.edu.zjut.bean.UserBean;
import cn.edu.zjut.service.UserService;

/**
 * Created by Bro、小熊 on 2017/10/2.
 */
public class UserAction {
    private UserBean loginUser;

    public UserBean getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(UserBean loginUser) {
        this.loginUser = loginUser;
    }

    public String execute() {
        UserService userServ = new UserService();

        if (userServ.register(loginUser)) {
            return "regsuccess";
        } else {
            return "regfail";
        }

    }

    public String execute1() {
        UserService userServ = new UserService();

        if (userServ.login(loginUser)) {
            return "logsuccess";
        } else {
            return "logfail";
        }
    }
}
