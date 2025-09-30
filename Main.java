package com.travelapp;

/**
 * Main application class to demonstrate the TravelService functionality.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("--- Starting Travel Application ---");
        
        // 1. Initialize the service
        TravelService service = new TravelService();
        
        // 2. Add sample destinations
        System.out.println("\n[Action 1] Adding Destinations:");
        service.addDestination(new Destination("Kyoto", "Japan", 5));
        service.addDestination(new Destination("Machu Picchu", "Peru", 5));
        service.addDestination(new Destination("Dubai", "UAE", 4));
        service.addDestination(new Destination("London", "United Kingdom", 4));
        service.addDestination(new Destination("Cusco", "Peru", 3));
        
        // 3. Display all destinations
        System.out.println("\n[Action 2] All Destinations:");
        service.getAllDestinations().forEach(System.out::println);
        
        // 4. Find destinations by country
        String searchCountry = "Peru";
        System.out.println("\n[Action 3] Searching for Destinations in: " + searchCountry);
        service.findDestinationsByCountry(searchCountry)
            .forEach(System.out::println);

        // 5. Find high-rated destinations
        service.printHighRatedDestinations(5);

        System.out.println("\n--- Travel Application Finished ---");
    }
}
