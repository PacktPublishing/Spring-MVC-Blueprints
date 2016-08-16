package org.packt.human.resource.portal.controller;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporter;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporterParameter;
import net.sf.jasperreports.engine.util.JRLoader;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.packt.human.resource.portal.model.data.HrmsLogin;
import org.packt.human.resource.portal.service.LoginService;
import org.packt.human.resource.portal.views.AdminJasperBase;
import org.packt.human.resource.portal.views.AdminJasperDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.jasperreports.JasperReportsPdfView;

@Controller
public class AdminJasperReport {

	@Autowired
	private LoginService loginService;

	private List<HrmsLogin> usersList;

	@RequestMapping(value = "/hrms/showJasperManagerPDF", method = RequestMethod.GET)
	public String showJasperManagerPDF(ModelMap model,
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, JRException, NamingException {

		usersList = loginService.getUserList();

		AdminJasperBase dsUsers = new AdminJasperBase(usersList);
		Map<String, Object> params = new HashMap<>();
		params.put("users", usersList);
		JasperReport jasperReport = getCompiledFile("JRUsers", request);
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,
				params, dsUsers);

		response.setContentType("application/x-pdf");
		response.setHeader("Content-disposition",
				"inline; filename=userList.pdf");

		final OutputStream outStream = response.getOutputStream();
		JasperExportManager.exportReportToPdfStream(jasperPrint, outStream);

		return null;
	}

	private JasperReport getCompiledFile(String fileName,
			HttpServletRequest request) throws JRException {
		// Note: Always compile XML template
		JasperReport jasperReport = (JasperReport) JRLoader.loadObject(this
				.getClass().getClassLoader()
				.getResourceAsStream("config/JRUsers.jasper"));
		return jasperReport;
	}

	@RequestMapping(value = "/hrms/showJasperViewPDF", method = RequestMethod.GET)
	public ModelAndView showJasperViewPDF(ModelAndView modelAndView) {
		usersList = loginService.getUserList();
		AdminJasperBase dsUsers = new AdminJasperBase(usersList);
		Map<String, Object> parameterMap = new HashMap<>();
		parameterMap.put("jrDatasource", dsUsers);
		modelAndView = new ModelAndView("adminJasperPDFView", parameterMap);
		return modelAndView;
	}

	@RequestMapping(value = "/hrms/showJasperBasePDF", method = RequestMethod.GET)
	public String showJasperBasePDF(ModelMap model) {
		usersList = loginService.getUserList();
		AdminJasperBase dsUsers = new AdminJasperBase(usersList);
		model.addAttribute("jrDatasource", dsUsers);
		model.addAttribute("format", "pdf");
		return "multiViewReport";
	}

