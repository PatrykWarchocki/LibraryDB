package com.library.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OrderingController {
	@GetMapping("/order")
	public String manageOrder(@RequestParam int bookID, Model model) {
		model.addAttribute("bookID", bookID);
		return "ordering";
	}
	
	@PostMapping("/order")
	public String confirmOrder(@RequestParam int bookID, Model model) {
		model.addAttribute("bookID", bookID);
		return "ordering";
	}
}
