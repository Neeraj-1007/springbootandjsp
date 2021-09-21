package com.rays.testSpringBoot.ctl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/role")
public class RoleCtl {
	
	@GetMapping("/")
	public String get() {
		System.out.println("abjkbck");
		return "Welcome";
	}

}
