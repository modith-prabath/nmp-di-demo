package com.nmp.demo.di.nmpdidemo.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingServiceImpl  implements GreetingService{

  @Override
  public String sayGreeting() {

    return "Hello, world- Property";
  }
  
}
