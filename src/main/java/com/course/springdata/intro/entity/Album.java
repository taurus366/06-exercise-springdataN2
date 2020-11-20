package com.course.springdata.intro.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "albums")
public class Album extends BaseEntity{

    private String name;

    @Enumerated(value = EnumType.ORDINAL)
    private Color backroundColor;

    @Column(name = "is_public_or_not")
    private Boolean isPublic = false;

    @ManyToMany
   private Set<Picture> pictures;

    @ManyToOne()
    private User user;
}
