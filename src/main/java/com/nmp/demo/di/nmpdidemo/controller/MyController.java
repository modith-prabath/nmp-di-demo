package com.nmp.demo.di.nmpdidemo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

  public String helloWorld(){

    System.out.println("Hello world");

    return "Hi Everyone";
  }
  
}
