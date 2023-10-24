package com.library.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashController {
	@GetMapping("/dashboard")
	public String showCatalogPage() {
		return "dashboard";
	}
}
