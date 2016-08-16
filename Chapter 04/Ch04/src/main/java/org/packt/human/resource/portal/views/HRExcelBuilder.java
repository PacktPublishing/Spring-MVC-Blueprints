package org.packt.human.resource.portal.views;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.packt.human.resource.portal.model.data.HrmsLogin;
import org.springframework.web.servlet.view.document.AbstractExcelView;

public class HRExcelBuilder extends AbstractExcelView{

	@Override
    protected void buildExcelDocument(Map<String, Object> model,
            HSSFWorkbook workbook, HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        // get data model which is passed by the Spring container
        @SuppressWarnings("unchecked")
		List<HrmsLogin> users = (List<HrmsLogin>) model.get("allUsers");
         
        // create a new Excel sheet
        HSSFSheet sheet = workbook.createSheet("User List");
        sheet.setDefaultColumnWidth(30);
         
        // create style for header cells
        CellStyle style = workbook.createCellStyle();
        Font font = workbook.createFont();
        font.setFontName("Arial");
        style.setFillForegroundColor(HSSFColor.BLUE.index);
        style.setFillPattern(CellStyle.SOLID_FOREGROUND);
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        font.setColor(HSSFColor.WHITE.index);
        style.setFont(font);
         
        // create header row
        HSSFRow header = sheet.createRow(0);
         
        header.createCell(0).setCellValue("Employee ID");
        header.getCell(0).setCellStyle(style);
         
        header.createCell(1).setCellValue("Username");
        header.getCell(1).setCellStyle(style);
         
        header.createCell(2).setCellValue("Password");
        header.getCell(2).setCellStyle(style);
         
        header.createCell(3).setCellValue("Role");
        header.getCell(3).setCellStyle(style);
         
              
        // create data rows
        int rowCount = 1;
         
        for (HrmsLogin account : users) {
            HSSFRow aRow = sheet.createRow(rowCount++);
            aRow.createCell(0).setCellValue(account.getHrmsEmployeeDetails().getEmpId());
            aRow.createCell(1).setCellValue(account.getUsername());
            aRow.createCell(2).setCellValue(account.getPassword());
            aRow.createCell(3).setCellValue(account.getRole());
           
        }
        
	}

}
