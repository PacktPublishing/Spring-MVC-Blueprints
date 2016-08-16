package org.packt.human.resource.portal.views;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.packt.human.resource.portal.model.data.HrmsLogin;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.pdf.PdfWriter;
 
public class PDFView extends AbstractPdfView {

	protected void buildPdfDocument(        
			Map<String, Object> model,        
			Document document,        
			PdfWriter writer,        
			HttpServletRequest req,        
			HttpServletResponse resp)        
					throws Exception {
		
		
		// Get data "articles" from model
		@SuppressWarnings("unchecked")
		List<HrmsLogin> users = (List<HrmsLogin>) model.get("allUsers");
		
		// Fonts
		Font fontTitle = new Font(FontFamily.TIMES_ROMAN, 14, Font.BOLD, BaseColor.BLACK);
		Font fontTag = new Font(FontFamily.HELVETICA, 10, Font.BOLD, BaseColor.WHITE);

		for(HrmsLogin user: users){

			// 1.Title
			document.add(new Chunk("Employee ID: "));
			Chunk title = new Chunk(user.getHrmsEmployeeDetails().getEmpId()+"", fontTitle);
			document.add(title);
			document.add(new Chunk(" "));

			// -- newline
			document.add(Chunk.NEWLINE);

			// 2.URL
			document.add(new Chunk("Username: "));
			Chunk title2 = new Chunk(user.getUsername(), fontTitle);
			document.add(title2);
			document.add(new Chunk(" "));
			
			// -- newline
			document.add(Chunk.NEWLINE);

			// 3.Categories
			document.add(new Chunk("Password: "));
			Chunk title3 = new Chunk(user.getPassword(), fontTitle);
			document.add(title3);
			document.add(new Chunk(" "));
			
			// -- newline
			document.add(Chunk.NEWLINE);
			
			// 4.Tags
			document.add(new Chunk("Employee ID: "));
			Chunk title4 = new Chunk(user.getRole(), fontTitle);
			document.add(title4);
			document.add(new Chunk(" "));
			
			// -- newline
			document.add(Chunk.NEWLINE);
			document.add(Chunk.NEWLINE);

		}
		
	
	}
	

	
	
}
