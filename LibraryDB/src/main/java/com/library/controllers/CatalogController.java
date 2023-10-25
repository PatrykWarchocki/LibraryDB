package com.library.controllers;

//import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.library.HibernateUtil;
import com.library.tables.Books;

@Controller
public class CatalogController {
	@GetMapping("/bookcat")
	public String showCatalogPage(Model model) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		try (Session session = sessionFactory.openSession()) {
			session.beginTransaction();
			String hql = "FROM Books b";
			Query<Books> query = session.createQuery(hql, Books.class);
			List<Books> bookList = query.getResultList();
			session.getTransaction().commit();
			
//		    List<String> titles = new ArrayList<>();
//		    for(int i = 1; i < bookList.size(); i++)
//		    	titles.add(bookList.get(i).getTitle());
		    
		    model.addAttribute("books", bookList);
		}
		
		return "bookcat";
	}
}
