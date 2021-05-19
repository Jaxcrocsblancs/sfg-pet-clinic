package com.example.sfgpetclinic.bootstrap;

import com.example.sfgpetclinic.model.Owner;
import com.example.sfgpetclinic.model.Vet;
import com.example.sfgpetclinic.services.OwnerService;
import com.example.sfgpetclinic.services.PetService;
import com.example.sfgpetclinic.services.VetService;
import com.example.sfgpetclinic.services.map.OwnerServiceMap;
import com.example.sfgpetclinic.services.map.PetServiceMap;
import com.example.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final PetService petService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, PetService petService, VetService vetService) {
        this.ownerService = ownerService;
        this.petService = petService;
        this.vetService = vetService;
    }
    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        //owner1.setAddress("123 Brickerel");
        //owner1.setCity("Miami");
        //owner1.setTelephone("1231231234");

        //Pet mikesPet = new Pet();
        //mikesPet.setPetType(savedDogPetType);
        //mikesPet.setOwner(owner1);
        //mikesPet.setBirthDate(LocalDate.now());
        //mikesPet.setName("Rosco");
        //owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        System.out.println(owner1.getId());
        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        //owner2.setAddress("123 Brickerel");
        //owner2.setCity("Miami");
        //owner2.setTelephone("1231231234");

        //Pet fionasCat = new Pet();
        //fionasCat.setName("Just Cat");
        //fionasCat.setOwner(owner2);
        //fionasCat.setBirthDate(LocalDate.now());
        //fionasCat.setPetType(savedCatPetType);
        //owner2.getPets().add(fionasCat);

        ownerService.save(owner2);

        System.out.println(owner2.getId());
        Owner owner3 = new Owner();
        owner3.setFirstName("Antonin");
        owner3.setLastName("Calba");

        ownerService.save(owner3);
        System.out.println(owner3.getId());
        //Visit catVisit = new Visit();
        //catVisit.setPet(fionasCat);
        //catVisit.setDate(LocalDate.now());
        //catVisit.setDescription("Sneezy Kitty");

        //visitService.save(catVisit);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        //vet1.getSpecialities().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        //vet2.getSpecialities().add(savedSurgery);
        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
