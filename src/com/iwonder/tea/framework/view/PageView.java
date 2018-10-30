package com.iwonder.tea.framework.view;

import java.io.Serializable;
import java.util.ArrayList;

public class PageView implements Serializable {
	private static final long serialVersionUID = 1L;
	// 输入
	int pageIndex;// 当前页(下标 ,从0开始)
	int pageSize;// 每页记录数
	// 输出
	ArrayList list;// 当前页的数据
	int recordCount;// 总记录数
	int pageCount;// 总页数

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public ArrayList getList() {
		return list;
	}

	public void setList(ArrayList list) {
		this.list = list;
	}

	public int getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	@Override
	public String toString() {
		return "PageView [pageIndex=" + pageIndex + ", pageSize=" + pageSize + ", list=" + list + ", recordCount="
				+ recordCount + ", pageCount=" + pageCount + "]";
	}

}
