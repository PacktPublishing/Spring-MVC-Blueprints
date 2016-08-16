package org.packt.personal.web.portal.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.packt.personal.web.portal.model.form.Home;
import org.packt.personal.web.portal.model.form.PostMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@SessionAttributes("posts")
@RequestMapping("pwp")
public class IndexController {
	
	@ModelAttribute("posts")
	public List<PostMessage> newPosts(){
		return initPost();
	}
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String getIndex(Model model,  @ModelAttribute("posts") List<PostMessage> posts, @ModelAttribute("postForm") PostMessage postForm){
      	Home home = new Home();
      	home.setMessage(initMessage());
      	home.setQuote(initQuote());
      	model.addAttribute("home",  home);
        if(posts == null) posts = newPosts();
      	
        if(validatePost(postForm)){
        	postForm.setDatePosted(new Date());
        	posts.add(postForm);
        }
        
        model.addAttribute("posts",  posts);
    
		return "index";
	}
	
	@RequestMapping(value="/index_redirect", method=RequestMethod.GET)
	public RedirectView updateIndex(){
 
		return new RedirectView("/ch01/pwp/index_update.html");
	}
	
	public String initQuote(){
		String message = "Twenty years from now you will be more disappointed by the things that you didn't do than by the ones you did do, so throw off the bowlines, sail away from safe harbor, catch the trade winds in your sails.  Explore, Dream, Discover. -Mark Twain";
			
		return message;
	}
	
	public String initMessage(){
		String message = "Having a positive outlook on life is a crucial part of finding inspiration. In the paragraph above, did you feel inspired reading about the vastness of our universe and our unique place within it, or did you feel overwhelmed and depressed at the insignificance of it all? Our brains are wired to find things we're looking for - if you're always cynical or waiting for things to go wrong, then your life will reflect that. On the other hand, having a positive outlook on life will bring you joy and provide you with inspiration when you least expect it.";
						
		return message;
	}
	
	public List<PostMessage> initPost(){
		List<PostMessage> posts = new ArrayList<>();
		PostMessage post = new PostMessage();
		post.setSubject("Welcome!");
		post.setDatePosted(new Date());
		post.setPostedMsg("Hello visitors! Feel free to post on my portal!");
		
		posts.add(post);
		
		return posts;
	}
	
	public boolean validatePost(PostMessage post){
		try{
			if(post.getSubject().trim().length() == 0 || post.getPostedMsg().trim().length() == 0){
				return false;
			}
		}
		catch(Exception e){
			return false;
		}
		
		return true;
	}
	
	/*
	 * Calls the default index.html
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public RedirectView getDefault() {
		return new RedirectView("/ch01/pwp/index.html");
	}

}
