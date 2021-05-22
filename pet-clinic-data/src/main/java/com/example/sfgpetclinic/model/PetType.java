package com.example.sfgpetclinic.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "petType")
public class PetType extends BaseEntity {

    private String name;

}
