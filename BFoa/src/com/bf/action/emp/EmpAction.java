package com.bf.action.emp;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;

import com.bf.po.dep.Department;
import com.bf.service.dep.DepServiceFinder;

public class EmpAction {
	                  
	@Resource(name = "depServiceFinderImple")
	private DepServiceFinder dfr;

	//��ʾ�û���Ϣ
	public String execute(){
		//�õ�Ա���ķ�ҳ��Ϣ
		//�õ������ŵ�������Ϣ
		List<Department> deps = dfr.findAll(Department.class, "from Department d where d.parent = null");
		ServletActionContext.getRequest().setAttribute("deps", deps);
		return "index";
		
	}
}