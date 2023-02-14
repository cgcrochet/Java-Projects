package carsproject;

// Student Name: Cameron Crochet
// Submission Time: 5:35pm

public class Car {
    private long VIN;
    private String model;
    private int year;
    private double mileage;
    
    
    public Car() {
        
    }
    
    public Car(long carVIN, int carYear, String carModel) {
        model = carModel;
        year = carYear;
        VIN = carVIN;
    }
    
    public void setMileage(double carMileage) {
        mileage = carMileage;
    }
    
    public String getInfo(){
        return String.format("%d %s (VIN: %d, milage: %,.1f mile)", year, model, VIN, mileage);
    }
}
