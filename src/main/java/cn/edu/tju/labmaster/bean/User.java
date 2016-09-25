package cn.edu.tju.labmaster.bean;

import cn.edu.tju.labmaster.bean.base.BaseBean;

import java.util.Date;

/**
 * Entity Class 用户
 * @author lhd, lx, npt
 */
public class User extends BaseBean {

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 属性（Json）
     */
    private String attributes;

    public User() {
    }

    /**
     * set 用户名(userName)
     * @return
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * get 用户名(userName)
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * set 密码(password)
     * @return
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * get 密码(password)
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * set 属性（Json）(attributes)
     * @return
     */
    public String getAttributes() {
        return this.attributes;
    }

    /**
     * get 属性（Json）(attributes)
     * @param attributes
     */
    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }
}