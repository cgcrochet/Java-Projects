
package collectionsjavapractice;


public class Computer implements Comparable<Computer>{
    
    private String name;
    private int releaseYear;
    
    public Computer(String computerName, int computerReleaseYear){
        name = computerName;
        releaseYear = computerReleaseYear;
    }
    
    public void printInfo(){
        System.out.println("Computer Name: " + name);
        System.out.println("Release Year: " + releaseYear + "\n");
    }
    
    public int compareTo(Computer other){
        return name.compareTo(other.name);
    }
}
