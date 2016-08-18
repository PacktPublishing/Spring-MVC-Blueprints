package org.packt.erp.modules.service;

import java.util.List;

import javax.jws.WebParam;
import javax.ws.rs.core.Response;

import org.packt.erp.modules.model.data.User;
import org.packt.erp.modules.model.form.SignupForm;

// Proxy for CXF - Rest
public interface LoginServiceRest {
	public String addUserAccount( SignupForm signupForm);
	public User getUserAccount(@WebParam(name="id") Integer id);
	public Response getUserAccounts();

}
