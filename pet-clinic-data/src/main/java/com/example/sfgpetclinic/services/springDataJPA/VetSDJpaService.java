package com.example.sfgpetclinic.services.springDataJPA;

import com.example.sfgpetclinic.model.Vet;
import com.example.sfgpetclinic.repositories.VetRepository;
import com.example.sfgpetclinic.repositories.PetRepository;
import com.example.sfgpetclinic.repositories.PetTypeRepository;
import com.example.sfgpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {
    private final VetRepository vetRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public VetSDJpaService(VetRepository vetRepository, PetRepository petRepository,
                           PetTypeRepository petTypeRepository) {
        this.vetRepository = vetRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findByID(Long aLong) {
        return vetRepository.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);
    }

    @Override
    public void deleteByID(Long aLong) {
        vetRepository.deleteById(aLong);
    }
}
