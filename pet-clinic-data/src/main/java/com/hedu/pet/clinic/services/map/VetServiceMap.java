package com.hedu.pet.clinic.services.map;

import com.hedu.pet.clinic.model.Vet;
import com.hedu.pet.clinic.services.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long>  implements CrudService<Vet, Long> {
    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(), vet);
    }
}
