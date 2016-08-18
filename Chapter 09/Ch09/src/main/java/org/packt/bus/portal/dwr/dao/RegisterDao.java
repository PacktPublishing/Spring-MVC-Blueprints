package org.packt.bus.portal.dwr.dao;

import org.packt.bus.portal.model.data.CustomerInfo;
import org.packt.bus.portal.model.data.Login;

public interface RegisterDao {

	public void setLogin(Login login);
	 public void setCustomerInfo(CustomerInfo customerInfo);
}
