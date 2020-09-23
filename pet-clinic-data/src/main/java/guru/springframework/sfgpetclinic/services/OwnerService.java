package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

// This is using CrudService to reduce the amount of redundant code such as findById as it is used in multiple services.
public interface OwnerService extends CrudService<Owner, Long > {
    Owner findByLastName(String lastName);

//    Owner findById(Long id);
//
//    Owner save(Owner owner);
//
//    Set<Owner> findAll();

}
