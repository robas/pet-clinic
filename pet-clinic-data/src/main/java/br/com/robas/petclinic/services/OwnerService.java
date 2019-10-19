package br.com.robas.petclinic.services;

import br.com.robas.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
