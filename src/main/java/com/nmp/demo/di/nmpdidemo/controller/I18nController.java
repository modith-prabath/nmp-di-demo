package com.nmp.demo.di.nmpdidemo.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.nmp.demo.di.services.GreetingService;

@Controller
public class I18nController {
  
  private GreetingService greetingService;

  public I18nController(@Qualifier("I18NService") GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello(){
    return greetingService.sayGreeting() ;
  }
}
