package org.packt.human.resource.portal.views;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.packt.human.resource.portal.model.data.HrmsLogin;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class HRPDFBuilderImpl extends HRPDFBuilder{
	
	
	    @SuppressWarnings("unchecked")
	    @Override
	    protected void buildPdfDocument(Map<String, Object> model, Document doc,
	            PdfWriter writer, HttpServletRequest request, HttpServletResponse response)
	            throws Exception {
	        // get data model which is passed by the Spring container
	        List<HrmsLogin> users = (List<HrmsLogin>) model.get("allUsers");
	         
	        doc.add(new Paragraph("Master List of Users"));
	         
	        PdfPTable table = new PdfPTable(4);
	        table.setWidthPercentage(100.0f);
	        table.setWidths(new float[] {3.0f, 2.0f, 2.0f, 2.0f});
	        table.setSpacingBefore(10);
	         
	        // define font for table header row
	        Font font = FontFactory.getFont(FontFactory.HELVETICA);
	        font.setColor(BaseColor.WHITE);
	         
	        // define table header cell
	        PdfPCell cell = new PdfPCell();
	        cell.setBackgroundColor(BaseColor.BLUE);
	        cell.setPadding(5);
	         
	        // write table header
	        cell.setPhrase(new Phrase("Employee ID", font));
	        table.addCell(cell);
	         
	        cell.setPhrase(new Phrase("Username", font));
	        table.addCell(cell);
	 
	        cell.setPhrase(new Phrase("Password", font));
	        table.addCell(cell);
	         
	        cell.setPhrase(new Phrase("Role", font));
	        table.addCell(cell);
	         
	       
	         
	        // write table row data
	        for (HrmsLogin user : users) {
	            table.addCell(user.getHrmsEmployeeDetails().getEmpId()+"");
	            table.addCell(user.getUsername());
	            table.addCell(user.getPassword());
	            table.addCell(user.getRole());
	            
	        }
	         
	        doc.add(table);
	         
	    }
	 

}
