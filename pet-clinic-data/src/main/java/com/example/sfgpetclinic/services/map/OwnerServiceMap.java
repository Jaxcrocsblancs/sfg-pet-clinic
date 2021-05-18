package com.example.sfgpetclinic.services.map;

import com.example.sfgpetclinic.model.Owner;
import com.example.sfgpetclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long>{
    @Override
    public Set<Owner> findAll() {
        return super.findALl();
    }
    
    @Override
    public Owner findByID(Long id) {
        return super.findByID(id);
    }
    
    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteByID(Long aLong) {
        super.deleteById(aLong);
    }

   
}
