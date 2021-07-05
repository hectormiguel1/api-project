package com.grubhub.lite.demo.database;

import com.grubhub.lite.demo.models.Enums;
import com.grubhub.lite.demo.models.Restaurant;
import com.grubhub.lite.demo.repositories.DriverRepository;
import com.grubhub.lite.demo.repositories.RestaurantRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

@Configuration
public class LoadRestaurantDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDriverDatabase.class);

    private ArrayList<Enums.DietaryRestrictions> restrictions1 = new ArrayList<>();
    private ArrayList<Long> menu = new ArrayList<>();


    @Bean
    CommandLineRunner initRestaurantDB(RestaurantRepository repository) {
        menu.add(1L);
        menu.add(2L);
        menu.add(3L);
        menu.add(4L);
        menu.add(5L);
        menu.add(6L);
        menu.add(7L);
        return args -> {

            //American restaurant
            restrictions1.add(Enums.DietaryRestrictions.NA);
            log.info("Preloading + " + repository.save(new Restaurant("American Restaurant", (short) 5, "101 testing st", true,
                    new Date(2022,Calendar.DECEMBER,5), new Date(2023, Calendar.DECEMBER,5), Enums.Cuisine.American,
                    20.0, Enums.ValueProp.HighEnd, new ArrayList<Long>(), restrictions1,
                    true, new ArrayList<String>())));
            restrictions1.clear();

            //Chinese restaurant
            restrictions1.add(Enums.DietaryRestrictions.NA);
            log.info("Preloading + " + repository.save(new Restaurant("Chinese Restaurant ", (short) 2, "102 testing st", true,
                    new Date(2022,Calendar.DECEMBER,5), new Date(2023, Calendar.DECEMBER,5), Enums.Cuisine.Chinese,
                    10.0, Enums.ValueProp.Expensive, menu, restrictions1,
                    true, new ArrayList<String>())));
            restrictions1.clear();

            //Japanese restaurant
            restrictions1.add(Enums.DietaryRestrictions.Vegetarian);
            log.info("Preloading + " + repository.save(new Restaurant("Japanese Restaurant ", (short) 2, "103 testing st", false,
                    new Date(2022,Calendar.DECEMBER,5), new Date(2023, Calendar.DECEMBER,5), Enums.Cuisine.Japanese,
                    15.0, Enums.ValueProp.Expensive, menu, restrictions1,
                    false, new ArrayList<String>())));
            restrictions1.clear();

            //Korean restaurant
            restrictions1.add(Enums.DietaryRestrictions.NA);
            log.info("Preloading + " + repository.save(new Restaurant("Korean Restaurant ", (short) 2, "104 testing st", true,
                    new Date(2022,Calendar.DECEMBER,5), new Date(2023, Calendar.DECEMBER,5), Enums.Cuisine.Korean,
                    35.0, Enums.ValueProp.Cheap, menu, restrictions1,
                    false, new ArrayList<String>())));
            restrictions1.clear();

            //Latin restaurant
            restrictions1.add(Enums.DietaryRestrictions.NA);
            log.info("Preloading + " + repository.save(new Restaurant("Latin Restaurant ", (short) 2, "105 testing st", false,
                    new Date(2022,Calendar.DECEMBER,5), new Date(2023, Calendar.DECEMBER,5), Enums.Cuisine.Latin,
                    40.0, Enums.ValueProp.Cheap, menu, restrictions1,
                    true, new ArrayList<String>())));
            restrictions1.clear();

            //Hispanic restaurant
            restrictions1.add(Enums.DietaryRestrictions.NA);
            log.info("Preloading + " + repository.save(new Restaurant("Hispanic Restaurant ", (short) 2, "106 testing st", true,
                    new Date(2022,Calendar.DECEMBER,5), new Date(2023, Calendar.DECEMBER,5), Enums.Cuisine.Chinese,
                    50.0, Enums.ValueProp.HighEnd, menu, restrictions1,
                    false, new ArrayList<String>())));
            restrictions1.add(Enums.DietaryRestrictions.NA);

            //Fast food restaurant
            restrictions1.add(Enums.DietaryRestrictions.NA);
            log.info("Preloading + " + repository.save(new Restaurant("Fast food Restaurant ", (short) 2, "107 testing st", true,
                    new Date(2022,Calendar.DECEMBER,5), new Date(2023, Calendar.DECEMBER,5), Enums.Cuisine.FastFood,
                    5.0, Enums.ValueProp.Cheap, menu, restrictions1,
                    false, new ArrayList<String>())));
            restrictions1.add(Enums.DietaryRestrictions.NA);
        };
    }
}
