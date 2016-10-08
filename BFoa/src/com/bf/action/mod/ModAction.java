package com.bf.action.mod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.bf.common.PageView;
import com.bf.po.module.Module;
import com.bf.service.mod.ModServiceFinder;

public class ModAction {
	
	@Resource(name = "modServiceFinderImpl")
	private ModServiceFinder msf;
	
	//��ҳ��ʾģ��
	public String execute(){
		//��ʾ��ģ�鵥����ģ����ʾ��ģ��
		HttpServletRequest request = ServletActionContext.getRequest();
		int mid = 0;
		String mid_str = request.getParameter("mid");
		if(mid_str != null){
			mid = Integer.parseInt(mid_str);
		}
		int pageSize = 3;
		int pageNo = 0;
		String pageNo_str = request.getParameter("pager.offset");
		if(pageNo_str != null){
			pageNo = Integer.parseInt(pageNo_str);
		}
		PageView<Module> pv = msf.findPageByFlag(mid, pageNo, pageSize);
		request.setAttribute("pv", pv);

		return "index";
		
	}

}