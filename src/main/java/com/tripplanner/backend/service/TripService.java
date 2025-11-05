package com.tripplanner.backend.service;

import com.tripplanner.backend.model.Trip;
import com.tripplanner.backend.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripService {

    @Autowired
    private TripRepository tripRepository;

    // ✅ Add new trip
    public Trip saveTrip(Trip trip) {
        return tripRepository.save(trip);
    }

    // ✅ Get all trips
    public List<Trip> getAllTrips() {
        return tripRepository.findAll();
    }

    // ✅ Update existing trip
    public Trip updateTrip(Long id, Trip tripDetails) {
        Trip existingTrip = tripRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Trip not found with id: " + id));

        existingTrip.setName(tripDetails.getName());
        existingTrip.setDestination(tripDetails.getDestination());
        existingTrip.setStartDate(tripDetails.getStartDate());
        existingTrip.setEndDate(tripDetails.getEndDate());

        return tripRepository.save(existingTrip);
    }

    // ✅ Delete trip
    public void deleteTrip(Long id) {
        tripRepository.deleteById(id);
    }
}
