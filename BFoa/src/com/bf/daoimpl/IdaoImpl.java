package com.bf.daoimpl;

import java.io.Serializable;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

import com.bf.dao.Idao;
@Service
public class IdaoImpl extends HibernateDaoSupport implements Idao {

	public <T> void remove(Class<T> entityClass, Serializable id) {
		getHibernateTemplate().delete(getHibernateTemplate().load(entityClass, id));
	}

	public void remove(Object obj) {
		getHibernateTemplate().delete(obj);
	}

	public void save(Object obj) {
		getHibernateTemplate().save(obj);
	}

	public void saveOrUpdate(Object entity) {
		getHibernateTemplate().saveOrUpdate(entity);
	}

	public void update(Object obj) {
		getHibernateTemplate().update(obj);
	}
	
	public <T> void deleteByLogic(Class<T> entity,Serializable[] ids,String id,String flag) {
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<ids.length;i++) {
			sb.append("?").append(",");
		}
		//删除最后一个逗号
		sb.deleteCharAt(sb.length()-1);
		String className = entity.getName();
		//update className o set flag = 0 where o.id in (ids);
		Query query = getSession().createQuery(
				"update " + className + " o set o." + flag + "=? where o."
						+ id + " in(" + sb.toString() + ")");
		query.setParameter(0, 0);
		for(int i=0;i<ids.length;i++) {
			query.setParameter(i+1,ids[i]);
		}
		query.executeUpdate();

	}
	@Resource(name = "sessionFactory")
	public void setSuperSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}
   
}
