package org.test;

import org.packt.erp.modules.ws.InvoiceProductRequest;
import org.packt.erp.modules.ws.InvoiceProductResponse;
import org.packt.erp.modules.ws.InvoicedProducts;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.ws.client.core.WebServiceTemplate;

public class TestData {
	
	public static void main(String args[]){
		 ApplicationContext context =  new FileSystemXmlApplicationContext(".\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");  
		  //Calculation calculation = (Calculation)context.getBean("calculationBeanHessian");
		 InvoiceProductRequest request = new InvoiceProductRequest();
		 request.setInvoiceId(123);
		 WebServiceTemplate wsTemplate = (WebServiceTemplate) context.getBean("webServiceTemplate");
		 InvoiceProductResponse response = (InvoiceProductResponse) wsTemplate.marshalSendAndReceive(request);
		 InvoicedProducts product =  response.getInvoicedProduct();
		 System.out.println(product.getId());
	}

}
