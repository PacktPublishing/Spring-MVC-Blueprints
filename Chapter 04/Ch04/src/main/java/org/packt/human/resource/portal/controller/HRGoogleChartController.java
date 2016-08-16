package org.packt.human.resource.portal.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jfree.data.xy.XYSeries;
import org.packt.human.resource.portal.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.googlecode.charts4j.AxisLabels;
import com.googlecode.charts4j.AxisLabelsFactory;
import com.googlecode.charts4j.AxisStyle;
import com.googlecode.charts4j.AxisTextAlignment;
import com.googlecode.charts4j.BarChart;
import com.googlecode.charts4j.BarChartPlot;
import com.googlecode.charts4j.Color;
import com.googlecode.charts4j.Data;
import com.googlecode.charts4j.Fills;
import com.googlecode.charts4j.GCharts;
import com.googlecode.charts4j.LineChart;
import com.googlecode.charts4j.LinearGradientFill;
import com.googlecode.charts4j.PieChart;
import com.googlecode.charts4j.Plot;
import com.googlecode.charts4j.Plots;
import com.googlecode.charts4j.ScatterPlot;
import com.googlecode.charts4j.ScatterPlotData;
import com.googlecode.charts4j.Shape;
import com.googlecode.charts4j.Slice;

@Controller
public class HRGoogleChartController {

	// Data for scatter plot

	private final XYSeries series = new XYSeries("Data");

	@RequestMapping(value = "/hrms/hr_charts", method = RequestMethod.GET)
	public String getCharts(Model model) throws ServletException, IOException {

		String pieChart = drawPieChart();
		String pieChart2D = drawPieChart2d();
		String lineGraph = drawLineGraph();
		String drawLineDetailed = drawLineDetailed();
        String barGraph = 	drawBarGraph();	
        String scatterPlot = drawScatterHandler();

	    model.addAttribute("pieChart", pieChart);
	    model.addAttribute("pieChart2D", pieChart2D);
	    model.addAttribute("lineGraph", lineGraph);
	    model.addAttribute("drawLineDetailed", drawLineDetailed);
	    model.addAttribute("barGraph", barGraph);
	    model.addAttribute("scatterPlot", scatterPlot);
		return "hr_charts";
	}


	public String drawPieChart() {
		
		Slice s1 = Slice.newSlice(15, Color.newColor("CACACA"), "18-20", "18-20");
		Slice s2 = Slice.newSlice(50, Color.newColor("DF7417"), "21-30",
				"21-30");
		Slice s3 = Slice.newSlice(25, Color.newColor("951800"), "31-40",
				"31-40");
		Slice s4 = Slice.newSlice(10, Color.newColor("01A1DB"), ">= 40",
				">= 40");

		PieChart pieChart = GCharts.newPieChart(s1, s2, s3, s4);
		pieChart.setTitle("Alibata System Inc. Employees (by Age)", Color.BLACK, 15);
		pieChart.setSize(720, 360);
		pieChart.setThreeD(true);

		return pieChart.toURLString();
	}

	public String drawPieChart2d() {
		// EXAMPLE CODE START
		Slice s1 = Slice.newSlice(90, Color.YELLOW, "Male");
		Slice s2 = Slice.newSlice(10, Color.RED, "Female");

		PieChart chart = GCharts.newPieChart(s1, s2);
		chart.setTitle("Alibata System Inc. Employees (by Gender)", Color.BLACK, 16);
		chart.setSize(720, 360);
		
		return chart.toURLString();
	}

	
	public String drawLineGraph() {
		// Your really great chart.
		final Plot plot = Plots.newPlot(Data.newData(0, 10.6, 20.5, 80.20, 50.50, 95.5, 92.00));
		final LineChart chart = GCharts.newLineChart(plot);
		chart.setTitle("Growth of Alibata System Inc. (Estimated Plot)");
		chart.setSize(720, 360);
		return chart.toURLString();
	}


