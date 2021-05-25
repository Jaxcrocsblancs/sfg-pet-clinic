package com.example.sfgpetclinic.controllers;

import com.example.sfgpetclinic.model.Owner;
import com.example.sfgpetclinic.services.OwnerService;
import lombok.experimental.ExtensionMethod;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.web.servlet.MockMvc;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.HashSet;
import java.util.Set;

@ExtensionMethod(Mockito.class)
public class OwnerControllerTest {

    @Mock
    OwnerService ownerService;
    @InjectMocks
    OwnerController ownerController;

    Set<Owner> owners;
    Long id1=1L;
    Long id2=2L;

    MockMvc mockMvc;

    @BeforeMethod
    public void setUp() {
        owners = new HashSet<>();
        Owner o1 = Owner.builder().build();
        o1.setId(id1);
        owners.add(o1);
        Owner o2 = Owner.builder().build();
        o2.setId(id2);
        owners.add(o2);
    }

    @Test
    public void testListsOwners() throws Exception {
    }

    @Test
    public void testFindOwners() throws Exception {

    }
}