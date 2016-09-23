package com.bf.po.emp;

import java.io.Serializable;

import com.bf.po.dep.Department;

public class Employee implements Serializable{

	private int emp_id;
	private String emp_name;
	private String emp_sex;
	private String emp_address;
	private String emp_phone;
	private String emp_job;
	private String emp_img;
	private Department dep;
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public void setEmp_sex(String emp_sex) {
		this.emp_sex = emp_sex;
	}
	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}
	public void setEmp_phone(String emp_phone) {
		this.emp_phone = emp_phone;
	}
	public void setEmp_job(String emp_job) {
		this.emp_job = emp_job;
	}
	public void setEmp_img(String emp_img) {
		this.emp_img = emp_img;
	}
	public void setDep(Department dep) {
		this.dep = dep;
	}
	
	
}
