package com.course.springdata.intro.service;

import com.course.springdata.intro.entity.Album;
import com.course.springdata.intro.entity.Town;
import com.course.springdata.intro.entity.User;

import java.util.Set;

public interface UserService {

    void seedUsers(User user, Town livingTown, Town bornTown,Album album);
}
