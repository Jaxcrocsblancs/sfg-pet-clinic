package com.example.sfgpetclinic.services;

import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface CrudService<T, ID> {
    Set<T> findAll();

    T findByID(ID id);

    T save(T object);

    void delete(T object);

    void deleteByID(ID id);
}
