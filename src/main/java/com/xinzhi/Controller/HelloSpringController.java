package com.xinzhi.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloSpringController {
	String message = "Welcome to SpringMVC";
	
	@RequestMapping("hello")
	public ModelAndView showMessage(@RequestParam(value="name",required=false,defaultValue="defaultName")String name){
		ModelAndView mv = new ModelAndView("hellospring");
		mv.addObject("messagePage",message);
		mv.addObject("namePage",name);
		return mv;
	}
	
	
}
