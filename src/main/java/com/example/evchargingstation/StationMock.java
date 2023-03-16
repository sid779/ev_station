package com.example.evchargingstation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StationMock {
    @Bean
    CommandLineRunner commandLineRunner(StationRepository stationRepository) {
        return args -> {
            Station Delhi = new Station(
                    "DEL",
                    "Delhi",
                    "Image",
                    "100$",
                    "India"
                    );
            Station Mumbai = new Station(
                    "BOM",
                    "Mumbai",
                    "Image",
                    "100$",
                    "India");

            stationRepository.saveAll(List.of(Delhi,Mumbai));
        };
    }
}
