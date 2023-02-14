
package filesproject;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;

// Student Name: Cameron Crochet
//LSU ID: 892681239
//Lab TA: Josh McCain
public class FilesProject {
    /** Program that creates a file named "calculations.txt" and populates the
     the file with 1000 random integer numbers in the range [0-1000]
     * 
     Program reads this file and prints the average of the numbers up to 2
     decimal places
    */
    public static void main(String[] args) throws FileNotFoundException{
       PrintWriter output = new PrintWriter("calculations.txt");
       Random rand = new Random();
       
       for(int i=0; i<1000; i++)
           output.println(rand.nextInt(1001));
       
       output.close();
       
       File inputFile = new File("calculations.txt");
       Scanner in = new Scanner(inputFile);
       
       float sum = 0;
       float count = 0;
       
       while(in.hasNextInt()) // Continue while the next token is an Int
       {
           sum += in.nextInt();
           count++;
       }
       
       in.close();
       
       float avr = sum / count; // Computes average
       System.out.printf("%.2f\n",avr); // Prints with two decimal places
       
    }
    
}
