package com.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Random;

@Controller
public class myDemoController 
{
	private String[] quotes= {"To be or not to be - shakespeare","Spring in natures way of saying Let's Party",
			"The time is alwyas right to do what is right"};
	@RequestMapping(value="/getQuote")
	public String  getRandomQuote(Model model)
	{
		int rand=new Random().nextInt(quotes.length);
		String randomQuote=quotes[rand];
		model.addAttribute("randomQuote",randomQuote);
		return "quote";
	}

}
