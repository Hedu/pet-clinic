package com.hedu.pet.clinic.services;

import com.hedu.pet.clinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
