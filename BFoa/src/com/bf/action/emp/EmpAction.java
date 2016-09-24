package com.bf.action.emp;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;

import com.bf.po.dep.Department;
import com.bf.service.dep.DepServiceFinder;

public class EmpAction {
	                  
	@Resource(name = "depServiceFinderImple")
	private DepServiceFinder dfr;

	//显示用户信息
	public String execute(){
		//得到员工的分页信息
		//得到父部门的所有信息
		List<Department> deps = dfr.findAll(Department.class, "from Department d where d.parent = null");
		ServletActionContext.getRequest().setAttribute("deps", deps);
		return "index";
		
	}
}
