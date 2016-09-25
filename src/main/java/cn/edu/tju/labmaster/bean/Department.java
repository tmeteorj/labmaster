package cn.edu.tju.labmaster.bean;

import cn.edu.tju.labmaster.bean.base.BaseBean;

import java.util.Date;

/**
 * Entity Class 部门
 * @author lhd, lx, npt
 */
public class Department extends BaseBean {

    /**
     * 双亲ID
     */
    private Long parentId;

    /**
     * 部门名称
     */
    private String name;

    public Department() {
    }

    /**
     * set 双亲ID(parentId)
     * @return
     */
    public Long getParentId() {
        return this.parentId;
    }

    /**
     * get 双亲ID(parentId)
     * @param parentId
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * set 部门名称(name)
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * get 部门名称(name)
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}