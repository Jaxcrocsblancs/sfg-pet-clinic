package com.example.sfgpetclinic.services.map;

import com.example.sfgpetclinic.model.Pet;
import com.example.sfgpetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findALl();
    }
    
    @Override
    public Pet findByID(Long id) {
        return super.findByID(id);
    }
    
    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteByID(Long aLong) {
        super.deleteById(aLong);
    }

   
}