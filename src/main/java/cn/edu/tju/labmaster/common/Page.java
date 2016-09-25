package cn.edu.tju.labmaster.common;

import cn.edu.tju.labmaster.bean.base.BaseBean;

import java.util.List;

public class Page <T extends BaseBean> {
    private Integer offset;

    private Integer limit;

    private Integer pageSize;

    private Integer totalSize;

    private List<T> content;

    public Page() {
        this.pageSize = 20;
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

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

    public List<T> getContent() {
        return content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }
}