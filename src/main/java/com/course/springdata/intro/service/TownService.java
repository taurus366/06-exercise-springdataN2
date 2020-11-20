package com.course.springdata.intro.service;

import com.course.springdata.intro.entity.Country;
import com.course.springdata.intro.entity.Town;
import com.course.springdata.intro.entity.User;

public interface TownService {

    void seedTown(Town town , Country country);

}
