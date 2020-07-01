package com.kevin.quick.common.dao.dao;

import com.kevin.quick.common.dao.bean.Page;
import com.kevin.quick.common.dao.bean.PageParam;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;
import java.util.Map;

/**
 * 数据访问层基础支撑
 *
 * @author wangyong
 */
public interface BaseDao<T> {


    /**
     * 函数功能说明 ：单条插入数据. 修改者名字：Along 修改日期： 2016-5-11 修改内容：
     *
     * @throws
     * @参数：@param entity
     * @参数：@return
     * @return：int
     */
    int insert(T entity);

    /**
     * 函数功能说明 ： 批量插入数据. 修改者名字：Along 修改日期： 2016-5-11 修改内容：
     *
     * @throws
     * @参数：@param list
     * @参数：@return
     * @return：int
     */
    int insert(List<T> list);

    /**
     * 函数功能说明 ：根据id单条更新数据. 修改者名字： Along 修改日期： 2016-5-11 修改内容：
     *
     * @throws
     * @参数：@param entity
     * @参数：@return
     * @return：int
     */
    int update(T entity);

    /**
     * 函数功能说明 ： 根据id批量更新数据. 修改者名字：Along 修改日期： 2016-5-11 修改内容：
     *
     * @throws
     * @参数：@param list
     * @参数：@return
     * @return：int
     */
    int update(List<T> list);

    /**
     * 函数功能说明 ： 根据column批量更新数据. 修改者名字： Along 修改日期： 2016-5-11 修改内容：
     *
     * @throws
     * @参数：@param paramMap
     * @参数：@return
     * @return：int
     */
    int update(Map<String, Object> paramMap);

    /**
     * 函数功能说明 ： 根据id查询数据. 修改者名字： Along 修改日期： 2016-5-11 修改内容：
     *
     * @throws
     * @参数：@param id
     * @参数：@return
     * @return：T
     */
    T getById(String id);

    /**
     * 函数功能说明 ： 根据column查询数据. 修改者名字： Along 修改日期： 2016-5-11 修改内容：
     *
     * @throws
     * @参数：@param paramMap
     * @参数：@return
     * @return：T
     */
    public T getByColumn(Map<String, Object> paramMap);

    /**
     * 根据条件查询 listBy: <br/>
     *
     * @param paramMap
     * @return 返回实体
     */
    public T getBy(Map<String, Object> paramMap);

    /**
     * 根据条件查询列表数据.
     */
    public List<T> listBy(Map<String, Object> paramMap);

    /**
     * 函数功能说明 ： 根据column查询列表数据. 修改者名字： Along 修改日期： 2016-5-11 修改内容：
     *
     * @throws
     * @参数：@param paramMap
     * @参数：@return
     * @return：List<T>
     */
    List<T> listByColumn(Map<String, Object> paramMap);

    /**
     * 函数功能说明 ： 根据column查询记录数. 修改者名字： Along 修改日期： 2016-1-9 修改内容：
     *
     * @throws
     * @参数：@param paramMap
     * @参数：@return
     * @return：Long
     */
    Long getCountByColumn(Map<String, Object> paramMap);

    /**
     * 函数功能说明 ： 根据id删除数据. 修改者名字： Along 修改日期： 2016-5-11 修改内容：
     *
     * @throws
     * @参数：@param id
     * @参数：@return
     * @return：int
     */
    int delete(String id);

    /**
     * 函数功能说明 ： 根据id批量删除数据. 修改者名字： Along 修改日期： 2016-5-11 修改内容：
     *
     * @throws
     * @参数：@param list
     * @参数：@return
     * @return：int
     */
    int delete(List<T> list);

    /**
     * 函数功能说明 ： 根据column批量删除数据. 修改者名字：Along 修改日期： 2016-5-11 修改内容：
     *
     * @throws
     * @参数：@param paramMap
     * @参数：@return
     * @return：int
     */
    int delete(Map<String, Object> paramMap);

    /**
     * 函数功能说明 ： 分页查询数据 . 修改者名字： Along 修改日期： 2016-5-11 修改内容：
     *
     * @throws
     * @参数：@param pageParam
     * @参数：@param paramMap
     * @参数：@return
     * @return：PageBean
     */
    Page listPage(PageParam pageParam, Map<String, Object> paramMap);

    SqlSessionTemplate getSessionTemplate();
}
