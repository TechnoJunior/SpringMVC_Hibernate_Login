package com.technoboy.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.technoboy.entity.User;
import com.technoboy.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public ModelAndView loadLoginpage() {
		ModelAndView mv = new ModelAndView();
		User user = new User();
		mv.addObject("user", user);
		mv.setViewName("login");
		return mv;
	}
	
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public ModelAndView processLoginPage(@ModelAttribute("user")User user) throws SQLException {
		ModelAndView mv = new ModelAndView();
		boolean status=userService.login(user);
		if(status) {
			mv.setViewName("success");
			mv.addObject("msg","Successfully Logged In");
		}
		else {
			mv.setViewName("error");
			mv.addObject("msg","Invalid Creditentials");
		}
		return mv;
	}
}