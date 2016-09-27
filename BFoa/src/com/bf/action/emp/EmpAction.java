package com.bf.action.emp;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.bf.common.PageView;
import com.bf.po.dep.Department;
import com.bf.po.emp.Employee;
import com.bf.service.dep.DepServiceFinder;
import com.bf.service.emp.EmpService;
import com.bf.service.emp.EmpServiceFinder;

public class EmpAction {
	                  
	@Resource(name = "depServiceFinderImple")
	private DepServiceFinder dfr;
	
	@Resource(name = "empServiceFindersImpl")
	private EmpServiceFinder efr;
	
	@Resource(name = "empServiceImpl")
	private EmpService ef;
	
	//上传的文件
	private File image;
	//上传文件的名称
	private String imageFileName;
	
	private Employee emp = new Employee();
	
	//部门ID
	private String depId;
	

	//显示用户信息
	public String execute(){
		//得到员工的分页信息
		HttpServletRequest request = ServletActionContext.getRequest();
		int pageSize = 2;
		int pageNo = 0;
		String pageNo_str = request.getParameter("pager.offset");
		if(pageNo_str != null){
			pageNo = Integer.parseInt(pageNo_str);
		}
		PageView<Employee> pv = efr.findByPage(Employee.class, "from Employee e", pageNo, pageSize);
		request.setAttribute("pv", pv);
		
		//得到父部门的所有信息
		List<Department> deps = dfr.findAll(Department.class, "from Department d where d.parent = null");
		ServletActionContext.getRequest().setAttribute("deps", deps);
		return "index";
		
	}

	//添加员工信息
	public String addEmp(){
		if(image != null){
			String realPath = ServletActionContext.getServletContext().getRealPath("/web/imgs/emp");
			System.out.println(realPath);
			//得到目标文件
			File saveFile = new File(new File(realPath), imageFileName);
			if(!saveFile.getParentFile().exists()){
				saveFile.getParentFile().mkdirs();
			}
			try {
				FileUtils.copyFile(image, saveFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
			int dep_id = 0;
			if(depId != null){
				dep_id = Integer.parseInt(depId);
			}
			emp.setDep(dfr.findById(Department.class, dep_id));
			emp.setEmp_img("web/imgs/emp"+imageFileName);
			ef.save(emp);
		}
		
		return "addEmp";
	}

	public File getImage() {
		return image;
	}

	public void setImage(File image) {
		this.image = image;
	}

	public String getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public String getDepId() {
		return depId;
	}

	public void setDepId(String depId) {
		this.depId = depId;
	}
	
	
}
