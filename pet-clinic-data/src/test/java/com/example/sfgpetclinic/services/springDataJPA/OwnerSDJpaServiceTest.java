package com.example.sfgpetclinic.services.springDataJPA;

import com.example.sfgpetclinic.model.Owner;
import com.example.sfgpetclinic.repositories.OwnerRepository;
import com.example.sfgpetclinic.repositories.PetRepository;
import com.example.sfgpetclinic.repositories.PetTypeRepository;
import com.example.sfgpetclinic.services.map.PetTypeMapService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OwnerSDJpaServiceTest {
    @Mock
    OwnerRepository ownerRepository;
    @Mock
    PetRepository petRepository;
    @Mock
    PetTypeRepository repository;

    @InjectMocks
    OwnerSDJpaService service;

    Long aLong=1L;
    String lastName="test";
    Owner owner;
    @BeforeEach
    void setUp(){
        owner = Owner.builder().build();
        owner.setId(aLong);
        owner.setLastName(lastName);
    }

    @Test
    void findByLastName() {
        when(service.findByLastName(any())).thenReturn(owner);

        Owner owner2 = service.findByLastName(lastName);
        assertEquals(lastName,owner2.getLastName());
        verify(ownerRepository).findByLastName(any());
    }

    @Test
    void findAll() {
        Set<Owner> returnOwnerSet = new HashSet<>();
        Owner owner1 = Owner.builder().build();
        owner1.setId(aLong+1);
        returnOwnerSet.add(owner1);
        Owner owner2 = Owner.builder().build();
        owner2.setId(aLong+2);
        returnOwnerSet.add(owner2);
        when(ownerRepository.findAll()).thenReturn(returnOwnerSet);

        assertNotNull(owner);
        assertEquals(2,service.findAll().size());
    }

    @Test
    void findByID() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(owner));
        Owner owner = service.findByID(1L);
        assertNotNull(owner);
    }

    @Test
    void save() {
        Owner ownertoSave = Owner.builder().build();
        ownertoSave.setId(1L);
        when(ownerRepository.save(any())).thenReturn(owner);
        Owner savedOwner = service.save((ownertoSave));
        assertNotNull(savedOwner);
    }

    @Test
    void delete() {
        service.delete(owner);
        verify(ownerRepository).delete(any());
    }

    @Test
    void deleteByID() {
        service.deleteByID(aLong);
        verify(ownerRepository).deleteById(anyLong());
    }
}