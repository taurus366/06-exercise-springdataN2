package com.course.springdata.intro.init;

import com.course.springdata.intro.entity.*;
import com.course.springdata.intro.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.time.LocalDate;

@Component
public class Engine implements CommandLineRunner {

    @Autowired
    private final UserService userService;

    @Autowired
    private final TownService townService;

    @Autowired
    private final PictureService pictureService;

    @Autowired
    private final CountryService countryService;

    @Autowired
    private final AlbumService albumService;

    public Engine(UserService userService, TownService townService, PictureService pictureService, CountryService countryService, AlbumService albumService) {
        this.userService = userService;
        this.townService = townService;
        this.pictureService = pictureService;
        this.countryService = countryService;
        this.albumService = albumService;
    }

    @Override
    public void run(String... args) throws Exception {

//        User user1 = new User("taurus366");
//        user1.setFirstName("ali");
//        user1.setLastName("zinal");
//        user1.set

        Country country = new Country();
        country.setName("BG");

      Town town1 = new Town();
        town1.setName("Varna");

        User user1 = new User("test1");

       LocalDate date = LocalDate.now();
//-----------------------------------------------------------
        Color color2 = Color.values()[1];

        Album album2 = new Album();
        album2.setName("test1Ali");
        album2.setBackroundColor(color2);
        album2.setPublic(false);

        User user2 = new User();
        user2.setUsername("taurus366");
        user2.setFirstName("ali");
        user2.setLastName("zinal");
        user2.setPassword("123456789");
        user2.setEmail("taurus.ali47@gmail.com");
        user2.setRegisteredOn(date);
        user2.setLastTimeLoggedIn(date);
        user2.setAge(26);
        user2.setDeleted(false);

        userService.seedUsers(user2, town1, town1,album2);


    }
}
