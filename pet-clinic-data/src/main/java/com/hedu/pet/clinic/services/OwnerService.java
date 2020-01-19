package com.hedu.pet.clinic.services;

import com.hedu.pet.clinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
