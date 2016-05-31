package com.statistics.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/statistics")
public class StatisticsController {

	@RequestMapping(value = "/home.do",method=RequestMethod.GET)
	public ModelAndView showIndex() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping(value = "/basicLine.do",method=RequestMethod.GET)
	public ModelAndView showBasicLine() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("basicLine");
		return mav;
	}
	
//	@RequestMapping(value = "/home.do",method=RequestMethod.GET)
//	public String index(){
//		return "index";
//	}
}
