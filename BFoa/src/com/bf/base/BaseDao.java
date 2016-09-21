package com.bf.base;

import java.io.Serializable;
import java.util.Collection;

/**
 * ͳһ����ɾ��
 * @author Administrator
 * 
 */
public interface BaseDao {
	/**
	 * ���һ������
	 * @param obj
	 */
	public void save(Object obj);
	/**
	 * ��Ӷ������
	 * @param obj
	 */
	public void save(Object[] objs);
	/**
	 * ��Ӽ���
	 */
	public <T> void save(Collection<T> objs);
	/**
	 * ����ɾ��
	 */
	public <T> void remove(Class<T> entityClass,Serializable id);
	/**
	 * ɾ�����
	 */
	public void remove(Object[] ids);
	/**
	 * ɾ������
	 */
	public <T> void remove(Collection<T> objects);
	/**
	 * �޸ĵ�������
	 */
	public void update(Object obj);
	/**
	 * �޸Ķ������
	 */
	public void update(Object[] objs);
	/**
	 * �޸ļ����еĶ������
	 */
	public <T> void update(Collection<T> objs);
	/**
	 * ���沢�޸������е�һ������
	 */
	public void saveOrUpdate(Object obj);
	/**
	 * ���沢�޸Ķ������
	 */
	public void saveOrUpdate(Object[] objs);
	/**
	 * ���沢�޸ļ����еĶ������
	 */
	public <T> void saveOrUpdate(Collection<T> objs); 
	
	/**
	 * �߼�ɾ�� 
	 **/
	public <T> void deleteByLogic(Class<T> entity,Serializable[] ids,String id,String flag);
	
}
