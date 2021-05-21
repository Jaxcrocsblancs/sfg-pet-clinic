package com.example.sfgpetclinic.services.map;

import com.example.sfgpetclinic.model.Speciality;
import com.example.sfgpetclinic.model.Vet;
import com.example.sfgpetclinic.services.SpecialityService;
import com.example.sfgpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile("map")
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {
    private final SpecialityService specialityService;

    public VetMapService(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }


    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findByID(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {

            if (object.getSpeciality().size() > 0) {
                object.getSpeciality().forEach(speciality -> {
                    if (speciality.getId() == null) {
                        Speciality savedSpecialty = specialityService.save(speciality);
                        speciality.setId(savedSpecialty.getId());
                    }
                });
            }

        return super.save(object);
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
