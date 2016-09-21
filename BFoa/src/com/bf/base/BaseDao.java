package com.bf.base;

import java.io.Serializable;
import java.util.Collection;

/**
 * 统一的增删改
 * @author Administrator
 * 
 */
public interface BaseDao {
	/**
	 * 添加一个对象
	 * @param obj
	 */
	public void save(Object obj);
	/**
	 * 添加多个对象
	 * @param obj
	 */
	public void save(Object[] objs);
	/**
	 * 添加集合
	 */
	public <T> void save(Collection<T> objs);
	/**
	 * 单个删除
	 */
	public <T> void remove(Class<T> entityClass,Serializable id);
	/**
	 * 删除多个
	 */
	public void remove(Object[] ids);
	/**
	 * 删除集合
	 */
	public <T> void remove(Collection<T> objects);
	/**
	 * 修改单个对象
	 */
	public void update(Object obj);
	/**
	 * 修改多个对象
	 */
	public void update(Object[] objs);
	/**
	 * 修改集合中的多个对象
	 */
	public <T> void update(Collection<T> objs);
	/**
	 * 保存并修改数组中的一个对象
	 */
	public void saveOrUpdate(Object obj);
	/**
	 * 保存并修改多个对象
	 */
	public void saveOrUpdate(Object[] objs);
	/**
	 * 保存并修改集合中的多个对象
	 */
	public <T> void saveOrUpdate(Collection<T> objs); 
	
	/**
	 * 逻辑删除 
	 **/
	public <T> void deleteByLogic(Class<T> entity,Serializable[] ids,String id,String flag);
	
}
