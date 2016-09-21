package com.bf.daoimpl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

import com.bf.common.PageView;
import com.bf.dao.Ifinder;
@Service
public class IfinderImpl<T> extends HibernateDaoSupport implements Ifinder<T> {

	public List<T> findAll(Class<T> entityClass, String xql) {
		return getHibernateTemplate().find(xql);
	}

	public T findById(Class<T> entityClass, Serializable id) {
		return (T) getHibernateTemplate().get(entityClass, id);
	}

	public PageView<T> findByPage(Class<T> entityClass, String xql, int pageNo,
			int pageSize) {
		return findByPage(entityClass, xql, null, pageNo,
				pageSize);
	}

	public PageView<T> findByPage(Class<T> entityClass, String xql, Object key,
			int pageNo, int pageSize) {
		return findByPage(entityClass, xql, new Object[] { key }, pageNo,
				pageSize);
	}

	public PageView<T> findByPage(Class<T> entityClass, String xql,
			Object[] keys, int pageNo, int pageSize) {
		PageView<T> pv = new PageView<T>();
		int totalNo = getTotal(xql, keys);
		pv.setTotalNo(totalNo);
		Query query = getSession().createQuery(xql);
		if (keys != null && keys.length > 0) {
			for (int i = 0; i < keys.length; i++) {
				query.setParameter(i, keys[i]);
			}
		}
		query.setFirstResult((pageNo-1)*pageSize).setMaxResults(pageSize);
		List<T> pageList = query.list();
		pv.setPageList(pageList);
		return pv;
	}

	// 得到总条数
	private int getTotal(String xql, Object[] keys) {
		int totalNo = 0;

		// "select name from User user where user.id=? and user.pwd=?";

		String xxql = null;
		int index = xql.indexOf("from");
		if (index != -1) {
			xxql = "select count(*) " + xql.substring(index);
		}
		Query query = getSession().createQuery(xxql);

		// xxql = select count(*) from User user where user.id=? and
		// user.pwd=?";
		if (keys != null && keys.length > 0) {
			for (int i = 0; i < keys.length; i++) {
				query.setParameter(i, keys[i]);
			}
		}
		totalNo = ((Long) query.uniqueResult()).intValue();
		// 查询出没有条件
		return totalNo;
	}
	
	@Resource(name = "sessionFactory")
	public void setSuperSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

}
