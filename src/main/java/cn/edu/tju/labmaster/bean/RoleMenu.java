package cn.edu.tju.labmaster.bean;

import cn.edu.tju.labmaster.bean.base.BaseBean;

import java.util.Date;

/**
 * Entity Class 角色菜单对应关系表
 * @author lhd, lx, npt
 */
public class RoleMenu extends BaseBean {

    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 菜单ID
     */
    private Long menuId;

    public RoleMenu() {
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

    /**
     * set 菜单ID(menuId)
     * @return
     */
    public Long getMenuId() {
        return this.menuId;
    }

    /**
     * get 菜单ID(menuId)
     * @param menuId
     */
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }
}