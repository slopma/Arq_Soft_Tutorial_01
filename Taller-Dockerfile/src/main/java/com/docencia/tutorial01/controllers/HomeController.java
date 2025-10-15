package com.docencia.tutorial01.controllers;


import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class HomeController {


@GetMapping("/")

public String index(Model model) {

model.addAttribute("title", "Welcome to Spring Boot");

model.addAttribute("subtitle", "An Spring Boot Eafit App");

return "home/index";

}


@GetMapping("/about")

public String about(Model model) {

model.addAttribute("title", "About Us - Online Store");

model.addAttribute("subtitle", "About Us");

model.addAttribute("description", "This is an about page of a Spring Boot web application");

model.addAttribute("author", "Developed by: Sara López Marín");

return "home/about";

}

@GetMapping("/contact")

public String contact(Model model) {

model.addAttribute("title", "Contact Us");

model.addAttribute("subtitle", "Contact Us");

model.addAttribute("Email", " Email: random123@gmail.com");

model.addAttribute("Phone", " Phone: +34 123 456 789");

model.addAttribute("Adress", " Adress: 123 Main St, City, Country");

return "home/contact";

}

}