package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
@Controller
public class ContactController {
	@RequestMapping("/contact")
public String showForm() {
	return "contact";
}
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model) 
	{
		
//System.out.println(user);
//
//model.addAttribute("user",user);
//		System.out.println("User Email is:"+userEmail);
//		System.out.println("User Name is:"+userName);
//		System.out.println("User Password is:"+userPassword);
//		
//		model.addAttribute("name",userName);
//		model.addAttribute("email",userEmail);
//		model.addAttribute("password",userPassword);
		return "success";
	}
}


//@RequestMapping(path="/processform",method=RequestMethod.POST)
//public String handleForm(@RequestParam("email") String userEmail, 
//		@RequestParam("userName")String userName, 
//		@RequestParam("password")String userPassword,
//Model model) 
//{
//	User user=new User();
//user.setEmail(userEmail);
//user.setUserName(userName);
//user.setPassword(userPassword);
//System.out.println(user);
//
//model.addAttribute("user",user);
////	System.out.println("User Email is:"+userEmail);
////	System.out.println("User Name is:"+userName);
////	System.out.println("User Password is:"+userPassword);
////	
////	model.addAttribute("name",userName);
////	model.addAttribute("email",userEmail);
////	model.addAttribute("password",userPassword);
//	return "success";
//}