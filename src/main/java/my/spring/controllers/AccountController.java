package my.spring.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import my.spring.pojos.Account;

@Controller
public class AccountController {
	@RequestMapping("/")
	public String test() 
	{
		return "index";
	}

	@RequestMapping("/new") // for creating a new bank account
	public String newAccount(Model model) 
	{
		model.addAttribute("command", new Account());
		return "newAccount";
	}

	@RequestMapping("/result") // show the input in the previous page
	public String showAccount() 
	{
		return "showAccount";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveAccount(Model model,  Account account) 
	{
		model.addAttribute("account", account);
		return "showAccount";
	}
/*
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveAccount(Model model, 
			@RequestParam("accountNo") String accountNo,
			@RequestParam("accountHolderName") String accountHolderName,
			@RequestParam("accountBalance") String accountBalance) 
	{
		Account account = 
			new Account(Integer.parseInt(accountNo), accountHolderName, Integer.parseInt(accountBalance));
		model.addAttribute("account", account);
		return "showAccount";
	}
*/
/*	
	 @RequestMapping(value = "/save", method=RequestMethod.POST) 
	 public String saveAccount(Model model,HttpServletRequest request) 
	 { 
		 String accountNo = request.getParameter("accountNo"); 
		 String accountHolderName = request.getParameter("accountHolderName");
		 String balance = request.getParameter("accountBalance"); 
	  
		 Account account = 
				 new Account(Integer.parseInt(accountNo),
						 	accountHolderName,
						 	Integer.parseInt(balance)); 
		 model.addAttribute("account",account); 
		 return "showAccount"; 
	 }
*/
/*
	 @RequestMapping(value = "/save", method=RequestMethod.POST) 
	 public String saveAccount(@ModelAttribute("account") Account account) 
	 { 
	 	return "showAccount"; 
	 }
*/
}
