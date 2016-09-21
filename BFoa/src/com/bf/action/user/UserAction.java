package com.bf.action.user;

import javax.annotation.Resource;

import com.bf.common.PageModel;
import com.bf.common.PageView;
import com.bf.po.user.User;
import com.bf.service.user.UserService;
import com.bf.service.user.UserServiceFinder;

public class UserAction {
	private String name;

	private String pwd;
	
	private PageView<User> pv;
	
	private String page;
	
	private PageModel pm;

	
	@Resource(name="userServiceImpl")
	private UserService us;
	
	@Resource(name="userServiceFinderImpl")
	private UserServiceFinder<User> uf;
	
	public String execute() {
		System.out.println(name);
		User user = new User();
		user.setName(name);
		user.setPwd(pwd);
		us.save(user);
		return "success";
	}
	//∑÷“≥≤È—Ø
	public String findByPage() {
		int pageSize = 3;
		int pageNo = 1;
		if(page!=null) {
			pageNo = Integer.parseInt(page);
		}
		pv = uf.findByPage(User.class, "from User u", pageNo, pageSize);
		pv.setPageNo(pageNo);
		pv.setPageSize(pageSize);
		pm = new PageModel();
		pm.setTotalPage(pv.getTotalPage());
		pm.setPreviousPageNo(pv.getPreviousPageNo());
		pm.setNextPageNo(pv.getNextPageNo());
		return "findByPage";
	}

	public PageView<User> getPv() {
		return pv;
	}

	public void setPv(PageView<User> pv) {
		this.pv = pv;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public PageModel getPm() {
		return pm;
	}
	public void setPm(PageModel pm) {
		this.pm = pm;
	}
}
