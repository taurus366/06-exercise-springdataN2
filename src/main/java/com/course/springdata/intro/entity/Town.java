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
    private User user;

    @OneToOne(mappedBy = "livingTown")
    private User user2;
}
