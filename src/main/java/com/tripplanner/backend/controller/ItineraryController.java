package com.tripplanner.backend.controller;

import com.tripplanner.backend.model.Itinerary;
import com.tripplanner.backend.repository.ItineraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/itineraries")
public class ItineraryController {

    @Autowired
    private ItineraryRepository itineraryRepository;

    @GetMapping("/{tripId}")
    public List<Itinerary> getItinerariesByTripId(@PathVariable Long tripId) {
        return itineraryRepository.findByTripId(tripId);
    }

    @PostMapping
    public Itinerary createItinerary(@RequestBody Itinerary itinerary) {
        return itineraryRepository.save(itinerary);
    }
}
