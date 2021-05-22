package com.example.sfgpetclinic.model;

import lombok.*;
import net.bytebuddy.implementation.bind.annotation.Empty;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@ToString
@MappedSuperclass
public class Person extends BaseEntity{
    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

}
