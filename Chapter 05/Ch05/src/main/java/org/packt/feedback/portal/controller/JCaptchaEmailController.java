/*
 *  Author: Sherwin John Caleja-Tragura
 *  Version: 1.0
 */
package org.packt.feedback.portal.controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.octo.captcha.service.image.ImageCaptchaService;

/*
 *  This controller provides the mechanism on how to integrate JCaptcha
 *  to the view page.
 */
@Controller
public class JCaptchaEmailController {
	
	@Resource(name = "imageCaptchaService")
	private ImageCaptchaService imageCaptchaService;
	
	@RequestMapping(value = "/cfs/captcha/emailCaptcha")
    public String ImageCaptcha(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        byte[] captchaChallengeAsJpeg = null;
        ByteArrayOutputStream jpegOutputStream = new ByteArrayOutputStream();
        try {
            String sessionid = request.getSession().getId();
            BufferedImage challenge = imageCaptchaService.getImageChallengeForID(sessionid, request.getLocale());
            ImageIO.write(challenge, "jpeg", jpegOutputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
        captchaChallengeAsJpeg = jpegOutputStream.toByteArray();
        response.setHeader("Cache-Control", "no-store");
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/jpeg");
        ServletOutputStream responseOutputStream = response.getOutputStream();
        responseOutputStream.write(captchaChallengeAsJpeg);
        responseOutputStream.flush();
        responseOutputStream.close();
        
        return null;
    }
	
	
}
