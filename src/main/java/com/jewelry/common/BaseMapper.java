package com.jewelry.common;

import java.util.List;

/**
 * Created by xiao on 2018/4/26.
 */
public interface BaseMapper<T> {

    /**
     * 获取单条数据
     *
     * @param id
     * @return
     */
    public T get(Integer id);

    /**
     * 获取单条数据
     *
     * @param entity
     * @return
     */
    public T get(T entity);

    /**
     * 查询数据列表，如果需要分页，请设置分页对象，如：entity.setPage(new Page<T>());
     *
     * @param entity
     * @return
     */
    public List<T> findList(T entity);

    /**
     * 查询所有数据列表
     *
     * @return
     * @see public List<T> findAllList(T entity)
     */
    @Deprecated
    public List<T> findAllList();

    /**
     * 插入数据
     *
     * @param entity
     * @return
     */
    public int insert(T entity);

    /**
     * 更新数据
     *
     * @param entity
     * @return
     */
    public int update(T entity);

    /**
     * 删除数据（一般为逻辑删除，更新状态字段为1s）
     *
     * @param entity
     * @return
     */
    public int delete(T entity);

}