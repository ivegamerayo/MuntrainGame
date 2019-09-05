package com.telefonica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.telefonica.services.QuestionService;

@Controller
@RequestMapping("question")
public class QuestionController {

	@Autowired
	private QuestionService questionService;
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("questions", questionService.findAll());
		return "question/index";
	}
}
