package com.bf.action.dep;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.interceptor.RequestAware;

import com.bf.po.dep.Department;
import com.bf.service.dep.DepService;
import com.bf.service.dep.DepServiceFinder;

public class DepAction implements RequestAware {

	@Resource(name = "depServiceFinderImple")
	private DepServiceFinder dfr;
	
	@Resource(name = "depServiceImple")
	private DepService df;

	protected Map<String, Object> request;

	private List<Department> deps = new ArrayList<Department>();
	
	private Department department = new Department();
	
	private int depId;
	
	private String type;
	
	// 显示树
	public String execute() {
		deps = dfr
				.findAll(Department.class, "from Department d where d.flag=1");
		request.put("depAll", deps);
		return "index";
	}
	//显示添加界面
	public String showAddDep() {
		deps = dfr
		.findAll(Department.class, "from Department d where d.flag=1");
		return "showAddDep";
	}
	//添加部门
	public String addDep() {
		int pid = department.getDep_id();
		department.setFlag(1);
		df.addDep(department, pid);
		return "addDep";
	}
	//删除部门
	public String deleteDep() {
		df.deleteByLogic(Department.class, new Serializable[]{depId}, "dep_id", "flag");
		return "deleteDep";
	}
	

	
	
	
	public List<Department> getDeps() {
		return deps;
	}
	public void setDeps(List<Department> deps) {
		this.deps = deps;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public void setRequest(Map<String, Object> request) {
        this.request = request;
	}

	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