	@RequestMapping(value = "/hrms/showJasperMVCPDF", method = RequestMethod.GET)
	public ModelAndView showJasperMVCPDF(ModelMap modelMap,
			ModelAndView modelAndView) {
		usersList = loginService.getUserList();
		AdminJasperBase dsUsers = new AdminJasperBase(usersList);
		modelMap.put("datasource", dsUsers);
		modelMap.put("format", "pdf");
		modelAndView = new ModelAndView("JRUsers", modelMap);
		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/hrms/showCSVFile")
	public ModelAndView generateCsvReport(ModelAndView modelAndView) {
		usersList = loginService.getUserList();
		AdminJasperBase dsUsers = new AdminJasperBase(usersList);
		Map<String, Object> parameterMap = new HashMap<>();
		parameterMap.put("datasource", dsUsers);

		// Note: xlsReport bean has been declared in the jasper-views.xml file
		modelAndView = new ModelAndView("adminJasperCSVView", parameterMap);
		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/hrms/showHTMLFile")
	public ModelAndView generateHtmlReport(ModelAndView modelAndView) {

		usersList = loginService.getUserList();
		AdminJasperBase dsUsers = new AdminJasperBase(usersList);
		Map<String, Object> parameterMap = new HashMap<>();
		parameterMap.put("datasource", dsUsers);
		parameterMap.put("datasource", dsUsers);
		// Note: xlsReport bean has ben declared in the jasper-views.xml file
		modelAndView = new ModelAndView("adminJasperHtmlView", parameterMap);

		return modelAndView;
	}// generatePdfReport

	@RequestMapping(value = "/hrms/showRTFFile", method = RequestMethod.GET)
	public String showRTFFile(ModelMap model, HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException,
			JRException, NamingException {
		byte[] rtfResume = null;
		usersList = loginService.getUserList();
		AdminJasperBase dsUsers = new AdminJasperBase(usersList);
		Map<String, Object> params = new HashMap<>();
		params.put("users", usersList);
		JasperReport jasperReport = getCompiledFile("JRUsers", request);
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,
				params, dsUsers);
		
		ByteArrayOutputStream rtfStream = null;
		try {

			final JRRtfExporter rtfExporter = new JRRtfExporter();
			rtfStream = new ByteArrayOutputStream();
			rtfExporter.setParameter(JRExporterParameter.JASPER_PRINT,
					jasperPrint);
			rtfExporter.setParameter(JRExporterParameter.OUTPUT_STREAM,
					rtfStream);
			rtfExporter.exportReport();
			rtfResume = rtfStream.toByteArray();
		} catch (final JRException e) {

		} catch (final RuntimeException e) {

		}

		response.setContentType("application/rtf");
		response.setHeader("Content-disposition",
				"inline; filename=users.rtf");

		final OutputStream outStream = response.getOutputStream();
		outStream.write(rtfResume);
		outStream.flush();
		outStream.close();

		return null;
	}

	@RequestMapping(value = "/hrms/showDOCXFile", method = RequestMethod.GET)
	public String printWelcome6(ModelMap model, HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException,
			JRException, NamingException {
		byte[] docResume = null;
		usersList = loginService.getUserList();
		AdminJasperBase dsUsers = new AdminJasperBase(usersList);
		Map<String, Object> params = new HashMap<>();
		params.put("users", usersList);
		JasperReport jasperReport = getCompiledFile("JRUsers", request);
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,
				params, dsUsers);
		ByteArrayOutputStream docStream = null;

		try {

			final JRDocxExporter docExporter = new JRDocxExporter();
			docStream = new ByteArrayOutputStream();
			docExporter.setParameter(JRDocxExporterParameter.JASPER_PRINT,
					jasperPrint);
			docExporter.setParameter(JRDocxExporterParameter.OUTPUT_STREAM,
					docStream);
			docExporter.setParameter(
					JRDocxExporterParameter.FLEXIBLE_ROW_HEIGHT, Boolean.TRUE);
			docExporter.exportReport();
			docResume = docStream.toByteArray();
		} catch (final JRException e) {

		} catch (final RuntimeException e) {

		}

		response.setContentType("application/vnd.openxmlformats-officedocument.wordprocessingml.document");
		response.setHeader("Content-disposition",
				"inline; filename=users.docx");

		final OutputStream outStream = response.getOutputStream();
		outStream.write(docResume);
		outStream.flush();
		outStream.close();

		return null;
	}

	public byte[] buildRtfResume(JasperPrint jasperPrintLocal) {

		byte[] rtfResume = null;
		try {

			final JasperPrint jasperPrint = jasperPrintLocal;
			final JRRtfExporter rtfExporter = new JRRtfExporter();
			final ByteArrayOutputStream rtfStream = new ByteArrayOutputStream();
			rtfExporter.setParameter(JRExporterParameter.JASPER_PRINT,
					jasperPrint);
			rtfExporter.setParameter(JRExporterParameter.OUTPUT_STREAM,
					rtfStream);
			rtfExporter.exportReport();
			rtfResume = rtfStream.toByteArray();
		} catch (final JRException e) {

		} catch (final RuntimeException e) {

		}
		return rtfResume;
	}
}
