package org.packt.erp.modules.service.impl;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.packt.erp.modules.dao.LoginDao;
import org.packt.erp.modules.model.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// CXF-REST
@Component
@Path("/loginServiceRest")
public class LoginServiceRestImpl {

	@Autowired
	private LoginDao loginDao;

	@GET
	@Path("/getUserAccounts")
	
	@Produces(MediaType.APPLICATION_JSON)
	
	public Response getUserAccounts() {
		return Response.ok()
				.entity(new GenericEntity<List<User>>(loginDao.getUsers()) {
				}).build();
	}

}
