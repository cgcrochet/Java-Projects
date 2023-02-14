
package hotelproject;


public class suite extends room {
    private int numRoom;
    private boolean hasKicthen;
    
    public suite(int roomNo, double price, int numberRoom, boolean kitchenInSuite) {
        super(roomNo, price);
        numRoom = numberRoom;
        hasKicthen = kitchenInSuite;
    }
    
    @Override
    public String getRoomInfo() {
        System.out.printf("Suite: %d\t$%.2f\t\t%d rooms\t\t", roomNo, price, numRoom);
        
        if (hasKicthen) {
            System.out.print("Kicthen\n");
            return "Kicthen";
        } else { 
            System.out.print("No Kicthen\n");
            return "No Kicthen";
                    }
            
        
    }
}
