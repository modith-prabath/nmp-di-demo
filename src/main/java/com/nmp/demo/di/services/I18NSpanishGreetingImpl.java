package com.nmp.demo.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("I18NService")
public class I18NSpanishGreetingImpl implements GreetingService{

  @Override
  public String sayGreeting() {

    
    return "Hola Madrid-ES";
  }
  

}