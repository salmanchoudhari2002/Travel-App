package com.travelapp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Provides service methods for managing a list of Destinations.
 */
public class TravelService {
    private final List<Destination> destinations;

    // Constructor initializes the internal list
    public TravelService() {
        this.destinations = new ArrayList<>();
    }

    /**
     * Adds a new destination to the list.
     * @param destination The Destination object to add.
     */
    public void addDestination(Destination destination) {
        if (destination != null) {
            this.destinations.add(destination);
            System.out.println("-> Added: " + destination.getName());
        }
    }

    /**
     * Retrieves all stored destinations.
     * @return A list of all destinations.
     */
    public List<Destination> getAllDestinations() {
        return new ArrayList<>(this.destinations); // Return a copy to prevent external modification
    }

    /**
     * Finds destinations by country name (case-insensitive search).
     * @param country The country name to search for.
     * @return A list of matching destinations.
     */
    public List<Destination> findDestinationsByCountry(String country) {
        if (country == null || country.trim().isEmpty()) {
            return List.of();
        }
        String lowerCaseCountry = country.toLowerCase();
        
        return this.destinations.stream()
            .filter(d -> d.getCountry().toLowerCase().contains(lowerCaseCountry))
            .collect(Collectors.toList());
    }
    
    /**
     * Prints all destinations with a rating above a specified threshold.
     * @param minRating The minimum rating required (1-5).
     */
    public void printHighRatedDestinations(int minRating) {
        System.out.println("\n--- Destinations with Rating >= " + minRating + "/5 ---");
        this.destinations.stream()
            .filter(d -> d.getRating() >= minRating)
            
    }
}
