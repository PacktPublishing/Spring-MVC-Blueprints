package org.packt.human.resource.portal.views;

import java.util.List;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRAbstractBeanDataSourceProvider;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import org.packt.human.resource.portal.model.data.HrmsLogin;

public class AdminJasperDataSource extends JRAbstractBeanDataSourceProvider {

	
	private List<HrmsLogin> userList;

	public AdminJasperDataSource(List<HrmsLogin> userList) {
		super(HrmsLogin.class);
		this.userList = userList;
	}

	@Override
	public JRDataSource create(JasperReport jrReport) throws JRException {

	
		return new JRBeanCollectionDataSource(userList);
	}


	@Override
	public void dispose(JRDataSource jrds) throws JRException {
		userList.clear();
		userList= null;
	}

}
