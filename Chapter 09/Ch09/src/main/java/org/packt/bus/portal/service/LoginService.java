package org.packt.bus.portal.service;

import org.packt.bus.portal.model.data.CustomerInfo;

public interface LoginService {
	
	public int validateUser(String username);
    public CustomerInfo getCustomerInfo(Integer id);
}
