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
import com.library.tables.Books;
import com.library.tables.Users;
import com.library.tables.Orders;
import com.library.tables.BookPossesion;

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
			// Order Types Fetch
			session.beginTransaction();
			String hql = "FROM OrderType";
			Query<OrderType> query = session.createQuery(hql, OrderType.class);
			List<OrderType> otList = query.getResultList();
			session.getTransaction().commit();

			model.addAttribute("ordertypes", otList);
			////////////
			// Book Fetch
			session.beginTransaction();
			hql = "FROM Books b WHERE b.bookID = :book";
			Query<Books> query2 = session.createQuery(hql, Books.class);
			query2.setParameter("book", bookID);
			Books book = query2.getSingleResult();
			session.getTransaction().commit();

			model.addAttribute("book", book);
			///////////
		}

		model.addAttribute("nextDay", sADayLater);
		model.addAttribute("nextWeek", sAWeekLater);
		model.addAttribute("nextHalf", sAHYLater);
		return "ordering";
	}

	@PostMapping("/order")
	public String confirmOrder(@RequestParam int bookID, @RequestParam LocalDate start, @RequestParam LocalDate end,
			@RequestParam int otype, Model model) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		try (Session session = sessionFactory.openSession()) {
			Orders order = new Orders();
			LocalDate curDate = LocalDate.now();
			order.setOrderDate(curDate);

		}

		model.addAttribute("bookID", bookID);
		return "ordering";
	}
}
