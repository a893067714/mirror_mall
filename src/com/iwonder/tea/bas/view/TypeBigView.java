package com.iwonder.tea.bas.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.iwonder.tea.bas.entity.TypeBig;

public class TypeBigView extends TypeBig implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private List<TypeDetailQueryView> listTypeDetail = new ArrayList<>() ;

	public List<TypeDetailQueryView> getListTypeDetail() {
		return listTypeDetail;
	}

	public void setListTypeDetail(List<TypeDetailQueryView> listTypeDetail) {
		this.listTypeDetail = listTypeDetail;
	}

	@Override
	public String toString() {
		return "TypeBigView [listTypeDetail=" + listTypeDetail + "]";
	}
	
	

}
