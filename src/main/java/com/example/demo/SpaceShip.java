package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "spaceship")
public class SpaceShip implements Serializable {
    @Id
    private Integer id;
    private String name;
    private Float speed;
}
