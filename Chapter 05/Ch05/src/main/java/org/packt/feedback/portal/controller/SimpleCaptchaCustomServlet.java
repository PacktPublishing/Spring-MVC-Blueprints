package org.packt.feedback.portal.controller;

import static nl.captcha.Captcha.NAME;

import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nl.captcha.Captcha;
import nl.captcha.backgrounds.FlatColorBackgroundProducer;
import nl.captcha.gimpy.FishEyeGimpyRenderer;
import nl.captcha.noise.CurvedLineNoiseProducer;
import nl.captcha.servlet.CaptchaServletUtil;
import nl.captcha.servlet.SimpleCaptchaServlet;
import nl.captcha.text.producer.DefaultTextProducer;
import nl.captcha.text.renderer.DefaultWordRenderer;

public class SimpleCaptchaCustomServlet extends SimpleCaptchaServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			
			List<java.awt.Font> textFonts = Arrays.asList(
			     new Font("Arial", Font.BOLD, 40), 
			     new Font("Courier", Font.BOLD, 40));
		    Captcha captcha = new Captcha.Builder(250, 90).addText()
				.addBackground(new FlatColorBackgroundProducer(Color.YELLOW))
				.gimp(new FishEyeGimpyRenderer())
				.addNoise(new CurvedLineNoiseProducer())
				.addText(new DefaultTextProducer(5), 
						 new DefaultWordRenderer(Color.RED, textFonts))
				.build();

		    CaptchaServletUtil.writeImage(resp, captcha.getImage());
		    req.getSession().setAttribute(NAME, captcha);
	}
}
