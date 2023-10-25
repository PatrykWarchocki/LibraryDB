package com.library.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.library.tables.Users;

import jakarta.persistence.NoResultException;

import com.library.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String showLoginPage() {
		return "login";
	}

	@PostMapping("/login")
	public String processLogin(@RequestParam String username, @RequestParam String password, Model model) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		boolean authenticated = false;
		String errorMessage = null;
		int role = 0;

		try (Session session = sessionFactory.openSession()) {
			session.beginTransaction();
			String hql = "FROM Users u WHERE u.login = :username";
			Query<Users> query = session.createQuery(hql, Users.class);
			query.setParameter("username", username);
			Users foundUser = query.getSingleResult();
			session.getTransaction().commit();

			if (foundUser != null && foundUser.getPassword().equals(password)) {
				authenticated = true;
				role = foundUser.getRole().getRoleID();
			} else {
				authenticated = false;
				errorMessage = "Invalid credentials";
			}

		} catch (NoResultException e) {
			errorMessage = "User doesn't exist";
		}

		if (authenticated) {
			// model.addAttribute("username", username);
			switch (role) {
			case 1:
				return "redirect:/bookcat";
			case 2:
				return "redirect:/dashboard";
			}

			// Shouldn't happen but better safe than sorry
			errorMessage = "Error: User has no role!";
			model.addAttribute("error", errorMessage);
			return "login";

		} else {
			model.addAttribute("error", errorMessage);
			return "login";
		}
	}
}
