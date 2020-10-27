package com.example.demo.entities;

import com.example.demo.interfaces.WithSubProperty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SubProperty implements WithSubProperty {

    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public SubProperty getSubProperty() {
        return this;
    }

    @Override
    public void setSubProperty(SubProperty subProperty) {
        //nada
    }
}
