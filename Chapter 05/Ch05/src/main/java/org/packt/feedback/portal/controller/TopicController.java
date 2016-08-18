/*
 *  Author: Sherwin John Caleja-Tragura
 *  Version: 1.0
 */

package org.packt.feedback.portal.controller;

import java.util.List;

import org.packt.feedback.portal.botcaptcha.model.BotModel;
import org.packt.feedback.portal.model.data.CfsTopic;
import org.packt.feedback.portal.model.form.TopicForm;
import org.packt.feedback.portal.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

/* 
 *  This controller provides the CRUD services for the Topic page.
 */
@Controller
public class TopicController {
	
	@Autowired
	TopicService topicService;
	
	@RequestMapping("/cfs/topics")
	public String getIndex(Model model){
		List<CfsTopic> topics = topicService.retrieveAllTopics();
	    model.addAttribute("topics", topics);
		return "topics";
	}
	
	
	
		@RequestMapping(value = "/cfs/topics/{id}/update", method = RequestMethod.GET)
		public String updateTopic(@PathVariable("id") int id, Model model) {	
			CfsTopic topic = topicService.retrieveTopic(id);
			TopicForm topicForm = new TopicForm();
			topicForm.setTitle(topic.getTitle());
			topicForm.setDescription(topic.getDescription());
			topicForm.setId(topic.getId());
			
			BotModel botModel = new BotModel();
			topicForm.setBotModel(botModel);
			model.addAttribute("topicForm", topicForm);
			
          
			return "topic_form";

		}
		
		
		
		// delete user
		@RequestMapping(value = "/cfs/topics/{id}/delete", method = RequestMethod.POST)
		public RedirectView deleteUser(@PathVariable("id") int id, final RedirectAttributes redirectAttributes) {

			topicService.removeTopic(id);
			
			redirectAttributes.addFlashAttribute("css", "success");
			redirectAttributes.addFlashAttribute("msg", "Topic is deleted!");
			RedirectView redirectView = new RedirectView();
			redirectView.setContextRelative(true);
			redirectView.setUrl("/cfs/topics.html");
			return redirectView;

		}
		
		
		// show user
		@RequestMapping(value = "/cfs/topics/{id}", method = RequestMethod.GET)
		public String showTopic(@PathVariable("id") int id, Model model) {

			CfsTopic topic = topicService.retrieveTopic(id);
			
			if (topic == null) {
				model.addAttribute("css", "danger");
				model.addAttribute("msg", "Topic not found");
			}
			model.addAttribute("topic", topic);

			return "show";

		}

		

}
