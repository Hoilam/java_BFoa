package com.bf.dao;

import java.io.Serializable;

public interface Idao {
	/**
	 * 添加一个对象
	 * @param obj
	 */
   public void save(Object obj);
   /**
    * 删除对象
    */
   public <T> void remove(Class<T> entityClass,Serializable id);
   /**
    * 直接删除对象
    * @param obj
    */
   public void remove(Object obj);
   /**
    * 修改对象
    * @param obj
    */
   public void update(Object obj);
   /**
    * 报存并修改对象
    */
   public void saveOrUpdate(Object entity);
   
   /**
    * 物理逻辑删除 
    **/
   public <T> void deleteByLogic(Class<T> entity,Serializable[] ids,String id, String flag);

}


