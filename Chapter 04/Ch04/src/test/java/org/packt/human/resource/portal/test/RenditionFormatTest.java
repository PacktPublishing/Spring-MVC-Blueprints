package org.packt.human.resource.portal.test;

import static org.mockito.Matchers.same;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.packt.human.resource.portal.controller.AdminContentNegoController;
import org.packt.human.resource.portal.model.data.HrmsEmployeeDetails;
import org.packt.human.resource.portal.model.data.HrmsLogin;
import org.packt.human.resource.portal.service.LoginService;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/hrms-servlet.xml")
public class RenditionFormatTest {
	 @Mock
	private LoginService loginService;
	
	 @Mock
	 List<HrmsLogin> testLoginData = new ArrayList<HrmsLogin>();
	  MockMvc mockMvc;
	  
	  @InjectMocks
	  AdminContentNegoController adminContentNegoController;
	  
	
	    @Before
	    public void setup() {
	    	 MockitoAnnotations.initMocks(this);
	        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	        viewResolver.setPrefix("/WEB-INF/admin_report/hrms/");
	        viewResolver.setSuffix(".jsp");
	      
	 
	        mockMvc = MockMvcBuilders.standaloneSetup(new AdminContentNegoController())
	                                 .setViewResolvers(viewResolver)
	                                 .build();
	        
	        
	        
	        
	    }
	 
 

	
	@Test
	  public void asHtml() throws Exception {
		
		
        HrmsEmployeeDetails details = new HrmsEmployeeDetails();
        details.setEmpId(234);
        HrmsLogin rec1 = new HrmsLogin();
        rec1.setHrmsEmployeeDetails(details);
        rec1.setUsername("admin");
        rec1.setPassword("admin");
        rec1.setRole("admin");
        
        testLoginData.add(rec1);
		when(loginService.getUserList()).thenReturn(same(testLoginData));
	    mockMvc.perform(get("/hrms/get.html")
	         .accept(MediaType.TEXT_HTML))
	        .andExpect(status().isOk())
	        .andExpect(view().name("/WEB-INF/admin_report/hrms/get.jsp"));
	  }

	  @Test
	  public void asJson() throws Exception {
		 
		
	        HrmsEmployeeDetails details = new HrmsEmployeeDetails();
	        details.setEmpId(121321);
	        HrmsLogin rec1 = new HrmsLogin();
	        rec1.setHrmsEmployeeDetails(details);
	        rec1.setUsername("admin");
	        rec1.setPassword("admin");
	        rec1.setRole("admin");
	        
	        testLoginData.add(rec1);
		    when(loginService.getUserList()).thenReturn(same(testLoginData));
	         mockMvc.perform(get("/hrms/get.json")
	          .accept(MediaType.APPLICATION_JSON))
	        .andExpect(status().isOk())
	        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
	        .andExpect(view().name("/WEB-INF/admin_report/hrms/get.jsp"));
	  }

}
