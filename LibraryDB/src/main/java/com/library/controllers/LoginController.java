package com.library.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	boolean authenticated;
	
    @GetMapping("/login")
    public String showLoginPage() {
        return "login"; // Return the name of your Thymeleaf template (login.html)
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String username, @RequestParam String password, Model model) {
        // Use Hibernate or your authentication logic here

        if (authenticated) {
            // If authenticated, you can add user information to the model
            model.addAttribute("username", username);
            return "dashboard"; // Redirect to a dashboard page upon successful login
        } else {
            model.addAttribute("error", "Invalid credentials");
            return "login"; // Redirect back to the login page with an error message
        }
    }
}
