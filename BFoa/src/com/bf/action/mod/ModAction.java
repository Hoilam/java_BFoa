package com.bf.action.mod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.bf.service.mod.ModServiceFinder;

public class ModAction {
	
	@Resource(name = "modServiceFinderImpl")
	private ModServiceFinder msf;
	
	//分页显示模块
	public String execute(){
		//显示父模块单击父模块显示子模块
		HttpServletRequest request = ServletActionContext.getRequest();
		int mid = 0;
		String mid_str = request.getParameter("mid");
		
		
		return "index";
		
	}

}
