package my.spring.controllers;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping(path= {"","/","/index","/index*"})
	public String index()
	{
		return "testRequestMapping";
	}
	
	@RequestMapping("/name")
	public String methodWithParams(
			@RequestParam(value="userName", required=false, defaultValue="Guest") String userName, 
			Model model)
	{
		System.out.println("Page requested by "+ userName);
		model.addAttribute("userName", userName);
		return "testRequestMapping";
	}
	
	@RequestMapping(value= {"dynamic/{userName}","/dynamic/{category:[a-z]+}/{userName}"})
	public String dynamicURL(@PathVariable("userName") String userName)
	{
		return "testRequestMapping";
	}
	
	@RequestMapping("*")
	public String fallBackPage()
	{
		return "fileNotFound";
	}
}
