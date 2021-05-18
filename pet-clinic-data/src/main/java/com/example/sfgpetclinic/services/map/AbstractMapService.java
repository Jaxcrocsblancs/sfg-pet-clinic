package com.example.sfgpetclinic.services.map;

import com.example.sfgpetclinic.model.Vet;
import com.example.sfgpetclinic.services.CrudService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T,ID> implements CrudService<T,ID> {
    protected Map<ID, T> map = new HashMap<>();

    Set<T> findALl(){
        return new HashSet<>(map.values());
    }

    public T findByID(ID id){
        return map.get(id);
    }

    T save(ID id, T object){
        map.put(id, object);
        return object;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    public void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }
}
