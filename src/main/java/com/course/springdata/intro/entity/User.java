package com.course.springdata.intro.entity;

import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.*;


@Entity
@Table(name = "users")
public class User extends BaseEntity{


    @NotNull
    @Size(min = 4,max = 30)
    private String username;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;


    @NotNull
    @Size(min = 6,max = 50)
    private String password;

    @NotNull
    @Email
    private String email;

    @Column(name = "registered_on")
    private Date registeredOn;

    @Column(name = "last_time_logged_in")
    private Date lastTimeLoggedIn;

    @Range(min = 1,max = 120)
    private int age;

    private Boolean isDeleted = false;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<User> friends = new HashSet<>();

    @OneToOne
    private Town bornTown;

    @OneToOne
    private Town livingTown;

    @OneToMany(mappedBy = "user")
    private Set<Album> albums = new HashSet<>();


    public User(@NotNull @Size(min = 4, max = 30) String username) {
        this.username = username;
    }

    public User() {
    }

    public User(@NotNull @Size(min = 4, max = 30) String username, String firstName, String lastName, @NotNull @Size(min = 6, max = 50) String password, @NotNull String email, Date registeredOn, Date lastTimeLoggedIn, @Range(min = 1, max = 120) int age, Boolean isDeleted, Set<User> friends, Town bornTown, Town livingTown, Set<Album> albums) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.registeredOn = registeredOn;
        this.lastTimeLoggedIn = lastTimeLoggedIn;
        this.age = age;
        this.isDeleted = isDeleted;
        this.friends = friends;
        this.bornTown = bornTown;
        this.livingTown = livingTown;
        this.albums = albums;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegisteredOn() {
        return registeredOn;
    }

    public void setRegisteredOn(Date registeredOn) {
        this.registeredOn = registeredOn;
    }

    public Date getLastTimeLoggedIn() {
        return lastTimeLoggedIn;
    }

    public void setLastTimeLoggedIn(Date lastTimeLoggedIn) {
        this.lastTimeLoggedIn = lastTimeLoggedIn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public Set<User> getFriends() {
        return friends;
    }

    public void setFriends(Set<User> friends) {
        this.friends = friends;
    }

    public Town getBornTown() {
        return bornTown;
    }

    public void setBornTown(Town bornTown) {
        this.bornTown = bornTown;
    }

    public Town getLivingTown() {
        return livingTown;
    }

    public void setLivingTown(Town livingTown) {
        this.livingTown = livingTown;
    }

    public String getFullName() {
        return firstName+" "+lastName;
    }

    public Set<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(Set<Album> albums) {
        this.albums = albums;
    }
}
