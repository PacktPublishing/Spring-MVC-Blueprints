/*
 *  Author: Sherwin John Caleja-Tragura
 *  Version: 1.0
 */

package org.packt.feedback.portal.controller;

import java.util.ArrayList;
import java.util.List;

import org.packt.feedback.portal.botcaptcha.model.BotModel;
import org.packt.feedback.portal.model.data.CfsFeedback;
import org.packt.feedback.portal.model.form.FeedbackForm;
import org.packt.feedback.portal.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

/* 
 *  This controller provides the CRUD operations for the Feedback view page.
 */
@Controller
public class FeedbackController {
	
	@Autowired
	FeedbackService feedbackService;
	
	@RequestMapping("/cfs/feedbacks/{topicId}")
	public String getIndex(@PathVariable("topicId") int topicId, Model model, final RedirectAttributes redirectAttributes){
		List<CfsFeedback> feedbacks = feedbackService.retrieveAllFeedbacks(topicId);
		if(feedbacks == null){
			feedbacks = new ArrayList<>();
		}
		redirectAttributes.addFlashAttribute("topicId", topicId);
	    model.addAttribute("feedbacks", feedbacks);
		return "feedbacks";
	}
	
	
	@RequestMapping(value = "/cfs/feedbacks/{topicId}/{id}/update", method = RequestMethod.GET)
	public String updateFeedback(@PathVariable("topicId") int topicId,@PathVariable("id") int id, Model model) {	
		System.out.println(id);
		System.out.println(topicId);
		CfsFeedback feedback = feedbackService.retrieveFeedback(topicId, id);
		FeedbackForm feedbackForm = new FeedbackForm();
		feedbackForm.setId(id);
		feedbackForm.setTopicId(topicId);
		feedbackForm.setName(feedbackForm.getName());
		feedbackForm.setEmail(feedback.getEmail());
		feedbackForm.setFeedback(feedback.getFeedback());
		
		BotModel botModel = new BotModel();
		feedbackForm.setBotModel(botModel);
		System.out.println(feedbackForm.getId());
		System.out.println(feedbackForm.getTopicId());
		model.addAttribute("feedbackForm", feedbackForm);
		
      
		return "feedback_form";

	}
		
	@RequestMapping(value = "/cfs/feedbacks/{topicId}/{id}/delete", method = RequestMethod.POST)
	public RedirectView deleteFeedback(@PathVariable("topicId") int topicId,@PathVariable("id") int id, final RedirectAttributes redirectAttributes) {

		feedbackService.removeFeedback(topicId, id);
		
		redirectAttributes.addFlashAttribute("css", "success");
		redirectAttributes.addFlashAttribute("msg", "Feedback is deleted!");
		RedirectView redirectView = new RedirectView();
		redirectView.setContextRelative(true);
		redirectView.setUrl("/cfs/feedback_update/"+topicId);
		return redirectView;

	}
	
}
