package com.travelapp;

/**
 * Represents a single travel destination with a name, country, and rating.
 */
public class Destination {
    private String name;
    private String country;
    private int rating; // Rating out of 5

    // Constructor
    public Destination(String name, String country, int rating) {
        this.name = name;
        this.country = country;
        // Ensure rating is within a valid range
        this.rating = Math.max(1, Math.min(5, rating));
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getRating() {
        return rating;
    }

    // Setter (optional, but good practice for POJOs)
    public void setRating(int rating) {
        this.rating = Math.max(1, Math.min(5, rating));
    }

    // Custom toString for easy printing
    @Override
    public String toString() {
        return String.format(
            "Destination [Name: %s, Country: %s, Rating: %d/5]", 
            name, country, rating
        );
    }
}
