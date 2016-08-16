package org.packt.human.resource.portal.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.packt.human.resource.portal.controller.AdminController;
import org.packt.human.resource.portal.service.LoginService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/hrms-servlet.xml")
public class ViewReportsTest {
	@Mock
    private LoginService loginService;
 
	private MockMvc mockMvc;
	
	@InjectMocks
    private AdminController adminController;
	 
    @Before
    public void setup() {
        ResourceBundleViewResolver viewResolver = new ResourceBundleViewResolver();
        viewResolver.setBasename("config.views");
      
 
        mockMvc = MockMvcBuilders.standaloneSetup(new AdminController()).
        		setViewResolvers(viewResolver).build();
    }
	
	@Test
	public void testHRDashboard() throws Exception {
		
		  mockMvc.perform(get("/hrms/hr_reports.html"))
		  .andExpect(status().isOk())
	      .andExpect(forwardedUrl("/jsp/hr_reports.jsp"));	
	}
	
	
	@Test
	public void testAdminDashboard() throws Exception {
	
		  mockMvc.perform(get("/hrms/admin_reports.html"))
		  .andExpect(status().isOk())
	      .andExpect(forwardedUrl("/jsp/admin_reports.jsp"));	
	}

	

}
