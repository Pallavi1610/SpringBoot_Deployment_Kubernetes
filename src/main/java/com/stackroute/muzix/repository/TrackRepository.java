package com.stackroute.muzix.repository;

import com.stackroute.muzix.domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackRepository  extends MongoRepository<Track,Integer> {
    //@Query("from Track where name=?1")
    @Query("{'name': ?0}")
    public List<Track> getTrackByName(String name);
}
