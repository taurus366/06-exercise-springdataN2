package com.course.springdata.intro.service;

import com.course.springdata.intro.entity.Album;
import com.course.springdata.intro.entity.Picture;
import com.course.springdata.intro.entity.User;

public interface AlbumService {

    void seedAlbum(Album album, User user, Picture picture);
}
