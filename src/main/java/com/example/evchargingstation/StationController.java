package com.example.evchargingstation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/")
public class StationController {
    private final StationService stationService;

    @Autowired
    StationController(StationService stationService){
        this.stationService = stationService;
    }

    @GetMapping
    public List<Station> getAllStations()
    {
        return stationService.getAllStations();
    }

    @GetMapping(path = "show/{id}")
    public Optional<Station> getStationByStation_id(@PathVariable("id") String station_id)
    {
        return stationService.getStationByStation_id(station_id);
    }

    @PostMapping
    public Station addStation(@RequestBody Station station)
    {
        return stationService.addStation(station);
    }

    @PutMapping(path = "{id}/edit")
    public Station updateStation(@RequestBody Station station, @PathVariable("id") String station_id)
    {
        return stationService.updateStation(station);
    }

    @DeleteMapping(path = "{id}/delete")
    public Optional<Station> deleteStation(@PathVariable("id") String station_id)
    {
        return stationService.deleteStation(station_id);
    }


}
