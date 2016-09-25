package cn.edu.tju.labmaster.bean;

import cn.edu.tju.labmaster.bean.base.BaseBean;

import java.util.Date;

/**
 * Entity Class 角色
 * @author lhd, lx, npt
 */
public class Role extends BaseBean {

    /**
     * 角色名称
     */
    private String roleName;

    public Role() {
    }

    /**
     * set 角色名称(roleName)
     * @return
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * get 角色名称(roleName)
     * @param roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}