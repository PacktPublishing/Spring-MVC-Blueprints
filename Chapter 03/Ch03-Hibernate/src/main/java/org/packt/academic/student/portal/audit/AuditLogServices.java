package org.packt.academic.student.portal.audit;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class AuditLogServices {
       
	 private static Logger mainLogger = LoggerFactory.getLogger(AuditLogServices.class);
	
	   @Before("execution(* org.packt.academic.student.portal.service.impl.*.*(..)) && target(service)")
	   public void log(Object service) {
		   mainLogger.info("Accessing {}" + service.getClass().getSimpleName());

	    }
}


