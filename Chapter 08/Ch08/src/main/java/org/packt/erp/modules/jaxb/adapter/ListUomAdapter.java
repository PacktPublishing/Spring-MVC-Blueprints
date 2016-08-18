package org.packt.erp.modules.jaxb.adapter;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.packt.erp.modules.model.data.Uom;

@XmlRootElement
public class ListUomAdapter {
	
	private List<Uom> uomList = new ArrayList<>();

	public List<Uom> getUomList() {
		return uomList;
	}

	public void setUomList(List<Uom> uomList) {
		this.uomList = uomList;
	}
	
	

}
