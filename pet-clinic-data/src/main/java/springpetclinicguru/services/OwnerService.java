package springpetclinicguru.services;

import springpetclinicguru.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findById(Long id);

    Owner findByLastName(String string);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
