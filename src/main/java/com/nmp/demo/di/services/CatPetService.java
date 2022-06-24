package com.nmp.demo.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("cats")
@Service
public class CatPetService implements PetService{

  @Override
  public String getPetType() {
    return "Cats are best ";
  }

  
  
}
