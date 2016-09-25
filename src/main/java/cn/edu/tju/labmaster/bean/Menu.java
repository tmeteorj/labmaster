package cn.edu.tju.labmaster.bean;

import cn.edu.tju.labmaster.bean.base.BaseBean;

import java.util.Date;

/**
 * Entity Class 菜单
 * @author lhd, lx, npt
 */
public class Menu extends BaseBean {

    /**
     * 双亲ID
     */
    private Long parentId;

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 链接
     */
    private String url;

    /**
     * 层级
     */
    private Integer level;

    public Menu() {
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
     * set 菜单名称(name)
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * get 菜单名称(name)
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * set 描述(description)
     * @return
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * get 描述(description)
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * set 链接(url)
     * @return
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * get 链接(url)
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * set 层级(level)
     * @return
     */
    public Integer getLevel() {
        return this.level;
    }

    /**
     * get 层级(level)
     * @param level
     */
    public void setLevel(Integer level) {
        this.level = level;
    }
}