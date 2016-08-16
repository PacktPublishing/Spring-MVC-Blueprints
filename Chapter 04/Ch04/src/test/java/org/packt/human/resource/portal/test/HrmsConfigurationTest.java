package org.packt.human.resource.portal.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.packt.human.resource.portal.controller.LoginController;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/hrms-servlet.xml")
public class HrmsConfigurationTest {
	
	private MockMvc mockMvc;
	 
    @Before
    public void setup() {
        ResourceBundleViewResolver viewResolver = new ResourceBundleViewResolver();
        viewResolver.setBasename("config.views");
      
 
        mockMvc = MockMvcBuilders.standaloneSetup(new LoginController())
                                 .setViewResolvers(viewResolver)
                                 .build();
    }
 
    @Test
    public void testLogin() throws Exception {
    	
        mockMvc.perform(get("/hrms/login"))
                .andExpect(status().isOk())
                .andExpect(view().name("login"));
    }

}
