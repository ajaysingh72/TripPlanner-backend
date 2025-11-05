package com.tripplanner.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "itineraries")
public class Itinerary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "trip_id")
    private Long tripId;  // Trip reference ID

    private String location;
    private String date;
    private String description;

    // ✅ Default constructor
    public Itinerary() {}

    // ✅ Parameterized constructor
    public Itinerary(Long tripId, String location, String date, String description) {
        this.tripId = tripId;
        this.location = location;
        this.date = date;
        this.description = description;
    }

    // ✅ Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getTripId() { return tripId; }
    public void setTripId(Long tripId) { this.tripId = tripId; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
