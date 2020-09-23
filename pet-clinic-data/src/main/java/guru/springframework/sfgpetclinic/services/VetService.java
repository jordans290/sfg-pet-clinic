package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

// This is using CrudService to reduce the amount of redundant code such as findById as it is used in multiple services.
public interface VetService extends CrudService<Vet, Long > {
//    Vet findById(Long id);
//
//    Vet save(Vet vet);
//
//    Set<Vet> findAll();
}
