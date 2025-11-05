package com.tripplanner.backend.repository;

import com.tripplanner.backend.model.Itinerary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItineraryRepository extends JpaRepository<Itinerary, Long> {
    // Add this method to fix the error
    List<Itinerary> findByTripId(Long tripId);
}
