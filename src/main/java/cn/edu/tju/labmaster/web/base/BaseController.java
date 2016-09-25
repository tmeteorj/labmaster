package cn.edu.tju.labmaster.web.base;

import cn.edu.tju.labmaster.bean.base.BaseBean;
import cn.edu.tju.labmaster.common.Page;
import cn.edu.tju.labmaster.enums.EmDeletedMark;
import cn.edu.tju.labmaster.service.base.BaseService;

import java.io.Serializable;

public abstract class BaseController <T extends BaseBean, KEY extends Serializable> {

    protected abstract BaseService<T, KEY> getService();

    /**
     * Save
     * @param t Entity
     * @return Affected rows
     */
    protected Integer baseSave(T t){
        if (t.getId() == null) { // insert
            t.setDeletedMark(EmDeletedMark.VALID.getCode());
            return getService().insertEntry(t);
        } else {    // update
            return getService().updateByKey(t);
        }
    }

    /**
     * Delete By Keys (non-physical deletion)
     * @param keys Primary keys
     * @return Affected rows
     */
    protected Integer baseDelete(KEY... keys){
        Integer affectedRows = 0;
        for (KEY key : keys){
            T t = getService().selectByKey(key);
            t.setDeletedMark(EmDeletedMark.INVALID.getCode());
            affectedRows += getService().updateByKey(t);
        }
        return affectedRows;
    }

    /**
     * View a single entity
     * @param key Primary keys
     * @return An entity
     */
    protected T baseView(KEY key){
        return getService().selectByKey(key);
    }

    /**
     * View a list of entities
     * @param t Entity
     * @return A page contains a list of Entity
     */
    public Page<T> baseList(T t, Page<T> page){
        return getService().selectPage(t, page);
    }
}