package com.nmp.demo.di.nmpdidemo.services;

import org.springframework.stereotype.Component;

@Component
public class ConstructorGreetingServiceImpl implements GreetingService {

  @Override
  public String sayGreeting() {

    return "Hello World - Constructor";
  }
  
}
