package com.nmp.demo.di.nmpdidemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.nmp.demo.di.nmpdidemo.services.GreetingService;

@Controller
public class ConstructorInjectedController {

  private GreetingService greetingService;
  
  
  @Autowired
  public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl") GreetingService greetingService) {
    this.greetingService = greetingService;
  }
  //for constructor autowired component is optional 

  public String getGreeting(){
    return greetingService.sayGreeting() ;
  }
  
}
