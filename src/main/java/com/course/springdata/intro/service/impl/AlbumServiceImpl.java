package com.course.springdata.intro.service.impl;

import com.course.springdata.intro.entity.Album;
import com.course.springdata.intro.entity.Picture;
import com.course.springdata.intro.entity.User;
import com.course.springdata.intro.repositories.AlbumRepository;
import com.course.springdata.intro.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class AlbumServiceImpl implements AlbumService {
    @Autowired
    private final AlbumRepository repository;

    public AlbumServiceImpl(AlbumRepository repository) {
        this.repository = repository;
    }

    @Override
    public void seedAlbum(Album album, User user, Picture picture) {
        album.setUser(user);
        album.getPictures().add(picture);
        repository.saveAndFlush(album);
    }
}
