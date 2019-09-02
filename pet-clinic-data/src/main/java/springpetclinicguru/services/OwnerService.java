package springpetclinicguru.services;

import springpetclinicguru.model.Owner;

public interface OwnerService extends CrudService<OwnerService, Long> {
    Owner findByLastName(String string);
}
