
package hotelproject;


public class singleRoom extends room {
    String bedType;
    boolean smoking;
    
    public singleRoom(int roomNo, double price, String bedSize, boolean canYouSmoke) {
        super(roomNo, price);
        bedType = bedSize;
        smoking = canYouSmoke;
    }
    
    @Override
    public String getRoomInfo() {
        String info = "Room: " + roomNo + "\t$" + price + "\t\t" + bedType + "\t";
        
        if (smoking) {
            
            System.out.print(info + "\tSmoking" + "\n");
            return info + "Smoking\n";
        }
            
        else {
            
            System.out.print(info + "\tNo Smoking" + "\n");
            return info + "No Smoking" + "\n";
        }
        
            
    }
  
}
