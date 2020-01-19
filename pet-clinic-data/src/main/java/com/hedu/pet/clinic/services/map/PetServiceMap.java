package com.hedu.pet.clinic.services.map;

import com.hedu.pet.clinic.model.Pet;
import com.hedu.pet.clinic.services.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, Long>  implements CrudService<Pet, Long> {
    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }
}
