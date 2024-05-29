package com.asterisc.in.pack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.asterisc.in.pack.model.Student;

import repo.StudentRrpo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	
	
	@Autowired
	StudentRrpo db;
	
	@RequestMapping("/")
	String fun(Model m)
	{
		Student s=new Student();
		
		System.out.println("before send to page "+s);
		
		m.addAttribute("obj",s);
		
		return "register.html";
	}

	@RequestMapping("/reg")
	@ResponseBody
	String fun2(@ModelAttribute Student s)
	{
		System.out.println("After from Register page Submit to page "+s);
		
		db.save(s);
		
		
		
		return "Student Register";
	}
}
