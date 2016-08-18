package org.packt.online.cart.portal.dao;

import org.packt.online.cart.portal.model.data.BillingAddress;

public interface BillingDetailsDao {
	
	public void setBillingAddress(BillingAddress ba);
	public void getBillingAddress(String userId);

}
