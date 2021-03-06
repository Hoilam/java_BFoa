package com.bf.action.dep;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;

import com.bf.common.PageView;
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
	public String showTree(){
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
	
	//分页显示信息
	public String findByPage(){
		int pageNo = 0;
		String pageNo_str = ServletActionContext.getRequest().getParameter("pager.offset");
		if (pageNo_str != null) {
			pageNo = Integer.parseInt(pageNo_str);
		}
		int pageSize = 5;
		PageView<Department> pv =null;
		
		if (type != null && !type.equals("")) {
			pv = dfr.findByPage(Department.class, "from Department d where d.dep_name = ?", type, pageNo, pageSize);
		}else {
			pv=dfr.findByPage(Department.class, "from Department d", pageNo, pageSize);
		}
		
		request.put("pv", pv);
		return "findByPage";
		
	}
	
	//得到对应的子部门的信息
	public String execute() throws IOException{
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		//通过pid取到对应的值
		int pid = 0;
		String pid_str = request.getParameter("pid");
		if(pid_str != null){
			pid = Integer.parseInt(pid_str);
		}
		//清缓存
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/xml;charset=utf-8");
		
		//组装xml
		List<Department> subDeps = dfr.findAll(Department.class, "from Department d where d.parent.dep_id="+pid);
		PrintWriter out = response.getWriter();
		out.println("<subDeps>");
		for(Department dep:subDeps){
			out.println("<subDeps>");
			out.println("<subDep-name>"+dep.getDep_name()+"</subDep-name>");
			out.println("</subDeps>");
		}
		out.println("</subDeps>");
		return null;
		
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
