package cn.edu.tju.labmaster.bean;

import cn.edu.tju.labmaster.bean.base.BaseBean;

import java.util.Date;

/**
 * Entity Class 用户角色对应关系表
 * @author lhd, lx, npt
 */
public class UserRole extends BaseBean {

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 角色ID
     */
    private Long roleId;

    public UserRole() {
    }

    /**
     * set 用户ID(userId)
     * @return
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * get 用户ID(userId)
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * set 角色ID(roleId)
     * @return
     */
    public Long getRoleId() {
        return this.roleId;
    }

    /**
     * get 角色ID(roleId)
     * @param roleId
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}