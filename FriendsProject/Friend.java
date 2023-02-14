
package friendsproject;

enum State{LOUISIANA, TEXAS, ALABAMA};

public class Friend implements Comparable<Friend>{
    
    protected State stateVariable;
    protected String name;
    protected String height;
    protected int birthYear;
    
    public Friend(String friendName, String friendHeight, int friendBirthYear, State friendState) {
        name = friendName;
        height = friendHeight;
        birthYear = friendBirthYear;
        stateVariable = friendState;
    }
    
    public void printInfo() {
        System.out.println(name);
        System.out.println(height);
        System.out.println("Year of Creation: " + birthYear);
        System.out.println("This guy gives me " + stateVariable + " vibes.");
        System.out.println("\n");
    }
    
    public int compareTo(Friend other) {
        return -1 * Integer.compare(birthYear, other.birthYear);
    }
}
