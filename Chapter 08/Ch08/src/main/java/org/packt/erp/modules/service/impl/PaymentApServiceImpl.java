package org.packt.erp.modules.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.packt.erp.modules.dao.PaymentApDao;
import org.packt.erp.modules.model.data.PaymentAp;
import org.packt.erp.modules.service.PaymentApService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentApServiceImpl implements PaymentApService {
	
	@Autowired
	private PaymentApDao paymentApDao;

	@Override
	public List<PaymentAp> getAllPaymentModes() {
		List<PaymentAp> modes = paymentApDao.getPaymentApp();
		return modes;
	}

}
