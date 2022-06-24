package com.nmp.demo.di.nmpdidemo.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.nmp.demo.di.services.ConstructorGreetingServiceImpl;

public class PropertyInjectedControllerTest {

  PropertyInjectedController controller;

  @BeforeEach
  void setUp() {

    controller = new PropertyInjectedController();

    controller.greetingService = new ConstructorGreetingServiceImpl();

  }

  @Test
  void getGreeting() {
    System.out.println(controller.getGreeting());

  }
}
