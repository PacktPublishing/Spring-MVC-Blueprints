package org.packt.feedback.portal.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.code.kaptcha.Producer;

@Controller
@RequestMapping("/register.html")
public class RegistrationFormController {

        @Autowired
        private Producer captchaProducer;

        @RequestMapping(method = RequestMethod.GET)
        public String setupForm(
                        ModelMap model,
                        HttpServletRequest request,
                        HttpServletResponse response) throws Exception {
            
                return "registrationform";
        }

}

