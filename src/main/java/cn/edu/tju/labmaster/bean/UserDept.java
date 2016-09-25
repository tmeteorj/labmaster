package cn.edu.tju.labmaster.bean;

import cn.edu.tju.labmaster.bean.base.BaseBean;

import java.util.Date;

/**
 * Entity Class 用户部门对应关系表
 * @author lhd, lx, npt
 */
public class UserDept extends BaseBean {

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 部门ID
     */
    private Long deptId;

    public UserDept() {
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
     * set 部门ID(deptId)
     * @return
     */
    public Long getDeptId() {
        return this.deptId;
    }

    /**
     * get 部门ID(deptId)
     * @param deptId
     */
    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }
}