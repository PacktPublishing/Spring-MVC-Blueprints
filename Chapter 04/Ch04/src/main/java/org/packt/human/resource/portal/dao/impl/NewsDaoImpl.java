/**
 * 
 */
package org.packt.human.resource.portal.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.packt.human.resource.portal.dao.NewsDao;
import org.packt.human.resource.portal.model.data.HrmsNews;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author sjctrags
 *
 */
@Repository
public class NewsDaoImpl implements NewsDao {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	/* (non-Javadoc)
	 * @see org.packt.human.resource.portal.dao.NewsDao#getNews()
	 */
	@Transactional
	@Override
	public List<HrmsNews> getNews() {
		Session session = this.sessionFactory.getCurrentSession();
		List<HrmsNews> news = session.createQuery("from HrmsNews").list();
		return news;
	}

}
