package org.packt.human.resource.portal.views;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.packt.human.resource.portal.model.data.HrmsLogin;

public class ExcelView extends AbstractExcelView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model,
			Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Sheet sheet = workbook.createSheet("sheet 1");
		
		List<HrmsLogin> users = (List<HrmsLogin>) model.get("allUsers");
		
		Row row = null;
		Cell cell = null;
		int r = 0;
		int c = 0;
		
		//Style for header cell
		CellStyle style = workbook.createCellStyle();
		style.setFillForegroundColor(IndexedColors.GREY_40_PERCENT.index);
		style.setFillPattern(CellStyle.SOLID_FOREGROUND);
		style.setAlignment(CellStyle.ALIGN_CENTER);
		
		//Create header cells
		row = sheet.createRow(r++);
		
		cell = row.createCell(c++);
		cell.setCellStyle(style);
		cell.setCellValue("Employee ID");
		
		cell = row.createCell(c++);
		cell.setCellStyle(style);
		cell.setCellValue("Username");
		
		cell = row.createCell(c++);
		cell.setCellStyle(style);
		cell.setCellValue("Password");
		
		cell = row.createCell(c++);
		cell.setCellStyle(style);
		cell.setCellValue("Role");
		
		
		//Create data cell
		for(HrmsLogin user: users){
			row = sheet.createRow(r++);
			c = 0;
			row.createCell(c++).setCellValue(user.getHrmsEmployeeDetails().getEmpId());
			row.createCell(c++).setCellValue(user.getUsername());
			row.createCell(c++).setCellValue(user.getPassword());
			row.createCell(c++).setCellValue(user.getRole());

		}
		for(int i = 0 ; i < 4; i++)
			sheet.autoSizeColumn(i, true);
		
	}
	
	

}
