package com.iddw.affiliate.controller;
 
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.NoSuchRequestHandlingMethodException;

import com.iddw.affiliate.service.AffiliateService;
import com.iddw.affiliate.service.SponsorService;
    

/*
 * @author avanderwoude
 * 
 * This controller takes in the JSON requests to store, retrieve, or delete data, and hands it off to the appropriate service
 */

@Controller   
public class SponsorController {  
	
	@Autowired
	@Qualifier("envProperties")
	private Properties envProperties;
	
	SponsorService as = new SponsorService();
    
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ModelAndView test(/*@RequestBody List<AttributeBlob> blobList,*/ HttpServletRequest request, ModelMap modelMap) throws InterruptedException {		
		System.out.println("keyspace: " +envProperties +" - " + envProperties.getProperty("c.keyspace"));
		
		
		return new ModelAndView("view/viewer", modelMap);
	}
	
}

