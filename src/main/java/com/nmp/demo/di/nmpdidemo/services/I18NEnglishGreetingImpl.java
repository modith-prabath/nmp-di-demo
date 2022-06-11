package com.nmp.demo.di.nmpdidemo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("I18NService")
public class I18NEnglishGreetingImpl implements GreetingService{

  @Override
  public String sayGreeting() {


    return "Hello tottenham -";
  }
  

}
