package com.codingrecipe.reciperecommender.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * When Spring scans the package, it will recognize this bean as being a Controller bean for processing requests.
 */
@Controller
public class RecipeRecommenderController {
	
	/**
	 * Tells Spring that this Controller should process all requests beginning with "/welcome" in the URL path. 
	 * That includes /welcome/* and /welcome.html.
	 */
	@RequestMapping("welcome") // what the heck is this?
	// public ModelAndView recommendRecipe() works too
	public ModelAndView recommendRecipe(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

 
		// Tomcat supports hot deploy
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>Recipe Recommender</h3></div><br><br>";
//		return new ModelAndView("welcome", // view name
//				"message", // model name
//				message); // model object
//		
		return new ModelAndView("welcome");

	}

}
