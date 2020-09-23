package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

// This is using CrudService to reduce the amount of redundant code such as findById as it is used in multiple services.
public interface PetService extends CrudService<Pet, Long > {
//    Pet findById(Long id);
//
//    Pet save(Pet pet);
//
//    Set<Pet> findAll();
}
