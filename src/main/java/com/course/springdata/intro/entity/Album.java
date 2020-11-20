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

    public Album() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getBackroundColor() {
        return backroundColor;
    }

    public void setBackroundColor(Color backroundColor) {
        this.backroundColor = backroundColor;
    }

    public Boolean getPublic() {
        return isPublic;
    }

    public void setPublic(Boolean aPublic) {
        isPublic = aPublic;
    }

    public Set<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(Set<Picture> pictures) {
        this.pictures = pictures;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
