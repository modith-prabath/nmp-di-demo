package com.nmp.demo.di.nmpdidemo.services;


import org.springframework.stereotype.Component;


@Component
public class SetterInjectedGreetingServiceImpl implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Hello world -Setter";
  }
  
}
