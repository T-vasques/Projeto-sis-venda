package com.sisvendas.sisvenda.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseModel {
    private long id;
    @Id
    public long getId() {
        return id;
    }
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public void setId(long id) {
        this.id = id;
    }
}
