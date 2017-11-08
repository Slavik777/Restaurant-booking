package ua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import ua.model.request.ComponentRequest;
import ua.model.request.MealRequest;
import ua.service.ComponentService;
import ua.service.MealService;

@Controller
@RequestMapping("/admin/meal")
@SessionAttributes("meal")
public class AdminMealController {
	private final MealService service;

	@Autowired
	public AdminMealController(MealService service) {
		this.service = service;
	}
	
	@ModelAttribute("meal")
	public MealRequest getForm() {
		return new MealRequest();
	}
	
}
