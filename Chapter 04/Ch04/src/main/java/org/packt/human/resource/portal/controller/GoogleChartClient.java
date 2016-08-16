package org.packt.human.resource.portal.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.JsonObject;

@Controller
public class GoogleChartClient {
	@RequestMapping(value = "/getReportData", method = RequestMethod.GET)
    public @ResponseBody
    String loadData(HttpServletResponse response) {
               JsonObject piedata1  = new JsonObject();
                  piedata1.addProperty("value", Integer.parseInt("30"));
                  piedata1.addProperty("color", "#F38630");
                  piedata1.addProperty("title", "INDIA");
                 
                  JsonObject piedata2  = new JsonObject();
                  piedata2.addProperty("value",  Integer.parseInt("50"));
                  piedata2.addProperty("color", "#E0E4CC");
                  piedata2.addProperty("title", "US");
                 
                  JsonObject piedata3  = new JsonObject();
                  piedata3.addProperty("value", Integer.parseInt("100"));
                  piedata3.addProperty("color", "#E0E4FF");
                  piedata3.addProperty("title", "CHINA");
                 
                  ArrayList<Object> pieDataSet = new ArrayList<Object>();
                  pieDataSet.add(piedata1);
                  pieDataSet.add(piedata2);
                  pieDataSet.add(piedata3);
                              
                  return pieDataSet.toString();
          
    }


}
