package cn.edu.tju.labmaster.bean.base;

import java.io.Serializable;

public class BaseQuery implements Serializable {

    /**
     * Offset when selecting.
     */
    private transient Integer offset;

    /**
     * Limit when selecting.
     */
    private transient Integer limit;

    /**
     * Order by column in database when using <code>order by</code>.
     */
    private transient String orderBy;

    /**
     * The order when using <code>order by</code>. ["ASC" | "DESC"]
     */
    private transient String order;

    public BaseQuery() {
        this.setOrderAscend();
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public void setOrderAscend() {
        this.order = "ASC";
    }

    public void setOrderDescend() {
        this.order = "DESC";
    }
}