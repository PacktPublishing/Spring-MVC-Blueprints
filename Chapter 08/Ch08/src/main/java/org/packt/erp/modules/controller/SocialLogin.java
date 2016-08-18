package org.packt.erp.modules.controller;

import java.io.IOException;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.social.oauth1.AuthorizedRequestToken;
import org.springframework.social.oauth1.OAuth1Operations;
import org.springframework.social.oauth1.OAuth1Parameters;
import org.springframework.social.oauth1.OAuthToken;
import org.springframework.social.twitter.connect.TwitterConnectionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/erp")
public class SocialLogin {

	@RequestMapping(value = "/facebookLogin")
	public void facebookLogin(HttpServletRequest request,
			HttpServletResponse response) {
		String url = "https://www.facebook.com/dialog/oauth/?"
				+ "client_id=142586082509457"
				+ "&redirect_uri=http://localhost:8080/ch08/erp/facebookAuthentication.html"
				+ "&scope=email,publish_stream,user_about_me,friends_about_me"
				+ "&state=erplogin" + "&display=page" + "&response_type=code";
		try {
			response.sendRedirect(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Facebook Callback or Redirect URL
	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/facebookAuthentication", method = RequestMethod.GET)
	public RedirectView facebookAuthentication(HttpServletRequest request,
			HttpServletResponse response) {
		RedirectView redirectView = new RedirectView();
		redirectView.setContextRelative(true);

		String code = request.getParameter("code");

		if (!StringUtils.isEmpty(code)) {
			String url = "https://graph.facebook.com/oauth/access_token?"
					+ "client_id=142586082509457"
					+ "&redirect_uri=http://localhost:8080/ch08/erp/facebookAuthentication.html"
					+ "&client_secret=4ca078656091ee91756b4575245234d1"
					+ "&code=" + code;

			try {
				HttpGet httpRequest = new HttpGet(url);
				HttpClient httpclient = new DefaultHttpClient();
				HttpResponse httpresponse;
				httpresponse = httpclient.execute(httpRequest);
				if (httpresponse.getStatusLine().getStatusCode() == HttpsURLConnection.HTTP_OK) {
					redirectView.setUrl("/erp/paymentmodes.xml");
				} else {
					redirectView.setUrl("http://www.google.com");
				}
			} catch (ClientProtocolException e) {
			} catch (IOException e) {
			}

		} else {
			redirectView.setUrl("http://www.google.com");
		}

		return redirectView;
	}
	
	// Twitter
	@RequestMapping(value = "/twitterLogin")
	 public void printWelcome(HttpServletResponse response,HttpServletRequest request) {
		 TwitterConnectionFactory connectionFactoryTwitter = 
				 new TwitterConnectionFactory("<consumer id>","<consumer key>");
		 OAuth1Operations oauth1Operations = connectionFactoryTwitter.getOAuthOperations();
		
		  OAuthToken  requestToken = oauth1Operations.fetchRequestToken("http://www.localhost:8080/ch08/erp/twitterAuthentication.html", null);
		    String authorizeUrl = oauth1Operations.buildAuthorizeUrl(requestToken.getValue(), OAuth1Parameters.NONE);
		    try {
				response.sendRedirect(authorizeUrl);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	       
	    }
	
	@RequestMapping(value = "/twitterAuthentication")
	  public RedirectView callback(@RequestParam(value = "oauth_token") String oauthToken, @RequestParam(value = "oauth_verifier") String oauthVerifier) {
		TwitterConnectionFactory connectionFactoryTwitter = 
				 new TwitterConnectionFactory("<consumer id>","<consumer key>");
		OAuth1Operations oauth1Operations = connectionFactoryTwitter.getOAuthOperations();
		OAuthToken  requestToken = oauth1Operations.fetchRequestToken("http://www.localhost:8080/ch08/erp/twitterAuthentication.html", null);
		RedirectView redirectView = new RedirectView();
		redirectView.setContextRelative(true);
	    OAuthToken accessToken = oauth1Operations.exchangeForAccessToken(new AuthorizedRequestToken(requestToken, oauthVerifier), OAuth1Parameters.NONE);
	    
	    if(accessToken.equals("<enter access token here>")){
	    	redirectView.setUrl("/erp/paymentmodes.xml");
	    }else{
	    	redirectView.setUrl("http://www.google.com");
	    }
	    return redirectView;
	  }

}
