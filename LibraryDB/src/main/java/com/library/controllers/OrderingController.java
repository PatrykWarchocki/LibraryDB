package com.library.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@Controller
public class OrderingController {
	@GetMapping("/order")
	public String manageOrder(@RequestParam int bookID, Model model) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		LocalDate curDate = LocalDate.now();
		LocalDate aDayLater = curDate.plusDays(1);
		String sADayLater = aDayLater.format(formatter);
		LocalDate aWeekLater = curDate.plusWeeks(1);
		String sAWeekLater = aWeekLater.format(formatter);
		LocalDate aHYLater = curDate.plusMonths(6);
		String sAHYLater = aHYLater.format(formatter);
		
		model.addAttribute("bookID", bookID);
		model.addAttribute("nextDay", sADayLater);
		model.addAttribute("nextWeek", sAWeekLater);
		model.addAttribute("nextHalf", sAHYLater);
		return "ordering";
	}
	
	@PostMapping("/order")
	public String confirmOrder(@RequestParam int bookID, Model model) {
		model.addAttribute("bookID", bookID);
		return "ordering";
	}
}
