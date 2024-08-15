
package javaansali;

import java.util.Scanner;

public class Receipt {
    public void getReciept(){
    
            Scanner input = new Scanner(System.in);
    
        String fname, item;
        int quan;
        int price, cash;
        
        System.out.print("Customer Name: ");
        fname = input.nextLine();
        System.out.print("Product Name: ");
        item = input.nextLine();
        System.out.print("Quantity: ");  
        quan = input.nextInt();
        System.out.print("Price: ");  
        price = input.nextInt();
        System.out.print("Cash: ");  
        cash = input.nextInt();
        
        System.out.println("--------------------------------");
        System.out.println("RECIEPT");
        System.out.println("--------------------------------");
        
        System.out.println("Name: "+fname);
        System.out.println("Item: "+item);
        System.out.println("Quantity: "+quan);
        System.out.println("Price: "+price);
        System.out.println("Total Due: "+(quan*price));
        System.out.println("Cash: "+cash);
        System.out.print("Change: "+(cash-(quan*price)));
        
        
        
        
    
}
}