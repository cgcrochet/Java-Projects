package invoiceproject;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Program creates receipt text file with provided item names, quantities, and prices
public class InvoiceProject {

   
    public static void main(String[] args) throws FileNotFoundException {
        
        char anotherItem = 'y';
        double total = 0;
        
            Scanner in = new Scanner(System.in);
            
            // Print random number for receipt name
            Random rand = new Random();
            int ranNum = rand.nextInt(900) + 100;
            
            // Print receipt formatting
            PrintWriter outFile = new PrintWriter("receipt_" + ranNum);
            outFile.println("========================================");
            outFile.println("\tWelcome to Wallmart");
            outFile.println("========================================");
            outFile.println("name      quantity     price     total");
            outFile.println("----------------------------------------");
            
        while (anotherItem == 'y' || anotherItem == 'Y') {
            
             // Obtain values from user
            System.out.print("Item: ");
            String item = in.next();
            
            System.out.print("Quantity: ");
            int quantity = in.nextInt();
            
            System.out.print("Price: ");
            double price = in.nextDouble();
            System.out.print("\n");
            
            // Output user input
            double totalItem = price * quantity;
            outFile.printf("%-14s%-10d$%-8.2f$%-7.2f\n", item, quantity, price, totalItem);
            
            // Accumulate total
            total += price * quantity;
            
            System.out.println("Press 'y' to enter a new item. Press any other key to quit.");
            anotherItem = in.next().charAt(0);
            
            
           
        }
        // Get current time
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd - hh:mm:ss a");
        String currentDateTimeFormatted = currentDateTime.format(formatter);
            
        System.out.println("receipt_" + ranNum + " has been issued on " + currentDateTimeFormatted);
        
        // Print tax and total
        double tax = total * 1.09;
        outFile.println("----------------------------------------");
        outFile.printf("                   Your total is $%-6.2f\n", total);
        outFile.printf("\t\t\t    Tax: $%-6.2f\n", tax);
        outFile.println("========================================");
        
        // Close PrintWriter object
        outFile.close();
    }  
}
