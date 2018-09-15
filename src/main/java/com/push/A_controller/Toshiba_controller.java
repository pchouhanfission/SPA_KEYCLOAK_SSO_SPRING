package com.push.A_controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Toshiba_controller {

	
	@GetMapping(path = "/")
	public String m1() {
	    return "signin";
	}
	
	
	@GetMapping(path = "/home")
	public String indexa() {
	    return "index";
	}
	@GetMapping(path = "/logout")
	public String index(HttpServletRequest req) throws ServletException {
		req.logout();
	    return "signin";
	}
	

}
