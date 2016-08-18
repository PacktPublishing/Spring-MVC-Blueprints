package org.packt.erp.modules.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.packt.erp.modules.dao.PaymentApDao;
import org.packt.erp.modules.model.data.PaymentAp;
import org.packt.erp.modules.model.data.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class PaymentApDaoImpl implements PaymentApDao {
	
	@PersistenceContext(unitName="erpPersistencyAR")
	private EntityManager entityManagerFactoryAR;

	@Override
	public List<PaymentAp> getPaymentApp() {
		String sql = "SELECT p FROM PaymentAp p";
		TypedQuery<PaymentAp> query = entityManagerFactoryAR.createQuery(sql, PaymentAp.class);
			
		return query.getResultList();
	}

}
