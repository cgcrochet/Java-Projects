package hotelproject;

import java.util.ArrayList;
import java.util.Collections;

// Create class with implementation of Comparable to inform compiler the object has a comparable interface
public class Hotel implements Comparable<Hotel> {
    private String name;
    private int stars;
    private double googleRating;
    private double averageRoomPrice;
    
    ArrayList<room> rooms = new ArrayList<>();
    
    // Create constructor
    public Hotel(String hotelName, int hotelStars){
        name = hotelName;
        stars = hotelStars;
    }
    
    // Changes Google rating when called
    public void setGoogleRating(double newGoogleRating) {
        googleRating = newGoogleRating;
    }
    
    // Changes room price when called
    public void setRoomPrice(double newAverageRoomPrice) {
        averageRoomPrice = newAverageRoomPrice;
    }
    
    // Prints information about hotels when called
    public String printInfo(){
        return String.format("%-10s%8d       $%-10.2f%.2f", name, stars, averageRoomPrice, googleRating);
    }
    
    public void listRooms() {
        Collections.sort(rooms);
        
        for (room y : rooms) {
            y.getRoomInfo();
        }
        
        
    }
    
    
    
    public String getInfo() {
        return name + "\t" + stars + "\t$" + averageRoomPrice + "\t" +  googleRating;
    }
    
    // Calculates average price of rooms in the hotel
    public double getAverageRoomPrice() {
        
        double total = 0;
        
        for (room x : rooms) {
            total += x.price;
        }
        
        return total / rooms.size();
    }
    
    // Adds room to the ArrayList
    public void addRoom(room r) {
        rooms.add(r);
    }
    
    // Compares hotel attributes
    public int compareTo(Hotel other) {
        
        // Finds hotel with lowest average room price or skips if prices are equal
        if(Double.compare(averageRoomPrice, other.averageRoomPrice) != 0)
            return Double.compare(averageRoomPrice, other.averageRoomPrice);
        
        // Finds hotel with highest star rating if average price is equal
        else if (Integer.compare(stars, other.stars) != 0)
            return -1*Integer.compare(stars, other.stars);
        
        // Finds hotel with highest Google rating if average price and star rating are equal
        else
            return -1*Double.compare(googleRating, other.googleRating);
    }
}
