package com.bf.service.dep;

import com.bf.base.BaseDao;
import com.bf.po.dep.Department;

public interface DepService extends BaseDao {

	//��Ӳ���
	public void addDep(Department dep, int pid);
}
