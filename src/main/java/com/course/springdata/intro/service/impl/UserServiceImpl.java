package com.course.springdata.intro.service.impl;

import com.course.springdata.intro.entity.Album;
import com.course.springdata.intro.entity.Town;
import com.course.springdata.intro.entity.User;
import com.course.springdata.intro.repositories.UserRepository;
import com.course.springdata.intro.service.TownService;
import com.course.springdata.intro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository repository;

    @Autowired
    private final TownService townService;

    public UserServiceImpl(UserRepository repository, TownService townService) {
        this.repository = repository;
        this.townService = townService;
    }

    @Override
    public void seedUsers(User user, Town livingTown, Town bornTown,Album album) {
            user.setLivingTown(livingTown);
            user.setBornTown(bornTown);
            user.getAlbums().add(album);

            townService.seedTown(livingTown, livingTown.getCountry());


        repository.saveAndFlush(user);

    }
}
