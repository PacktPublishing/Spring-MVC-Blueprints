package org.packt.erp.modules.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.packt.erp.modules.dao.AccountReceivableDao;
import org.packt.erp.modules.service.AccountReceivableService;
import org.packt.erp.modules.ws.Invoice;
import org.packt.erp.modules.ws.InvoicedProducts;
import org.packt.erp.modules.ws.PaymentAp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

// Spring WS Implementation
@Service
@Transactional
public class AccountReceivableServiceImpl implements AccountReceivableService {
	
	@Autowired
	AccountReceivableDao accountReceivableDao;

	@Override
	public InvoicedProducts getInvProduct(Integer id) {
		
		InvoicedProducts invProdWS = new InvoicedProducts();
		Invoice invWS = new Invoice();
		PaymentAp paymentWS = new PaymentAp();
		
		invProdWS.setId(accountReceivableDao.getInvoicedProduct(id).getId());
		invProdWS.setCatId(accountReceivableDao.getInvoicedProduct(id).getCatId());
		invProdWS.setInvId(accountReceivableDao.getInvoicedProduct(id).getInvId());
		invWS.setId(accountReceivableDao.getInvoicedProduct(id).getInvoice().getId());
		invWS.setCatId(accountReceivableDao.getInvoicedProduct(id).getInvoice().getCatId());
		invWS.setCustId(accountReceivableDao.getInvoicedProduct(id).getInvoice().getCustId());
		paymentWS.setId(accountReceivableDao.getInvoicedProduct(id).getInvoice().getPaymentAp().getId());
		paymentWS.setTerm(accountReceivableDao.getInvoicedProduct(id).getInvoice().getPaymentAp().getTerm());
		invWS.setDate(null);
		invWS.setPaymentAp(paymentWS);
		invProdWS.setInvoice(invWS);
		return invProdWS;
	}

	@Override
	public List<InvoicedProducts> getInvProducts() {
		List<InvoicedProducts> lists = new ArrayList<>();
		return lists;
	}

	@Override
	public void setInvoicedProduct(InvoicedProducts invoicedProduct) {
		// TODO Auto-generated method stub

	}

}
