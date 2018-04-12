package com.example.countryservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class CountryInitializer implements CommandLineRunner {
    
    private final CountryRepository countryRepository;
    
    public CountryInitializer(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        Stream.of("Afghanistan", "Bhutan", "China", "Denmark", "Egypt", "Finland", "Holland" , "Iran", "North Korea")
                .forEach(name -> countryRepository.save(new Country(name)));

        countryRepository.findAll().forEach(System.out::println);
    }
}
