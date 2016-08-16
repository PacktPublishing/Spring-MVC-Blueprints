package org.packt.human.resource.portal.controller;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.Map;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategorySeriesLabelGenerator;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.servlet.ServletUtilities;
import org.jfree.chart.title.TextTitle;
import org.jfree.chart.urls.StandardCategoryURLGenerator;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.packt.human.resource.portal.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminJFreeChartController {
	// Data for scatter plot

	private final XYSeries series = new XYSeries("Data");

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/hrms/admin_charts", method = RequestMethod.GET)
	public String getCharts(Model model, HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String adminBarChart = createBarCharts(request, response);
		String adminLineChart = createLineGraph(request, response);
		String adminPieChart = createPieChart(request, response);
		String admin3DPieChart = createPie3DCharts(request, response);
		String admin3DBarChart = create3DBarCharts(request, response);
		String adminScatterPlot = createScatterPlots(request, response);
		String adminOneLineChart = createLineChart(request, response);

		model.addAttribute("adminBarChart", adminBarChart);
		model.addAttribute("adminLineChart", adminLineChart);
		model.addAttribute("adminOneLineChart", adminOneLineChart);
		model.addAttribute("adminPieChart", adminPieChart);
		model.addAttribute("admin3DPieChart", admin3DPieChart);
		model.addAttribute("admin3DBarChart", admin3DBarChart);
		model.addAttribute("adminScatterPlot", adminScatterPlot);
		return "admin_charts";
	}

	private String createBarCharts(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Map<String, Integer> tblUsers = loginService.mapUsers();
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue(tblUsers.get("admin"), "Admin", "Admin");
		dataset.addValue(tblUsers.get("hr"), "HR Mgr", "HR Mgr");
		dataset.addValue(tblUsers.get("employee"), "Employees", "Employees");
		
		final JFreeChart chart = ChartFactory.createBarChart(
				"Frequency Bar Chart", "User Type", "No. of Users", dataset,
				PlotOrientation.VERTICAL, true, true, false);
		chart.setBackgroundPaint(Color.white);
		final TextTitle subtitle = new TextTitle(
				"The frequency Bar Chart of Alibata Business Inc. employees from 1990 - 2016.");
		subtitle.setFont(new Font("Calibri", Font.PLAIN, 12));
		chart.addSubtitle(subtitle);

		final CategoryPlot plot = chart.getCategoryPlot();
		plot.setForegroundAlpha(0.5f);

		plot.setBackgroundPaint(Color.lightGray);
		plot.setDomainGridlinesVisible(true);
		plot.setDomainGridlinePaint(Color.white);
		plot.setRangeGridlinesVisible(true);
		plot.setRangeGridlinePaint(Color.white);

		final CategoryAxis domainAxis = plot.getDomainAxis();
		domainAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_45);
		domainAxis.setLowerMargin(0.0);
		domainAxis.setUpperMargin(0.0);
		final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
		rangeAxis.setLabelAngle(0.5 * Math.PI / 2.0);

		ChartRenderingInfo info = null;
		info = new ChartRenderingInfo(new StandardEntityCollection());

		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		String filename = ServletUtilities.saveChartAsPNG(chart, 700, 300,
				info, session);
		ChartUtilities.writeImageMap(out, "imgMap", info, false);
		String file = request.getContextPath() + "/hrms/chart?filename="
				+ filename;

		return file;
	}

	private String createLineGraph(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();

		String filename = createXYLineChart(session, "Rate of Hirees", "Years",
				"No. of Hires", 700, 300, "imgMap", out);

		String file = request.getContextPath() + "/hrms/chart?filename="
				+ filename;
		return file;
	}

	
	private String createXYLineChart(HttpSession session, String title,
			String xtitle, String ytitle, int width, int height, String useMap,
			PrintWriter pw) {
		XYDataset xydataset = getXYDataset();
		String filename = "";

		JFreeChart chart = ChartFactory.createXYLineChart(title, xtitle,
				ytitle, xydataset, PlotOrientation.VERTICAL, true, true, true);
		chart.setTitle(new TextTitle(title, new Font("Calibri",
				Font.ITALIC, 12)));
		chart.getTitle().setFont(new Font("Calibri", Font.PLAIN, 12));
		chart.setBackgroundPaint(Color.white);

		/*
		 
		final XYPlot xyplot = (XYPlot) jfreechart.getPlot();
		xyplot.setBackgroundPaint(Color.lightGray);
		xyplot.setDomainGridlinePaint(Color.white);
		xyplot.setDomainGridlinesVisible(true);
		xyplot.setRangeGridlinePaint(Color.white);
		xyplot.setAxisOffset(new RectangleInsets(5D, 5D, 5D, 5D));

		final ValueAxis categoryAxis = xyplot.getDomainAxis();
		// categoryAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_45);
		categoryAxis.setLabelFont(new Font("Calibri", Font.TYPE1_FONT, 12));
		categoryAxis.setTickLabelFont(new Font("Calibri", Font.TYPE1_FONT, 12));

		NumberAxis numberAxis = (NumberAxis) xyplot.getRangeAxis();
		numberAxis.setLabelFont(new Font("Calibri", Font.TYPE1_FONT, 12));
		numberAxis.setTickLabelFont(new Font("Calibri", Font.TYPE1_FONT, 12));
		numberAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
		numberAxis.setAutoRangeIncludesZero(true);

		XYLineAndShapeRenderer xylineandshaperenderer = (XYLineAndShapeRenderer) xyplot
				.getRenderer();
		xylineandshaperenderer.setShapesVisible(true);
		xylineandshaperenderer.setShapesFilled(true);

		xylineandshaperenderer.setSeriesLinesVisible(0, false);
		xylineandshaperenderer.setSeriesShapesVisible(1, false);
		xyplot.setRenderer(xylineandshaperenderer);

		xylineandshaperenderer.setSeriesStroke(0, new BasicStroke(2.0F, 1, 1,
				1.0F, new float[] { 10F, 6F }, 0.0F));
		xylineandshaperenderer.setSeriesStroke(1, new BasicStroke(2.0F, 1, 1,
				1.0F, new float[] { 6F, 6F }, 0.0F));
		xylineandshaperenderer.setSeriesStroke(2, new BasicStroke(2.0F, 1, 1,
				1.0F, new float[] { 2.0F, 6F }, 0.0F));

		xylineandshaperenderer
				.setBaseItemLabelGenerator(new IntervalXYItemLabelGenerator(
						"({1},{2})", NumberFormat.getNumberInstance(),
						NumberFormat.getNumberInstance()));
		xylineandshaperenderer.setURLGenerator(new StandardXYURLGenerator(
				"/hrms/admin_charts", "seriesName", "itemName"));

		xylineandshaperenderer.setLegendTextFont(0, new Font("Calibri",
				Font.TYPE1_FONT, 12));
		xylineandshaperenderer.setLegendTextFont(1, new Font("Calibri",
				Font.TYPE1_FONT, 12));
		xylineandshaperenderer.setLegendTextFont(2, new Font("Calibri",
				Font.TYPE1_FONT, 12));
         */
		
	      
	      final XYPlot plot = chart.getXYPlot( );
	      XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer( );
	      renderer.setSeriesPaint( 0 , Color.RED );
	      renderer.setSeriesPaint( 1 , Color.GREEN );
	      renderer.setSeriesPaint( 2 , Color.YELLOW );
	      renderer.setSeriesStroke( 0 , new BasicStroke( 4.0f ) );
	      renderer.setSeriesStroke( 1 , new BasicStroke( 3.0f ) );
	      renderer.setSeriesStroke( 2 , new BasicStroke( 2.0f ) );
	      plot.setRenderer( renderer );
		ChartRenderingInfo info = new ChartRenderingInfo(new StandardEntityCollection());

		try {
			filename = ServletUtilities.saveChartAsPNG(chart, width,
					height, info, session);
			ChartUtilities.writeImageMap(pw, useMap, info, false);
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return filename;
	}
	
	private String createLineChart(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String file = "";
		JFreeChart chart = ChartFactory.createLineChart(
				"Turnover Rates",
				"Years",
				"No. of Resignation",
		         createDataset(),
		         PlotOrientation.VERTICAL,
		         true,true,false);
		         
		chart.setBackgroundPaint(Color.white);
		final TextTitle subtitle = new TextTitle(
				" The chart shows the distribution of turnover rates.");
		subtitle.setFont(new Font("Calibri", Font.PLAIN, 12));

		chart.addSubtitle(subtitle);

		ChartRenderingInfo info = null;

		info = new ChartRenderingInfo(new StandardEntityCollection());
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		try {
			file = ServletUtilities.saveChartAsPNG(chart, 700,
					300, info, session);
			ChartUtilities.writeImageMap(out, "imgMap", info, false);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String filename = request.getContextPath() + "/hrms/chart?filename="
				+ file;
		return filename;
	}
	
	private DefaultCategoryDataset createDataset() {
	      DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
	      dataset.addValue( 5 , "resignation" , "2010" );
	      dataset.addValue( 10 , "resignation" , "2011" );
	      dataset.addValue( 8 , "resignation" ,  "2012" );
	      dataset.addValue( 10 , "resignation" , "2013" );
	      dataset.addValue( 7 , "resignation" , "2014" );
	      dataset.addValue( 8 , "resignation" , "2015" );
	      return dataset;
	   }

	private XYDataset getXYDataset() {
		XYSeries xyseries = new XYSeries("Supervisor");
		xyseries.add((Integer) 1, (Integer) 1);
		xyseries.add((Integer) 5, (Integer) 2);
		xyseries.add((Integer) 10, (Integer) 3);
		xyseries.add((Integer) 15, (Integer) 5);
		xyseries.add((Integer) 20, (Integer) 5);
		xyseries.add((Integer) 25, (Integer) 7);
		xyseries.add((Integer) 30, (Integer) 7);
		xyseries.add((Integer) 50, (Integer) 8);

		XYSeries xyseries1 = new XYSeries("Manager");
		xyseries1.add((Integer) 1, (Integer) 0);
		xyseries1.add((Integer) 5, (Integer) 1);
		xyseries1.add((Integer) 10, (Integer) 1);
		xyseries1.add((Integer) 15, (Integer) 1);
		xyseries1.add((Integer) 20, (Integer) 2);
		xyseries1.add((Integer) 25, (Integer) 1);
		xyseries1.add((Integer) 30, (Integer) 1);
		xyseries1.add((Integer) 50, (Integer) 1);

		XYSeries xyseries2 = new XYSeries("Clerk");
		xyseries2.add((Integer) 1, (Integer) 1);
		xyseries2.add((Integer) 5, (Integer) 1);
		xyseries2.add((Integer) 10, (Integer) 1);
		xyseries2.add((Integer) 15, (Integer) 1);
		xyseries2.add((Integer) 20, (Integer) 1);
		xyseries2.add((Integer) 25, (Integer) 2);
		xyseries2.add((Integer) 30, (Integer) 1);
		xyseries2.add((Integer) 50, (Integer) 2);

		XYSeriesCollection xyseriescollection = new XYSeriesCollection();
		xyseriescollection.addSeries(xyseries);
		xyseriescollection.addSeries(xyseries1);
		xyseriescollection.addSeries(xyseries2);
		return xyseriescollection;

	}

	private String createPie3DCharts(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Map<String, Integer> tblUsers = loginService.mapUsers();

		final DefaultPieDataset dataset = new DefaultPieDataset();
		dataset.setValue("Administrator", tblUsers.get("admin"));
		dataset.setValue("HR Manager", tblUsers.get("hr"));
		dataset.setValue("Employee", tblUsers.get("employee"));

		final JFreeChart chart = ChartFactory.createPieChart3D("User Types ",
				dataset, true, true, false);

		chart.setBackgroundPaint(Color.white);
		final TextTitle subtitle = new TextTitle(
				" The chart shows the classification of users.");
		subtitle.setFont(new Font("Calibri", Font.PLAIN, 12));

		chart.addSubtitle(subtitle);

		ChartRenderingInfo info = null;

		info = new ChartRenderingInfo(new StandardEntityCollection());
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		String filename = ServletUtilities.saveChartAsPNG(chart, 700, 300,
				info, session);
		ChartUtilities.writeImageMap(out, "imgMap", info, false);
		String file = request.getContextPath() + "/hrms/chart?filename="
				+ filename;
		return file;
	}

	
	private String createPieChart(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Map<String, Integer> tblUsers = loginService.mapUsers();

		final DefaultPieDataset dataset = new DefaultPieDataset();
		dataset.setValue("Administrator", tblUsers.get("admin"));
		dataset.setValue("HR Manager", tblUsers.get("hr"));
		dataset.setValue("Employee", tblUsers.get("employee"));

		final JFreeChart chart = ChartFactory.createPieChart("User Types ",
				dataset, true, true, false);

		chart.setBackgroundPaint(Color.white);
		final TextTitle subtitle = new TextTitle(
				" The chart shows the classification of users.");
		subtitle.setFont(new Font("Calibri", Font.PLAIN, 12));

		chart.addSubtitle(subtitle);

		ChartRenderingInfo info = null;

		info = new ChartRenderingInfo(new StandardEntityCollection());
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		String filename = ServletUtilities.saveChartAsPNG(chart, 700, 300,
				info, session);
		ChartUtilities.writeImageMap(out, "imgMap", info, false);
		String file = request.getContextPath() + "/hrms/chart?filename="
				+ filename;
		return file;
	}

	private String create3DBarCharts(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Map<String, Integer> tblUsers = loginService.mapUsers();
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue(tblUsers.get("admin"), "Admin", "Admin");
		dataset.addValue(tblUsers.get("hr"), "HR Mgr", "HR Mgr");
		dataset.addValue(tblUsers.get("employee"), "Employees", "Employees");

		String filename = "";
		JFreeChart chart = ChartFactory.createBarChart3D("Frequency Bar Chart",
				"User Type", "No. of Users", dataset, PlotOrientation.VERTICAL,
				true, true, true);
		Font font = new Font("Calibri", Font.BOLD, 12);
		TextTitle barTitle = new TextTitle(
				"The frequency Bar Chart of Alibata Business Inc. employees from 1990 - 2016.",
				font);
		chart.setTitle(barTitle);
		chart.getLegend().setItemFont(new Font("Calibri", Font.PLAIN, 12));
		// chart.getLegend().setItemLabelPadding(new RectangleInsets());
		CategoryPlot plot = chart.getCategoryPlot();

		CategoryAxis domainAxis = plot.getDomainAxis();
		domainAxis.setLowerMargin(0.1);
		domainAxis.setUpperMargin(0.1);
		domainAxis.setCategoryLabelPositionOffset(10);
		domainAxis.setCategoryMargin(0.2);

		domainAxis.setTickLabelFont(font);

		domainAxis.setLabelFont(font);

		ValueAxis rangeAxis = plot.getRangeAxis();
		rangeAxis.setUpperMargin(0.1);
		rangeAxis.setTickLabelFont(font);

		rangeAxis.setLabelFont(font);

		BarRenderer renderer;

		renderer = new BarRenderer3D();
		renderer.setBaseToolTipGenerator(new StandardCategoryToolTipGenerator());
		renderer.setBaseItemURLGenerator(new StandardCategoryURLGenerator(
				"/hrms/admin_charts", "type", "school"));

		renderer.setIncludeBaseInRange(true);
		renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator(
				"{0}={2}", NumberFormat.getNumberInstance()));
		renderer.setBaseOutlinePaint(Color.red);
		renderer.setSeriesPaint(0, new Color(0, 255, 255));
		renderer.setSeriesOutlinePaint(0, Color.BLACK);
		renderer.setSeriesPaint(1, new Color(0, 255, 0));
		renderer.setSeriesOutlinePaint(1, Color.red);
		renderer.setItemMargin(0.1);
		renderer.setLegendItemLabelGenerator(new StandardCategorySeriesLabelGenerator(
				"{0}"));
		renderer.setBaseItemLabelsVisible(true);
		plot.setRenderer(renderer);

		plot.setDomainAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
		plot.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
		StandardEntityCollection sec = new StandardEntityCollection();
		ChartRenderingInfo info = new ChartRenderingInfo(sec);
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		try {
			filename = ServletUtilities.saveChartAsPNG(chart, 700, 350, info,
					session);
			ChartUtilities.writeImageMap(out, "imgMap", info, false);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String file = request.getContextPath() + "/hrms/chart?filename="
				+ filename;
		return file;

	}

	private String createScatterPlots(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();

		JFreeChart chart = ChartFactory
				.createScatterPlot("User Access", "X", "Y", createSampleData(),
						PlotOrientation.VERTICAL, true, true, false);
		XYPlot xyPlot = (XYPlot) chart.getPlot();
		xyPlot.setDomainCrosshairVisible(true);
		xyPlot.setRangeCrosshairVisible(true);
		XYItemRenderer renderer = xyPlot.getRenderer();
		renderer.setSeriesPaint(0, Color.blue);
		adjustAxis((NumberAxis) xyPlot.getDomainAxis(), true);
		adjustAxis((NumberAxis) xyPlot.getRangeAxis(), false);
		xyPlot.setBackgroundPaint(Color.white);

		ChartRenderingInfo info = null;

		info = new ChartRenderingInfo(new StandardEntityCollection());

		String filename = ServletUtilities.saveChartAsPNG(chart, 700, 300,
				info, session);
		ChartUtilities.writeImageMap(out, "imgMap", info, false);
		String file = request.getContextPath()
				+ "/hrms/chart?filename=" + filename;

		return file;
	}

	private XYDataset createSampleData() {
		Random random = new Random();
		XYSeriesCollection xySeriesCollection = new XYSeriesCollection();

		for (int i = 0; i < 64; i++) {
			series.add(random.nextGaussian(), random.nextGaussian());
		}
		xySeriesCollection.addSeries(series);

		return xySeriesCollection;
	}

	private void adjustAxis(NumberAxis axis, boolean vertical) {
		axis.setRange(-3.0, 3.0);
		axis.setTickUnit(new NumberTickUnit(0.5));
		axis.setVerticalTickLabels(vertical);
	}

}
