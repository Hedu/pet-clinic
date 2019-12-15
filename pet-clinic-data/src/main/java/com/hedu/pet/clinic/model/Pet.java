package com.hedu.pet.clinic.model;

import java.time.LocalDate;

public class Pet {

    private clinic.model.PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    public clinic.model.PetType getPetType() {
        return petType;
    }

    public void setPetType(clinic.model.PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
