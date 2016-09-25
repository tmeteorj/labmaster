package cn.edu.tju.labmaster.dao.base;

import java.io.Serializable;
import java.util.List;

/**
 * Base class for Dao. BaseDao<Entity, Primary_Key>
 * @author lhd, lx, npt
 * @param <T> Entity
 * @param <KEY> Primary Key
 */
public interface BaseDao <T, KEY extends Serializable> {

    /**
     * Add
     * @param t Entity
     * @return Affected rows
     */
    int insertEntry(T t);

    /**
     * Delete By Keys
     * @param keys Primary keys
     * @return Affected rows
     */
    int deleteByKey(KEY... keys);

    /**
     * Delete By Condition
     * @param t Entity
     * @return Affected rows
     */
    int deleteByCondition(T t);

    /**
     * Update By Key
     * @param t Entity
     * @return Affected rows
     */
    int updateByKey(T t);

    /**
     * Select By Key
     * @param key Primary keys
     * @return An entity
     */
    T selectByKey(KEY key);

    /**
     * Select By Condition
     * @param t Entity
     * @return A list of entities
     */
    List<T> selectByCondition(T t);

    /**
     * Select Count By Condition
     * @param t Entity
     * @return Total count
     */
    int selectCountByCondition(T t);
}