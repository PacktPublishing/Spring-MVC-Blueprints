package org.packt.erp.modules.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.packt.erp.modules.model.data.Login;
import org.packt.erp.modules.model.data.User;
import org.packt.erp.modules.model.form.SignupForm;

// Proxy for CXF - Document-based
@WebService(targetNamespace = "/loginServiceWS")
public interface LoginService {
	
	public void addUserAccount(@WebParam(name="signupForm") SignupForm signupForm);
	public @WebResult(name="user") User getUserAccount(@WebParam(name="id") Integer id);
	public @WebResult(name="users") List<User> getUserAccounts();

}
