package org.packt.human.resource.portal.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Employee Not Found") 
public class ReportNotFoundException extends Exception {
 
    private static final long serialVersionUID = -3332292346834265371L;
 
    public ReportNotFoundException(){
        super("ReportNotFoundException");
    }
}
