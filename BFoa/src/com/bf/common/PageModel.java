package com.bf.common;

public class PageModel {
	private int totalPage;

	private int previousPageNo;

	private int nextPageNo;

	public int getNextPageNo() {
		return nextPageNo;
	}

	public void setNextPageNo(int nextPageNo) {
		this.nextPageNo = nextPageNo;
	}

	public int getPreviousPageNo() {
		return previousPageNo;
	}

	public void setPreviousPageNo(int previousPageNo) {
		this.previousPageNo = previousPageNo;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

}
