package com.bf.base;

import java.io.Serializable;
import java.util.List;

import com.bf.common.PageView;

/**
 * ��ѯ
 * @author Administrator
 *
 */
public interface BaseFinder<T> {
	/**
	 * ��ID��ѯ
	 * @param entityClass
	 * @param id
	 * @return
	 */
   public T findById(Class<T> entityClass,Serializable id);
   /**
    * ��ѯ
    * @param entityClass
    * @param xql
    * @return
    */
   public List<T> findAll(Class<T> entityClass,String xql);
   
   /**
    * ���������ķ�ҳ��ѯ
    * @param entityClass
    * @param xql
    * @param pageNo
    * @param pageSize
    * @return
    */
   
   public PageView<T> findByPage(Class<T> entityClass,String xql,int pageNo,int pageSize);
   /**
    * �������ķ�ҳ��ѯ
    * @param entityClass
    * @param xql
    * @param key
    * @param pageNo
    * @param pageSize
    * @return
    */
   
   public PageView<T> findByPage(Class<T> entityClass,String xql,Object key,int pageNo,int pageSize);
   /**
    * ����������Ĳ�ѯ
    * @param entityClass
    * @param xql
    * @param keys
    * @param pageNo
    * @param pageSize
    * @return
    */
   public PageView<T> findByPage(Class<T> entityClass,String xql,Object[] keys,int pageNo,int pageSize);
   
   
   
   
}
  