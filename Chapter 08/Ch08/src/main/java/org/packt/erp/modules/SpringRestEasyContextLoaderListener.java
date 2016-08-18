package org.packt.erp.modules;

// ContextLoadListener API for RestEasy WS

import javax.servlet.ServletContext;

import org.jboss.resteasy.plugins.spring.SpringContextLoaderSupport;
import org.springframework.web.context.ConfigurableWebApplicationContext;
import org.springframework.web.context.ContextLoaderListener;

public class SpringRestEasyContextLoaderListener
         extends ContextLoaderListener {
 
     private SpringContextLoaderSupport springLoader
         = new SpringContextLoaderSupport();

    @Override
     protected void customizeContext(ServletContext sc,
            ConfigurableWebApplicationContext ctxt) {
         super.customizeContext(sc, ctxt);
         this.springLoader.customizeContext(sc, ctxt);
    }
 }