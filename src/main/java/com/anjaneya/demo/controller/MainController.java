package com.anjaneya.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.connector.Request;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.anjaneya.DataClass;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MainController {
	@GetMapping("/")
	public String callMe() {
		return "home";
	}
	@RequestMapping(value="/error",method = RequestMethod.GET)
	public String error(HttpServletRequest request) {
		return "err";
	}
	@RequestMapping(value="/display",method = RequestMethod.POST)
	public ModelAndView display(HttpServletRequest request) {
		ModelAndView model=new ModelAndView("welcome");
		String uname=request.getParameter("username");
		String password=request.getParameter("password");
		System.out.println(uname+" "+password);
		DataClass dt=new DataClass();
		dt.setUserName(uname);
		dt.setPassword(password);
		model.addObject("data",dt);
		System.out.println(dt);
		return model;
	}
	
}
