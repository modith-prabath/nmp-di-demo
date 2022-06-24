package com.nmp.demo.di.nmpdidemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.nmp.demo.di.services.GreetingService;

@Controller
public class PropertyInjectedController {
  
  @Qualifier("propertyInjectedGreetingServiceImpl")
  @Autowired
  public GreetingService greetingService;

  public String getGreeting(){
    return greetingService.sayGreeting() ;
  }



  
}
