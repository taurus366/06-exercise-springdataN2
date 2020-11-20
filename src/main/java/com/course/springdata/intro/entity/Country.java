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

    public Country(String name) {
        this.name = name;
    }

    public Country() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Town> getTownSet() {
        return townSet;
    }

    public void setTownSet(Set<Town> townSet) {
        this.townSet = townSet;
    }
}
