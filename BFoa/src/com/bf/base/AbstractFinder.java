package com.bf.base;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bf.common.PageView;
import com.bf.dao.Ifinder;

/**
 * ≤È—Ø≥ÈœÛ¿‡
 * @author Administrator
 *
 */
@Service
public class AbstractFinder<T> implements BaseFinder<T> {
	@Resource(name="ifinderImpl")
    private Ifinder<T> ifinder;
	
	public List<T> findAll(Class<T> entityClass, String xql) {
		return ifinder.findAll(entityClass, xql);
	}

	public T findById(Class<T> entityClass, Serializable id) {
		return ifinder.findById(entityClass, id);
	}

	public PageView<T> findByPage(Class<T> entityClass, String xql, int pageNo, int pageSize) {
		return ifinder.findByPage(entityClass, xql, pageNo, pageSize);
	}

	public PageView<T> findByPage(Class<T> entityClass, String xql, Object key, int pageNo, int pageSize) {
		return ifinder.findByPage(entityClass, xql, key, pageNo, pageSize);
	}

	public PageView<T> findByPage(Class<T> entityClass, String xql, Object[] keys, int pageNo, int pageSize) {
		return ifinder.findByPage(entityClass, xql, keys, pageNo, pageSize);
	}

}
