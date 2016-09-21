package com.bf.common;

import java.util.List;
/**
 * ��װ�ķ�ҳ����
 * @author Administrator
 *
 * @param <T>
 */
public class PageView<T> {
	private List<T> pageList;

	private int totalNo;
	//��ǰҳ��
	private int pageNo;
	//ÿҳ��ʾ������
	private int pageSize;
	
	//�õ���ҳ��
	public int getTotalPage() {
		int totalPage = 0;
		if(totalNo%pageSize==0) {
			totalPage = totalNo/pageSize;
		} else {
			totalPage = totalNo/pageSize+1;
		}
		return totalPage;
	}
	
	//�õ�ǰһҳ
	public int getPreviousPageNo() {
		if(pageNo<=1) {
			return pageNo;
		} else {
			return pageNo-1;
		}
	}
	//�õ���һҳ
	public int getNextPageNo() {
		if(pageNo>=getTotalPage()){
			return getTotalPage();
		}else {
			return pageNo+1;
		}
	} 
	//�õ����ҳ
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
