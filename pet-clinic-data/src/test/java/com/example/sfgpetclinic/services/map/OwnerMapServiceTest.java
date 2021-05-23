package com.example.sfgpetclinic.services.map;

import com.example.sfgpetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.SecondaryTable;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerMapServiceTest {
    
    OwnerMapService ownerMapService;
    Long ownerId=1L;
    String ownerLastName = "test";
    @BeforeEach
    void setUp() {
        ownerMapService = new OwnerMapService(new PetTypeMapService(), new PetMapService());
        Owner owner = Owner.builder().build();
        owner.setId(ownerId);
        owner.setLastName(ownerLastName);
        ownerMapService.save(owner);
    }

    @Test
    void findAll() {
        Set<Owner> ownerSet = ownerMapService.findAll();
        assertEquals(1, ownerSet.size());
    }

    @Test
    void findByID() {
        Owner owner =  ownerMapService.findByID(ownerId);
        assertEquals(ownerId, owner.getId());
    }

    @Test
    void save() {
        Long along = 2L;
        Owner owner2 = Owner.builder().build();
        owner2.setId(along);
        Owner savedOwner = ownerMapService.save(owner2);
        assertEquals(along,savedOwner.getId());
    }

    @Test
    void delete() {
        ownerMapService.delete(ownerMapService.findByID(ownerId));
        assertEquals(0,ownerMapService.findAll().size());
    }

    @Test
    void deleteByID() {
        ownerMapService.deleteByID(ownerId);
        assertEquals(0,ownerMapService.findAll().size());
    }

    @Test
    void findByLastName() {
        assertEquals(ownerLastName, ownerMapService.findByLastName(ownerLastName).getLastName());
    }
}