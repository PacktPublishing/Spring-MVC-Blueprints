package org.packt.erp.modules.jaxb.adapter;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.packt.erp.modules.model.data.Catalog;
@XmlRootElement
public class ListCatalogAdapter {

	private List<Catalog> catList = new ArrayList<>();

	public List<Catalog> getCatList() {
		return catList;
	}

	public void setCatList(List<Catalog> catList) {
		this.catList = catList;
	}

	
}
