package com.course.springdata.intro.service.impl;

import com.course.springdata.intro.entity.Picture;
import com.course.springdata.intro.repositories.PictureRepository;
import com.course.springdata.intro.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class PictureServiceImpl implements PictureService {
    @Autowired
    private final PictureRepository repository;

    public PictureServiceImpl(PictureRepository repository) {
        this.repository = repository;
    }

    @Override
    public void seedPicture(Picture picture) {
        repository.saveAndFlush(picture);
    }
}
