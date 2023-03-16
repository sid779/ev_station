package com.example.evchargingstation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StationService {

    private final StationRepository stationRepository;

    @Autowired
    public StationService(StationRepository stationRepository)
    {
        this.stationRepository = stationRepository;
    }

    public List<Station> getAllStations() {
        return stationRepository.findAll();
    }


    public Optional<Station> getStationByStation_id(String station_id) {
        return stationRepository.findByStation_id(station_id);
    }

    public Station addStation(Station station) {
        return stationRepository.save(station);
    }


    public Station updateStation(Station station) {
        return stationRepository.save(station);
    }

    public Optional<Station> deleteStation(String station_id) {
        boolean stationExists = stationRepository.existsByStation_id(station_id);
        if(!stationExists){
            throw new IllegalStateException(
                    "Student with id: " + station_id + "does not exists."
            );
        }
        return stationRepository.deleteStationByStation_id(station_id);
    }
}
