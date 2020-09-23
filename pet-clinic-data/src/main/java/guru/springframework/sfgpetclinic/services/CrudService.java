package guru.springframework.sfgpetclinic.services;

//This is a generic class that is used to work for multiple services that have the same actions such as findByID

import java.util.Set;

public interface CrudService<T, ID> {
    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
