package com.example.springkadaiform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.springkadaiform.form.ContactForm;

import jakarta.validation.Valid;

@Controller
public class ContactFormController {
	
	// フォーム表示
	@GetMapping("/form")
	public String showForm(Model model) {
		if(!model.containsAttribute("contactForm")) {
			model.addAttribute("contactForm", new ContactForm());
		}
		return "contactFormView";
	}
	
	@PostMapping("/form/confirm")
	public String confirm(
			@Valid
			@ModelAttribute("contactForm")
			ContactForm contactForm,BindingResult bindingResult,Model model) {
		
		if(bindingResult.hasErrors()) {
			return "contactFormView";
		}
		
		return "confirmView";
	}

}
