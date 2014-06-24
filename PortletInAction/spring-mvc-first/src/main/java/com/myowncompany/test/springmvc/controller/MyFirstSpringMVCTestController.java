package com.myowncompany.test.springmvc.controller;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

import com.myowncompany.test.springmvc.bo.Thing;

@Controller(value = "MyFirstSpringMVCTestController")  
@RequestMapping("VIEW")
public class MyFirstSpringMVCTestController {
	@RenderMapping  
	 public String sayHello(RenderRequest request,RenderResponse response,Model model){  
	    
		return "defaultRender";  
	 }  
	
	@ResourceMapping("thingResource")
	public View getThing(){
	    Thing thing = new Thing();
	    thing.setThing1("I am thing 1");
	    thing.setThing2("thing 2");
	    MappingJacksonJsonView view = new MappingJacksonJsonView();
	    view.addStaticAttribute("thingObject", thing);
	    return view;
	}
}
