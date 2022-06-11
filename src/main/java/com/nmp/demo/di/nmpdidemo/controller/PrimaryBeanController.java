package com.nmp.demo.di.nmpdidemo.controller;

import org.springframework.stereotype.Controller;

import com.nmp.demo.di.nmpdidemo.services.GreetingService;

@Controller
public class PrimaryBeanController {

  private final GreetingService greetingService ;

  public PrimaryBeanController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String getGreeting(){
    return greetingService.sayGreeting() ;
  }
}