	public String drawLineDetailed() {
		// EXAMPLE CODE START
		Plot plot = Plots.newPlot(Data.newData(0, 10.6, 20.5, 80.20, 50.50, 95.5, 92.00));
		LineChart chart = GCharts.newLineChart(plot);
		chart.addHorizontalRangeMarker(0, 95.5, Color.GRAY);
		chart.setGrid(80.2, 80.2, 7, 7);
		chart.addXAxisLabels(AxisLabelsFactory.newAxisLabels(
				Arrays.asList("2010-2011", "2011-2013", "2013-present"), Arrays.asList(10.6, 50.00, 80.00)));
		chart.addYAxisLabels(AxisLabelsFactory.newNumericAxisLabels(0, 20.00, 40.00, 60.00, 80.00, 90.00, 100.00));
		chart.setSize(720, 360);
		return chart.toURLString();
	}

	
	public String drawBarGraph() {
		
		BarChartPlot team1 = Plots.newBarChartPlot(
				Data.newData(25, 43, 12, 30), Color.BLUEVIOLET, "Sales Department");
		BarChartPlot team2 = Plots.newBarChartPlot(
				Data.newData(8, 35, 11, 5), 	Color.ORANGERED, "Marketing Department");
		BarChartPlot team3 = Plots.newBarChartPlot(
				Data.newData(10, 20, 30, 30), Color.LIMEGREEN, "Implementation Department");

		// Instantiating chart.
		BarChart chart = GCharts.newBarChart(team1, team2, team3);

		// Defining axis info and styles
		AxisStyle axisStyle = AxisStyle.newAxisStyle(Color.BLACK, 13,
				AxisTextAlignment.CENTER);
		AxisLabels score = AxisLabelsFactory.newAxisLabels("Score", 50.0);
		score.setAxisStyle(axisStyle);
		AxisLabels year = AxisLabelsFactory.newAxisLabels("Year", 50.0);
		year.setAxisStyle(axisStyle);

		// Adding axis info to chart.
		chart.addXAxisLabels(AxisLabelsFactory.newAxisLabels("2002", "2003",
				"2004", "2005"));
		chart.addYAxisLabels(AxisLabelsFactory
				.newNumericRangeAxisLabels(0, 100));
		chart.addYAxisLabels(score);
		chart.addXAxisLabels(year);

		chart.setSize(600, 450);
		chart.setBarWidth(100);
		chart.setSpaceWithinGroupsOfBars(20);
		chart.setDataStacked(true);
		chart.setTitle("Growth Rates", Color.BLACK, 16);
		chart.setGrid(100, 10, 3, 2);
		chart.setBackgroundFill(Fills.newSolidFill(Color.ALICEBLUE));
		LinearGradientFill fill = Fills.newLinearGradientFill(0,
				Color.LAVENDER, 100);
		fill.addColorAndOffset(Color.WHITE, 0);
		chart.setAreaFill(fill);
		
		return chart.toURLString();
	}

	
	public String drawScatterHandler() {
		// EXAMPLE CODE START
		Data d1 = Data.newData(10, 50, 30, 45, 65, 95, 20, 80);
		Data d2 = Data.newData(20, 40, 40, 15, 85, 95, 80, 20);
		Data pointSizes = Data.newData(100, 30, 50, 75, 40, 35, 80, 100);
		ScatterPlotData data = Plots.newScatterPlotData(d1, d2, pointSizes);
		data.setLegend("Performance");
		Color diamondColor = Color.newColor("FF471A");
		data.addShapeMarkers(Shape.DIAMOND, diamondColor, 30);
		data.setColor(diamondColor);
		ScatterPlot chart = GCharts.newScatterPlot(data);
		chart.setSize(600, 450);
		chart.setGrid(20, 20, 3, 2);

		AxisLabels axisLabels = AxisLabelsFactory.newNumericRangeAxisLabels(0,
				100);
		axisLabels.setAxisStyle(AxisStyle.newAxisStyle(Color.WHITE, 13,
				AxisTextAlignment.CENTER));

		chart.addXAxisLabels(axisLabels);
		chart.addYAxisLabels(axisLabels);

		chart.setTitle("Company Performance Plot", Color.WHITE, 16);
		chart.setBackgroundFill(Fills.newSolidFill(Color.newColor("2F3E3E")));
		LinearGradientFill fill = Fills.newLinearGradientFill(0,
				Color.newColor("3783DB"), 100);
		fill.addColorAndOffset(Color.newColor("9BD8F5"), 0);
		chart.setAreaFill(fill);
		
		return chart.toURLString();
	}

}
