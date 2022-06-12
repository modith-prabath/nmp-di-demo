package com.nmp.demo.di.nmpdidemo.controller;

import org.springframework.stereotype.Controller;
import com.nmp.demo.di.nmpdidemo.services.PetService;

@Controller
public class PetController  {

  private PetService petService;




  public PetController(PetService petService) {
    this.petService = petService;
  }





  public String whichPetIsTheBest(){
      return petService.getPetType();
  }
}
