package com.bf.dao;

import java.io.Serializable;

public interface Idao {
	/**
	 * ���һ������
	 * @param obj
	 */
   public void save(Object obj);
   /**
    * ɾ������
    */
   public <T> void remove(Class<T> entityClass,Serializable id);
   /**
    * ֱ��ɾ������
    * @param obj
    */
   public void remove(Object obj);
   /**
    * �޸Ķ���
    * @param obj
    */
   public void update(Object obj);
   /**
    * ���沢�޸Ķ���
    */
   public void saveOrUpdate(Object entity);
   
   /**
    * �����߼�ɾ�� 
    **/
   public <T> void deleteByLogic(Class<T> entity,Serializable[] ids,String id, String flag);

}


