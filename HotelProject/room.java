
package hotelproject;

import java.util.ArrayList;
import java.util.Collections;


public class room implements Comparable<room>{
    
    public int roomNo;
    public double price;
    
    
    
    public room(int number, double roomPrice) {
        roomNo = number;
        price = roomPrice;
    }
    
    public void setPrice(double RoomPrice) {
        price = RoomPrice;
    }
    
    public String getRoomInfo() {
        System.out.printf("%d%f%s%b", roomNo, price);
        return "";
    }
    
    public int compareTo(room other) {
        return Double.compare(price, other.price);
    }
    
    
    
    
}
