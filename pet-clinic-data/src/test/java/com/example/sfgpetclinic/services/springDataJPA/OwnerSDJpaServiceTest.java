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

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
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

    @BeforeEach
    void setUp(){

    }

    @Test
    void findByLastName() {
        Owner owner = Owner.builder().build();
        owner.setId(aLong);
        owner.setLastName(lastName);

        when(service.findByLastName(any())).thenReturn(owner);

        Owner owner2 = service.findByLastName(lastName);
        assertEquals(lastName,owner2.getLastName());
        verify(ownerRepository).findByLastName(any());
    }

    @Test
    void findAll() {
    }

    @Test
    void findByID() {
    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteByID() {
    }
}