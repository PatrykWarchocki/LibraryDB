package com.library.controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.library.HibernateUtil;
import com.library.tables.Books;

@Controller
public class BookViewController {
	@GetMapping("/bookview")
	public String viewBook(@RequestParam int bookID) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		try (Session session = sessionFactory.openSession()) {
			session.beginTransaction();
			String hql = "FROM Books b WHERE b.bookID = :book";
			Query<Books> query = session.createQuery(hql, Books.class);
			query.setParameter("book", bookID);
			Books foundBook = query.getSingleResult();
			session.getTransaction().commit();
			
			System.out.println(foundBook.getTitle());
		}
		
		return "bookview";
	}
}
