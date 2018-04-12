package com.example.countryservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Country {
    @Id
    @GeneratedValue
    private Long id;
    
    private String name;

    public Country(String name) {
        this.name = name;
    }
}
