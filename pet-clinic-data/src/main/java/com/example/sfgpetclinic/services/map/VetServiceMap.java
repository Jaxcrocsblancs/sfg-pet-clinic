package com.example.sfgpetclinic.services.map;

import com.example.sfgpetclinic.model.Vet;
import com.example.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findALl();
    }
    
    @Override
    public Vet findByID(Long id) {
        return super.findByID(id);
    }
    
    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteByID(Long aLong) {
        super.deleteById(aLong);
    }

   
}
