package org.packt.bus.portal.service.impl;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

// Rest
@ApplicationPath("/rest/*")
public class EmployeeApplication extends Application {
    private Set<Object> singletons = new HashSet<Object>();
    public EmployeeApplication() {
        singletons.add(new BookServiceImpl());
    }
    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
} 
