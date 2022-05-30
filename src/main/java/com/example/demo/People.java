package com.example.demo;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "people")
public class People {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "height")
    private Integer height;

    @Column(name = "mass")
    private Integer mass;

    @Column(name = "hair_color")
    private String hair_color;

    @Column(name = "skin_color")
    private String skin_color;

    @Column(name = "eye_color")
    private String eye_color;

    @Column(name = "birth_year")
    private String birth_year;

    @Column(name = "gender")
    private String gender;

    @Column(name = "planet_id")
    private Integer planet_id;

    @Column(name = "created_date")
    private Date created_date;

    @Column(name = "updated_date")
    private Date updated_date;

    @Column(name = "url")
    private String url;

}
