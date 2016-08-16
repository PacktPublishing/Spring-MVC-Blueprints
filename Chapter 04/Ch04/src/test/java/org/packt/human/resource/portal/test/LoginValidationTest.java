package org.packt.human.resource.portal.test;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.packt.human.resource.portal.controller.LoginController;
import org.packt.human.resource.portal.model.form.LoginForm;
import org.packt.human.resource.portal.service.LoginService;
import org.packt.human.resource.portal.validator.LoginValidator;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/hrms-servlet.xml")
public class LoginValidationTest {
	
	private MockMvc mockMvc;
	
	@Mock
    private LoginService loginService;
 
	@Mock 
	private LoginValidator loginValidator;
  
 
    @InjectMocks
    private LoginController loginController;
	
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        ResourceBundleViewResolver viewResolver = new ResourceBundleViewResolver();
        viewResolver.setBasename("config.views");
        
     
        mockMvc = MockMvcBuilders.standaloneSetup(loginController).
        		setViewResolvers(viewResolver).build();
 
        when(loginValidator.supports(any(Class.class))).thenReturn(true);
    }
    
	@SuppressWarnings("rawtypes")
	@Test
    public void loginError() throws Exception {
		
        when(loginService.validUser("admin", "admin")).thenReturn(true);
 
        doAnswer(new Answer() {
            @Override
            public Object answer(InvocationOnMock invocationOnMock) throws Throwable {
                Errors errors = (Errors) invocationOnMock.getArguments()[1];
                errors.rejectValue("username","error.login.username");
                return null;
            }
        }).when(loginValidator).validate(any(LoginForm.class), any(Errors.class));
 
        mockMvc.perform(post("/hrms/login").param("username", "admin").param("password","admin"))
        
                .andExpect(status().isOk())
                .andExpect(view().name("login"));
        
    }
	
	@Test
    public void loginNoError() throws Exception {
		
        when(loginService.validUser("admin", "admin")).thenReturn(true);
        when(loginService.checkRole("admin", "admin")).thenReturn("admin");
        
        mockMvc.perform(post("/hrms/login").param("username", "admin").param("password","admin"))
        
                .andExpect(status().isOk())
                .andExpect(view().name("login"));
        
    }
	
	@Test
    public void loginModelError() throws Exception {
		
        when(loginService.validUser("admin", "admin")).thenReturn(true);
        when(loginService.checkRole("admin", "admin")).thenReturn("admin");
        mockMvc.perform(post("/hrms/login").param("username", "admin").param("password","admin"))
        
                .andExpect(status().isOk())
                .andExpect(view().name("admin_dashboard"));
        
    }
	
	
	@Test
	public void loginWithModel() throws Exception {
	    this.mockMvc.perform(get("/hrms/login.html"))
	            .andExpect(status().isOk())
	            .andExpect(forwardedUrl("/jsp/login.jsp"))
	            .andExpect(model().attribute("loginForm", any(LoginForm.class)));
	}
	 
	@Test
	public void loginWithModelWithErrors() throws Exception {

        when(loginService.validUser("admin", "admin")).thenReturn(true);
        when(loginService.checkRole("admin", "admin")).thenReturn("admin");
	    this.mockMvc.perform(post("/hrms/login.html")
	            .param("username", "admin")
	            .param("password", "admin"))
	            .andExpect(status().isOk())
	            .andExpect(forwardedUrl("/jsp/admin_index.jsp"))
	            .andExpect(model().attributeHasFieldErrors("loginForm", "username"));
	}
	
	

}
