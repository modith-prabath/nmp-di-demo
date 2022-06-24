package com.nmp.demo.di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class PrimayBeanGreetingServiceImpl implements GreetingService {

  @Override
  public String sayGreeting() {

    return "Hello world -this is a primary bean ";
  }
  
}
