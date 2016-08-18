package org.packt.online.cart.portal.controller;

import java.util.List;

import org.packt.online.cart.portal.model.data.Catalog;
import org.packt.online.cart.portal.model.form.LoginForm;
import org.packt.online.cart.portal.model.form.OrderForm;
import org.packt.online.cart.portal.model.form.PaymentForm;
import org.packt.online.cart.portal.model.form.ShipForm;
import org.packt.online.cart.portal.service.CatalogService;
import org.packt.online.cart.portal.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Controller;
import org.springframework.webflow.action.EventFactorySupport;
import org.springframework.webflow.execution.Event;

@Controller
public class CartController {
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private CatalogService catalogService;

	public Event checkUser(LoginForm login, MessageContext messageContext) {
		if (loginService.retrieveAccount(login.getUsername()) == null) {
			MessageBuilder errorMessageBuilder1 = new MessageBuilder().error();
			errorMessageBuilder1.source("username");
			errorMessageBuilder1.code("login.username.error");
			messageContext.addMessage(errorMessageBuilder1.build());
			
			MessageBuilder errorMessageBuilder2 = new MessageBuilder().error();
			errorMessageBuilder2.source("password");
			errorMessageBuilder2.code("login.password.error");
			messageContext.addMessage(errorMessageBuilder2.build());
			return new EventFactorySupport().error(this);
		}
		return new EventFactorySupport().success(this);
	}
	
	public List<Catalog> showCatalog(){
		List<Catalog>  cartList = catalogService.getAllCatalogs();
        return cartList;
	}
	
	// Below are just stabs needed to be implemented the way checkUser() above
	// is implemented.
	
	public Event registerOrder(OrderForm order, MessageContext messageContext) {
		if (order == null) {
			// Code here for Error Messages
			return new EventFactorySupport().error(this);
		}
		return new EventFactorySupport().success(this);
	}
	
	
	public Event registerPayment(PaymentForm payment, MessageContext messageContext) {
		if (payment == null) {
			// Code here for Error Messages
			return new EventFactorySupport().error(this);
		}
		return new EventFactorySupport().success(this);
	}
	
	public Event shipOrder(ShipForm ship, MessageContext messageContext) {
		if (ship == null) {
			// Code here for Error Messages
			return new EventFactorySupport().error(this);
		}
		return new EventFactorySupport().success(this);
	}
	
	
}
