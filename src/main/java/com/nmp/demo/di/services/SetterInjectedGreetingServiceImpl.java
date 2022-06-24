package com.nmp.demo.di.services;


import org.springframework.stereotype.Component;


@Component
public class SetterInjectedGreetingServiceImpl implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Hello world -Setter";
  }
  
}
