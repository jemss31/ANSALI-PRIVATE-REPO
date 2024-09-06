
package reciept;

import java.util.Scanner;


public class Reciept {
    public void getreceipt(){
        
        Scanner input = new Scanner(System.in);
        String fname,pname;
        
        int quan,price,cash,totald,change;
        
        System.out.println("Customer name:");
        fname = input.nextLine();
        
        System.out.println("Product Name:");
        pname = input.nextLine();
        
        System.out.println("Quantity:");
        quan = input.nextInt();
        
        System.out.println("Price:");
        price = input.nextInt();
        
        System.out.println("Cash:");
        cash = input.nextInt();
        
        System.out.println("________________________");
        System.out.println("Receipt");
        System.out.println("________________________");
        System.out.println("Name:"+fname);
        System.out.println("Item:"+pname);
        System.out.println("Quantity"+quan);
        System.out.println("________________________");
        System.out.println("Total due:");
        totald= input.nextInt();
        
        System.out.println("Cash:"+cash);
        System.out.println("________________________");
        System.out.println("Change:"+cash);
        change = cash - totald;
        System.out.println("________________________");
        
    }
    
}