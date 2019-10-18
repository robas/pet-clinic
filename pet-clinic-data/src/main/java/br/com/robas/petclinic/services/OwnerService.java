package br.com.robas.petclinic.services;

import br.com.robas.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);

    Owner save (Owner owner);

    Set<Owner> findAll();

    Owner findByLastName(String lastName);
}
