package org.packt.human.resource.portal.views;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.packt.human.resource.portal.model.data.HrmsLogin;
import org.springframework.web.servlet.view.document.AbstractJExcelView;

@SuppressWarnings("deprecation")
public class HRExcelJExcelBuilder extends AbstractJExcelView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model,
			WritableWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		// get data model which is passed by the Spring container
		List<HrmsLogin> users = (List<HrmsLogin>) model.get("allUsers");
		
		// create a new Excel sheet
		WritableSheet sheet = workbook.createSheet("Master List of Users", 0);
		
		// create header row
		sheet.addCell(new Label(0, 0, "Employee ID"));
		sheet.addCell(new Label(1, 0, "Username"));
		sheet.addCell(new Label(2, 0, "Password"));
		sheet.addCell(new Label(3, 0, "Role"));
		
		
		// create data rows
		int rowCount = 1;
		
		for (HrmsLogin user : users) {
			sheet.addCell(new Label(0, rowCount, user.getHrmsEmployeeDetails().getEmpId()+""));
			sheet.addCell(new Label(1, rowCount, user.getUsername()));
			sheet.addCell(new Label(2, rowCount, user.getPassword()));
			sheet.addCell(new Label(3, rowCount, user.getRole()));
			
			rowCount++;
		}
	}
}