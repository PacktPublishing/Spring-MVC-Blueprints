package org.packt.human.resource.portal.service;

import java.util.List;

import org.packt.human.resource.portal.model.data.HrmsNews;

public interface NewsService {

	public List<HrmsNews> readAllNews();
}
