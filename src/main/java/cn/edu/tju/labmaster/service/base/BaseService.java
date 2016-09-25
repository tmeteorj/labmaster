package cn.edu.tju.labmaster.service.base;

import cn.edu.tju.labmaster.bean.base.BaseBean;
import cn.edu.tju.labmaster.common.Page;
import cn.edu.tju.labmaster.dao.base.BaseDao;

import java.io.Serializable;
import java.util.List;

public abstract class BaseService <T extends BaseBean, KEY extends Serializable> {

    protected abstract BaseDao<T, KEY> getDao();

    /**
     * Add
     * @param t Entity
     * @return Affected rows
     */
    public Integer insertEntry(T t){
        return getDao().insertEntry(t);
    }

    /**
     * Delete By Keys
     * @param keys Primary keys
     * @return Affected rows
     */
    public Integer deleteByKey(KEY... keys){
        return getDao().deleteByKey(keys);
    }

    /**
     * Delete By Condition
     * @param t Entity
     * @return Affected rows
     */
    public Integer deleteByCondition(T t){
        return getDao().deleteByCondition(t);
    }

    /**
     * Update By Key
     * @param t Entity
     * @return Affected rows
     */
    public Integer updateByKey(T t){
        return getDao().updateByKey(t);
    }

    /**
     * Select By Key
     * @param key Primary keys
     * @return An entity
     */
    public T selectByKey(KEY key){
        return getDao().selectByKey(key);
    }

    /**
     * Select By Condition
     * @param t Entity
     * @return A list of entities
     */
    public List<T> selectByCondition(T t){
        return getDao().selectByCondition(t);
    }

    /**
     * Select Count By Condition
     * @param t Entity
     * @return Total count
     */
    public Integer selectCountByCondition(T t){
        return getDao().selectCountByCondition(t);
    }

    /**
     * Select By Pagination
     * @param t Entity
     * @return A page contains a list of entities
     */
    public Page<T> selectPage(T t, Page<T> page){
        t.setOffset(page.getOffset());
        t.setLimit(page.getLimit());
        Integer totalSize = this.selectCountByCondition(t);
        if (totalSize == null || totalSize <= 0){
            return page;
        }
        page.setTotalSize(totalSize);
        page.setContent(this.selectByCondition(t));
        return page;
    }
}