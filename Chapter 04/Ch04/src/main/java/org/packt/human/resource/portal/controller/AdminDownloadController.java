package org.packt.human.resource.portal.controller;

import java.util.List;

import org.packt.human.resource.portal.model.data.HrmsLogin;
import org.packt.human.resource.portal.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminDownloadController {
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = "/hrms/downloadExcelUserList", method = RequestMethod.GET)
    public ModelAndView downloadExcel() {
		
		List<HrmsLogin> allUsers = loginService.getUserList();

        // return a view which will be resolved by an excel view resolver
        return new ModelAndView("excelView", "allUsers", allUsers);
    }
	
	@RequestMapping(value = "/hrms/downloadJExcelUserList", method = RequestMethod.GET)
    public ModelAndView downloadJExcel() {
		
		List<HrmsLogin> allUsers = loginService.getUserList();

        // return a view which will be resolved by an excel view resolver
        return new ModelAndView("excelJExcelView", "allUsers", allUsers);
    }
	
	
	@RequestMapping(value = "/hrms/downloadPDFUserList", method = RequestMethod.GET)
    public ModelAndView downloadPDF() {
		
		List<HrmsLogin> allUsers = loginService.getUserList();

        // return a view which will be resolved by an PDF view resolver
        return new ModelAndView("pdfView", "allUsers", allUsers);
    }


}
