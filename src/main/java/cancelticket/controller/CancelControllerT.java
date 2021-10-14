package cancelticket.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import cancelticket.entities.booking_info;
import cancelticket.entities.cancel;
import cancelticket.services.CancelService;
import cancelticket.services.CancelServiceT;

@Controller
public class CancelControllerT {

	
	@Autowired
	private CancelServiceT dao;
	
	 @RequestMapping(path="/cancelprocess",method=RequestMethod.POST)
		public ModelAndView book(HttpServletRequest request,HttpServletResponse response)
		{
		 String i=request.getParameter("booking_id");
		 String a=request.getParameter("reason");
		 cancel cn= new cancel();
		 cn.setBooking_id(i);
		 cn.setReason(a);
		cancel retcancel = dao.newcancel(cn);
	System.out.println("Update Controller ::>" + retcancel);
		return new ModelAndView("redirect:/cancelsucessfull");
	}
	@RequestMapping("/cancelsucessfull")
	public String cancel()
	{
		
		return"cancelsucessfull";
	}
}
