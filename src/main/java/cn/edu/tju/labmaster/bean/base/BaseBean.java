package cn.edu.tju.labmaster.bean.base;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BaseBean extends BaseQuery{

    /**
     * Primary Key
     */
    private Long id;

    /**
     * Remark
     */
    private String remark;

    /**
     * Created Time
     */
    private Date metaCreated;

    /**
     * Updated Time
     */
    private Date metaUpdated;

    /**
     * Deleted Mark
     */
    private Integer deletedMark;

    /**
     * Extra data for query
     */
    private Map<String, String> extraMap;

    public BaseBean() {
        this.extraMap = new HashMap<String, String>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getMetaCreated() {
        return metaCreated;
    }

    public void setMetaCreated(Date metaCreated) {
        this.metaCreated = metaCreated;
    }

    public Date getMetaUpdated() {
        return metaUpdated;
    }

    public void setMetaUpdated(Date metaUpdated) {
        this.metaUpdated = metaUpdated;
    }

    public Integer getDeletedMark() {
        return deletedMark;
    }

    public void setDeletedMark(Integer deletedMark) {
        this.deletedMark = deletedMark;
    }

    public Map<String, String> getExtraMap() {
        return extraMap;
    }

    public void setExtraMap(Map<String, String> extraMap) {
        this.extraMap = extraMap;
    }
}