
package friendsproject;


public class BestFriend extends Friend{
    private int rating;
    
    public BestFriend(String friendName, String friendHeight, int friendBirthYear, State friendState, int friendRating) {
        super(friendName, friendHeight, friendBirthYear, friendState);
        rating = friendRating;
    }
    
    @Override
    public void printInfo() {
        System.out.println(name);
        System.out.println(height);
        System.out.println("Year of Creation: " + birthYear);
        System.out.println("This guy gives me " + stateVariable + " vibes.");
        System.out.println("Best friend rating: " + rating);
        System.out.println("\n");
    }
}
