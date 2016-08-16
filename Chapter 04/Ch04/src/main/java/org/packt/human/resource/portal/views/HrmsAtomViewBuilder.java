package org.packt.human.resource.portal.views;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.packt.human.resource.portal.model.data.HrmsNews;
import org.springframework.web.servlet.view.feed.AbstractAtomFeedView;

import com.rometools.rome.feed.atom.Content;
import com.rometools.rome.feed.atom.Entry;
import com.rometools.rome.feed.atom.Feed;
import com.rometools.rome.feed.atom.Link;

public class HrmsAtomViewBuilder extends AbstractAtomFeedView {
	
	
	@Override
	protected void buildFeedMetadata(Map<String, Object> model, Feed feed,
			HttpServletRequest request) {
		feed.setTitle("User Feeds News");
		feed.setId("tag:hrmsUserTypes");
		feed.setUpdated(new Date());
	
	}

	@Override
	protected List<Entry> buildFeedEntries(Map<String, Object> model,
			HttpServletRequest req, HttpServletResponse response) throws Exception {
		// get data model which is passed by the Spring container
		  List<HrmsNews> news = (List<HrmsNews>) model.get("allNews");
	       List<Entry> entries = new ArrayList<Entry>(news.size());
			
			for(HrmsNews topic : news ){
			
				Entry entry = new Entry();
				
				
				entry.setId(topic.getId()+"");
							
				entry.setTitle(topic.getDescription());
				
				Content summary = new Content();
				summary.setValue(topic.getSummary());
			    entry.setSummary(summary);
			       
			    Link link = new Link();
			    link.setType("text/html");
			    link.setHref(topic.getLink()); //because I have a different controller to show news at http://yourfanstasticsiteUrl.com/news/ID
			    List arrLinks = new ArrayList();
			    arrLinks.add(link);
			    entry.setAlternateLinks(arrLinks);
			    entry.setUpdated(new Date());
				
			    entries.add(entry);
			}
			
			return entries;
	}

}
