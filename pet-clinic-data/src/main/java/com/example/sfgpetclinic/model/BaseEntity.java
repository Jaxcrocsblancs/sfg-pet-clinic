package com.example.sfgpetclinic.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
