package org.packt.human.resource.portal.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import net.sf.dynamicreports.report.builder.DynamicReports;
import net.sf.dynamicreports.report.builder.column.Columns;
import net.sf.dynamicreports.report.builder.component.Components;
import net.sf.dynamicreports.report.builder.datatype.DataTypes;
import net.sf.dynamicreports.report.constant.HorizontalAlignment;
import net.sf.dynamicreports.report.exception.DRException;
import net.sf.jasperreports.engine.JRException;

import org.packt.human.resource.portal.exception.ReportNotFoundException;
import org.packt.human.resource.portal.model.data.HrmsLogin;
import org.packt.human.resource.portal.service.LoginService;
import org.packt.human.resource.portal.views.AdminJasperBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminDynaReport {

	@Autowired
	private LoginService loginService;

	private List<HrmsLogin> usersList;

	@RequestMapping(value = "/hrms/dynaUserReport", method = RequestMethod.GET)
	public String printWelcome7(ModelMap model, HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException,
			JRException, NamingException, Exception {
		JasperReportBuilder report = DynamicReports.report();

		usersList = loginService.getUserList();
		if (usersList != null) {
			throw new ReportNotFoundException();
		}

		AdminJasperBase dsUsers = new AdminJasperBase(usersList);
		report.columns(
				Columns.column("Employee Id", "empId", DataTypes.stringType()),
				Columns.column("Username", "username", DataTypes.stringType()),
				Columns.column("Password", "password", DataTypes.stringType()),
				Columns.column("Role", "role", DataTypes.stringType()))
				.title(// title of the report
				Components.text("Master List of Users").setHorizontalAlignment(
						HorizontalAlignment.CENTER))
				.pageFooter(Components.pageXofY()) // show page number on the  footer area
				.setDataSource(dsUsers);

		report.build();
		response.setContentType("application/pdf");
		response.setHeader("Content-disposition",
				"inline; filename=dnynamicReport.pdf");

		try {
			final OutputStream outStream = response.getOutputStream();
			report.toPdf(outStream);
			outStream.flush();
			outStream.close();
		} catch (DRException e) {
			throw new ReportNotFoundException();
		} catch (Exception e) {
			throw new ReportNotFoundException();
		}

		return null;
	}

	@ExceptionHandler(ReportNotFoundException.class)
	public ModelAndView handleEmployeeNotFoundException(
			HttpServletRequest request, Exception ex) {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("exception", ex);
		modelAndView.addObject("url", request.getRequestURL());

		modelAndView.setViewName("error");
		return modelAndView;
	}

}
