package friendsproject;

import java.util.Collections;
import java.util.ArrayList;


public class FriendsProject {


    public static void main(String[] args) {
        
        ArrayList<Friend> myFriends = new ArrayList<>();
        
        myFriends.add(new Friend("Cmiddy", "Probably 5'0", 1945, State.LOUISIANA));
        myFriends.add(new Friend("Alpha Chad Kenneth", "Definitely 6'12", 2002, State.ALABAMA));
        myFriends.add(new BestFriend("Cthulu", "700", -2000, State.TEXAS, 666));
        
        Collections.sort(myFriends);
        
        for(Friend f: myFriends)
            f.printInfo();
    }
}
