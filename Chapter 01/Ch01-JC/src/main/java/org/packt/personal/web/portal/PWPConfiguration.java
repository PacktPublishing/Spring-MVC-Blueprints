/*
 * Author: Sherwin John Calleja-Tragura
 * Version: 1.0
 * Date: May 30, 2015
 */
package org.packt.personal.web.portal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;

/*
 * The JavaConfig version of the ApplicationContext container
 */
@Configuration
@ComponentScan(basePackages="org.packt.personal.web.portal")
//@ImportResource("")
@EnableWebMvc
public class PWPConfiguration extends WebMvcConfigurerAdapter {
	
	@Bean
	public ResourceBundleViewResolver setViewResolver() {  
		ResourceBundleViewResolver viewResolver = new ResourceBundleViewResolver();  
		viewResolver.setBasename("config.views");
        return viewResolver;  
    }  
	
	@Bean
	public ResourceBundleMessageSource setMessageResource(){
		ResourceBundleMessageSource messageResource = new ResourceBundleMessageSource();
		messageResource.setBasename("config.errors");
		return messageResource;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/css/**").addResourceLocations("/css/");
	}

}
