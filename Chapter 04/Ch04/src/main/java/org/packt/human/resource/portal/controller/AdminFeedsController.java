package org.packt.human.resource.portal.controller;

import java.util.List;

import org.packt.human.resource.portal.model.data.HrmsNews;
import org.packt.human.resource.portal.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminFeedsController {
	@Autowired
	private NewsService newsService;
	
	
	
	private List<HrmsNews> newsList;

	@RequestMapping(value="/hrms/rss_feeds", method=RequestMethod.GET)
	public String createRSSFeeds(Model model){
		newsList = newsService.readAllNews();
		model.addAttribute("allNews", newsList);
		return "rss_hrms_feeds";
	}
	
	@RequestMapping(value="/hrms/atom_feeds", method=RequestMethod.GET)
	public String createAtomFeeds(Model model){
		newsList = newsService.readAllNews();
		model.addAttribute("allNews", newsList);
		return "atom_hrms_feeds";
	}


}
