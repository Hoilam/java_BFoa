package com.bf.base;

import java.io.Serializable;
import java.util.List;

import com.bf.common.PageView;

/**
 * 查询
 * @author Administrator
 *
 */
public interface BaseFinder<T> {
	/**
	 * 按ID查询
	 * @param entityClass
	 * @param id
	 * @return
	 */
   public T findById(Class<T> entityClass,Serializable id);
   /**
    * 查询
    * @param entityClass
    * @param xql
    * @return
    */
   public List<T> findAll(Class<T> entityClass,String xql);
   
   /**
    * 不带条件的分页查询
    * @param entityClass
    * @param xql
    * @param pageNo
    * @param pageSize
    * @return
    */
   
   public PageView<T> findByPage(Class<T> entityClass,String xql,int pageNo,int pageSize);
   /**
    * 带条件的分页查询
    * @param entityClass
    * @param xql
    * @param key
    * @param pageNo
    * @param pageSize
    * @return
    */
   
   public PageView<T> findByPage(Class<T> entityClass,String xql,Object key,int pageNo,int pageSize);
   /**
    * 带多个条件的查询
    * @param entityClass
    * @param xql
    * @param keys
    * @param pageNo
    * @param pageSize
    * @return
    */
   public PageView<T> findByPage(Class<T> entityClass,String xql,Object[] keys,int pageNo,int pageSize);
   
   
   
   
}
  