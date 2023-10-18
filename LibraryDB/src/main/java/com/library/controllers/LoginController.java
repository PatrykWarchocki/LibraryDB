package com.library.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.library.tables.Users;
import com.library.HibernateUtil;

//import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

@Controller
public class LoginController {

	
	@GetMapping("/login")
	public String showLoginPage() {
		return "login"; // Return the name of your Thymeleaf template (login.html)
	}

	@PostMapping("/login")
	public String processLogin(@RequestParam String username, @RequestParam String password, Model model) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		boolean authenticated = false;
		// sessionFactory.setAnnotatedClasses(new Class[] { Users.class });

		try (Session session = sessionFactory.openSession()) {
			session.beginTransaction();
			String hql = "FROM Users WHERE login = :username";
			Query<Users> query = session.createQuery(hql, Users.class);
			query.setParameter("username", username);
			Users foundUser = query.getSingleResult();
			session.getTransaction().commit();

		    if (foundUser != null && foundUser.GetPassword().equals(password)) {
		        authenticated = true;
		    } else {
		    	authenticated = false;
		    }

		} catch (Exception e) {
			e.printStackTrace();
		}

		if (authenticated) {
			// If authenticated, you can add user information to the model
			//model.addAttribute("username", username);			
			return "dashboard"; // Redirect to a dashboard page upon successful login
		} else {
			model.addAttribute("error", "Invalid credentials");
			return "login"; // Redirect back to the login page with an error message
		}
	}
}
