package carsproject;
// Student Name: Cameron Crochet
// Submission Time: 5:35pm

public class CarsProject {

    
    public static void main(String[] args) {
        Car c1 = new Car(12313131, 2009, "Camry");
        c1.setMileage(60000);
        System.out.println(c1.getInfo());
        
        Car c2 = new Car(95645421, 2010, "Accord");
        c2.setMileage(95000);
        System.out.println(c2.getInfo());
        
        Car c3 = new Car(45746587, 2019, "CX5");
        c3.setMileage(600);
        System.out.println(c3.getInfo());
        
        
    }
    
}
