
package collectionsjavapractice;

import java.util.LinkedList;
import java.util.Collections;

public class CollectionsJavaPractice {


    public static void main(String[] args) {
        LinkedList<Computer> compList = new LinkedList<>();
        
        compList.add(new Computer("MacIntosh", 1984));
        compList.add(new Computer("Surface", 2012));
        
        // adds element at index 0
        compList.add(2, new Computer("MacBook Pro", 2016));
        
        for(Computer c: compList)
            c.printInfo();
        
        System.out.println("***End***");
        
        Collections.sort(compList);
        
        for(Computer c: compList)
            c.printInfo();
        
        System.out.println("***End***");
        
    }
    
}
