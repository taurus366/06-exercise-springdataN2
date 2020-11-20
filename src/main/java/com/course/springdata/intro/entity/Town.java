package com.course.springdata.intro.entity;

import javax.persistence.*;

@Entity
@Table(name = "towns")
public class Town extends BaseEntity{


    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id",referencedColumnName = "id")
    private Country country;

    @OneToOne(mappedBy = "bornTown")
    private User userBornTown;

    @OneToOne(mappedBy = "livingTown")
    private User userLivingTown;

    public Town() {
    }

    public Town(String name, Country country, User userBornTown, User userLivingTown) {
        this.name = name;
        this.country = country;
        this.userBornTown = userBornTown;
        this.userLivingTown = userLivingTown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public User getUserBornTown() {
        return userBornTown;
    }

    public void setUserBornTown(User userBornTown) {
        this.userBornTown = userBornTown;
    }

    public User getUserLivingTown() {
        return userLivingTown;
    }

    public void setUserLivingTown(User userLivingTown) {
        this.userLivingTown = userLivingTown;
    }
}
