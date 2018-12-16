package crypto.world.demo.services;

import crypto.world.demo.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName (String lastName);

}
