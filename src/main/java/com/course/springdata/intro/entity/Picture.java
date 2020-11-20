package com.course.springdata.intro.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "pictures")
public class Picture extends BaseEntity{

    private String title;

    private String caption;

    private String path;

    @ManyToMany(mappedBy = "pictures")
    Set<Album> albums;
}
