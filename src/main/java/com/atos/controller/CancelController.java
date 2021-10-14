package com.atos.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.atos.model.booking_info;
import com.atos.services.CancelService;
import com.atos.services.charge;



@Controller
public class CancelController {
	@Autowired
	private CancelService dao;
	
	
	
	
	@RequestMapping("/cancel")
	public String home()
	{
		System.out.println("Hello this is home urls");
		return "index";
	}
	 @RequestMapping(path="/process",method=RequestMethod.POST)
	public ModelAndView book(HttpServletRequest request,HttpServletResponse response)
	    {
	

	    	String i=request.getParameter("booking_id");
	    	booking_info book= dao.getCustomer(i);
	    	charge ch =new charge();
	    	float charge=ch.cancel(book.getPrice());
	    	float refund=book.getPrice()-charge;
			ModelAndView mv = new ModelAndView();
			mv.addObject("booking_info", book);
			mv.addObject("charge",charge);
			mv.addObject("refund",refund);
			mv.setViewName("display");
			dao.deletebooking(book);
			return mv;
	    
	
	    	
	    }

}

