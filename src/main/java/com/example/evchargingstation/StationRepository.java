package com.example.evchargingstation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StationRepository extends JpaRepository<Station,Long> {

    Optional<Station> findByStation_id(String station_id);

    List<Station> findAll();


    @Modifying
    @Query("delete from Station u where u.station_id = ?1")
    Optional<Station> deleteStationByStation_id(String station_id);

    @Modifying
    @Query("select count(e)>0 from Station e where e.station_id = ?1")
    Boolean existsByStation_id(String station_id);
}
