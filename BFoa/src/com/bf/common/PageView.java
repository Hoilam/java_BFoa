package com.bf.common;

import java.util.List;
/**
 * 封装的分页对象
 * @author Administrator
 *
 * @param <T>
 */
public class PageView<T> {
	private List<T> pageList;

	private int totalNo;
	//当前页码
	private int pageNo;
	//每页显示的条数
	private int pageSize;
	
	//得到总页数
	public int getTotalPage() {
		int totalPage = 0;
		if(totalNo%pageSize==0) {
			totalPage = totalNo/pageSize;
		} else {
			totalPage = totalNo/pageSize+1;
		}
		return totalPage;
	}
	
	//得到前一页
	public int getPreviousPageNo() {
		if(pageNo<=1) {
			return pageNo;
		} else {
			return pageNo-1;
		}
	}
	//得到下一页
	public int getNextPageNo() {
		if(pageNo>=getTotalPage()){
			return getTotalPage();
		}else {
			return pageNo+1;
		}
	} 
	//得到最后页
	public int getBackPageNo(){
		return getTotalPage();
	}

	public List<T> getPageList() {
		return pageList;
	}

	public void setPageList(List<T> pageList) {
		this.pageList = pageList;
	}

	public int getTotalNo() {
		return totalNo;
	}

	public void setTotalNo(int totalNo) {
		this.totalNo = totalNo;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
