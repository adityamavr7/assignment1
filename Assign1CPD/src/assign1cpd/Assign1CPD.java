/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assign1cpd;

import java.util.Scanner;

/**
 *
 * @author c0652050
 */
public class Assign1CPD {

    /**
     * @param args the command line arguments
     */
    
    
    public static void userPrompt()
    {   
        
        String custID;
        String custName;
        String timeReceived;
        String timeProcessed;
        String timeFulfilled;
        String productId;
        String quantity;
        String notes;
        
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Enter Customer ID");
        custID = kb.next();
        System.out.println("Enter Customer Name");
        custName = kb.next();
        System.out.println("Enter Customer Time Received");
        timeReceived = kb.next();
        System.out.println("Enter Customer Time Processed");
        timeProcessed = kb.next();
        System.out.println("Enter Customer Time Fulfilled");
        timeFulfilled = kb.next();
        System.out.println("Enter Customer Product ID");
        productId = kb.next();
        System.out.println("Enter Customer Quantity");
        quantity = kb.next();
        System.out.println("Enter Customer Notes");
        notes = kb.next();
    
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        userPrompt();
        
    }
    
}
