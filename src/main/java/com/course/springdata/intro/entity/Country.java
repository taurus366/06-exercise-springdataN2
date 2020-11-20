package com.course.springdata.intro.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "countries")
public class Country extends BaseEntity{

    private String name;

    @OneToMany(mappedBy = "country",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Set<Town> townSet = new HashSet<>();
}
