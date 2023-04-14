package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller 	
public class HomeController
{

 @RequestMapping("/")
	public String home(Model model) {
	 System.out.println("This is Home URL");
	 model.addAttribute("name","Prachi Patel");
	 model.addAttribute("id",222);
	  
	 List<String> friends=new ArrayList<String>();
	 friends.add("aa");	
	 friends.add("bb"); 
	 friends.add("cc"); 
	 friends.add("dd");
	 
	 model.addAttribute("f",friends);
	 
		return "index";
	}
 
 @RequestMapping("/about")
	public String about() {
	 System.out.println("This is About Controller");
		return "about"; 
	}
 @RequestMapping("/help")
 public ModelAndView help() {
	 System.out.println("This is Help Controller");
	 
ModelAndView mav=new ModelAndView();
mav.addObject("name","Prachi");
mav.addObject("rollnumber","104"); 
LocalDateTime now=LocalDateTime.now();
mav.addObject("time",now);
List<Integer> list=new ArrayList<Integer>();

list.add(12);
list.add(67);
list.add(4466);
list.add(333);
list.add(666);
mav.addObject("marks",list);
mav.setViewName("help");
	 return mav;
	 
 }
}
