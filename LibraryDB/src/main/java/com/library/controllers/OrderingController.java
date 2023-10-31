package com.library.controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.library.HibernateUtil;
import com.library.tables.OrderType;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;


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
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		try (Session session = sessionFactory.openSession()) {
			session.beginTransaction();
			String hql = "FROM OrderType";
			Query<OrderType> query = session.createQuery(hql, OrderType.class);
			List<OrderType> otList = query.getResultList();
			session.getTransaction().commit();
		    
		    model.addAttribute("ordertypes", otList);
		}
		
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
