package org.packt.erp.modules.controller;

import java.util.Collections;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.packt.erp.modules.model.data.User;
import org.packt.erp.modules.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

@Controller
public class LoginInfoController {

	   @RequestMapping("/erp/cxf-client/rest/users")
	   public @ResponseBody String getUsers(){
		   
		   WebClient client = WebClient
	                .create("http://localhost:8080/ch08/cxf/restInvService/getProductsJson.json",
	                        Collections.singletonList(new JacksonJsonProvider()))
	                .accept(MediaType.APPLICATION_JSON_TYPE);
	       String data = client.get(String.class);
	       
	       // More algorithm to convert the JSON objects to List of Users
		   return data;
	   }
	   
	   @RequestMapping("/erp/cxf-client/soap/users")
	   public @ResponseBody List<User> getUserAccounts(){
		   
		     JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

		      factory.setServiceClass(LoginService.class);
		      factory.setAddress("http://localhost:8080/ch08/cxf/loginServiceWS");
		      factory.getInInterceptors().add(new LoggingInInterceptor());
		      factory.getOutInterceptors().add(new LoggingOutInterceptor());
		      LoginService loginService = (LoginService) factory.create();
		      
		      List<User> users = loginService.getUserAccounts();
		      
		     		   
		   return users;
	   }
 
	

}
