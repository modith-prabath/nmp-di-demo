package com.nmp.demo.di.nmpdidemo.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.nmp.demo.di.nmpdidemo.services.ConstructorGreetingServiceImpl;

public class SetterInjectedControllerTest {

  SetterInjectedController  controller;

  @BeforeEach
  void setUp() {

    controller = new SetterInjectedController();
    controller.setGreetingService(new ConstructorGreetingServiceImpl());

  }



  @Test
  void testGetGreeting() {

    System.out.println(controller.getGreeting());

  }

 

}
