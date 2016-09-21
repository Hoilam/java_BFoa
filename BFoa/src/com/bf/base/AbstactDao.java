package com.bf.base;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bf.dao.Idao;
@Service
public abstract class AbstactDao implements BaseDao {
	@Resource(name = "idaoImpl")
	private Idao idao;

	public <T> void remove(Class<T> entityClass, Serializable id) {
		idao.remove(entityClass, id);
	}

	public <T> void remove(Collection<T> objects) {
		for (Object obj : objects) {
			idao.remove(obj);
		}
	}

	public void remove(Object[] ids) {
		for (Object obj : ids) {
			idao.remove(obj);
		}
	}

	public <T> void save(Collection<T> objs) {
		for (Object obj : objs) {
			idao.save(obj);
		}
	}

	public void save(Object obj) {
		idao.save(obj);
	}

	public void save(Object[] objs) {
		for (Object obj : objs) {
			idao.save(obj);
		}
	}

	public <T> void saveOrUpdate(Collection<T> objs) {
		for (Object obj : objs) {
			idao.saveOrUpdate(obj);
		}
	}

	public void saveOrUpdate(Object obj) {
		idao.saveOrUpdate(obj);
	}

	public void saveOrUpdate(Object[] objs) {
		for (Object obj : objs) {
			idao.saveOrUpdate(obj);
		}
	}

	public <T> void update(Collection<T> objs) {
		for (Object obj : objs) {
			idao.update(obj);
		}
	}

	public void update(Object obj) {
		idao.update(obj);
	}

	public void update(Object[] objs) {
		for (Object obj : objs) {
			idao.update(obj);
		}
	}
	
	public <T> void deleteByLogic(Class<T> entity,Serializable[] ids,String id,String flag){
		idao.deleteByLogic(entity, ids, id, flag);
	}
	
	

}
