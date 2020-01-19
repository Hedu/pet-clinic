package com.hedu.pet.clinic.services.map;

import com.hedu.pet.clinic.model.Owner;
import com.hedu.pet.clinic.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long>  implements CrudService<Owner, Long> {
    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }
}
