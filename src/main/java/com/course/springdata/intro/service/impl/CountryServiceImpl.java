package com.course.springdata.intro.service.impl;

import com.course.springdata.intro.entity.Country;
import com.course.springdata.intro.repositories.CountryRepository;
import com.course.springdata.intro.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private final CountryRepository repository;

    public CountryServiceImpl(CountryRepository repository) {
        this.repository = repository;
    }


    @Override
    public void seedCountry(Country country) {
        repository.saveAndFlush(country);
    }
}
