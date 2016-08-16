package org.packt.human.resource.portal.service.impl;

import java.util.List;

import org.packt.human.resource.portal.dao.NewsDao;
import org.packt.human.resource.portal.model.data.HrmsNews;
import org.packt.human.resource.portal.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NewsServiceImpl implements NewsService {

	@Autowired
	private NewsDao newsDao;
	
	@Transactional
	@Override
	public List<HrmsNews> readAllNews() {
		// TODO Auto-generated method stub
		return newsDao.getNews();
	}

}
