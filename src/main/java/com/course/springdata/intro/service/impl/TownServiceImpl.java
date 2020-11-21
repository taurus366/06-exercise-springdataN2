package com.course.springdata.intro.service.impl;

import com.course.springdata.intro.entity.Country;
import com.course.springdata.intro.entity.Town;
import com.course.springdata.intro.repositories.TownRepository;
import com.course.springdata.intro.service.CountryService;
import com.course.springdata.intro.service.TownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class TownServiceImpl implements TownService {

    @Autowired
    private final TownRepository repository;

    @Autowired
    private final CountryService countryService;

    public TownServiceImpl(TownRepository repository, CountryService countryService) {
        this.repository = repository;
        this.countryService = countryService;
    }


    @Override
    public void seedTown(Town town , Country country) {
        town.setCountry(country);

       // country.getTownSet().add(town);
        //countryService.seedCountry(country);

        repository.saveAndFlush(town);
    }
}
