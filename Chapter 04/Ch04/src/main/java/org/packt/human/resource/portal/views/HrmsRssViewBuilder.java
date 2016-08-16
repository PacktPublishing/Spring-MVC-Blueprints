package org.packt.human.resource.portal.views;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.packt.human.resource.portal.model.data.HrmsNews;
import org.springframework.web.servlet.view.feed.AbstractRssFeedView;

import com.rometools.rome.feed.rss.Channel;
import com.rometools.rome.feed.rss.Content;
import com.rometools.rome.feed.rss.Item;




public class HrmsRssViewBuilder extends AbstractRssFeedView{
	
	@Override
	protected void buildFeedMetadata(Map<String, Object> model, Channel feed,
		HttpServletRequest request) {
		
		feed.setTitle("HRMS News Feeds");
		feed.setDescription("Packt Publishing's Spring MVC Blueprint");
		feed.setLink("https://www.packtpub.com/");
		
		super.buildFeedMetadata(model, feed, request);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected List<Item> buildFeedItems(Map<String, Object> model,
			HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		// get data model which is passed by the Spring container
		List<HrmsNews> news = (List<HrmsNews>) model.get("allNews");
        List<Item> items = new ArrayList<Item>(news.size());
	 	
		for(HrmsNews topic : news ){
		
			Item item = new Item();
			
			Content content = new Content();
			content.setValue(topic.getSummary());
			item.setContent(content);
			
			item.setTitle(topic.getDescription());
			item.setLink(topic.getLink());
			item.setPubDate(new Date());
			
			items.add(item);
		}
		
		return items;
	}

	
	
}
