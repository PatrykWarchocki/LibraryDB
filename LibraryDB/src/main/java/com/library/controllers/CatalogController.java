package com.library.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CatalogController {
	@GetMapping("/bookcat")
	public String showCatalogPage() {
		return "bookcat";
	}
}
