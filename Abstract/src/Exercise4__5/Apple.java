package Exercise4__5;

import java.util.Scanner;

public class Apple extends Fruit {
    
    protected int quantity;
    protected double price,paid,amountTendered,balance;
    Scanner sc=new Scanner(System.in);
  
    public Apple(String name, int q, double p) { //constructor with arguments
        super(name);
        this.quantity = q;
        this.price = p;
        
        //System.out.println("Apple constructor is invoked");
    
        if (this.quantity < 10) {
            totalPrice(); //overloading with no arguments
            System.out.println(name);
            paid=totalPrice();
        
        }
            else if (this.quantity >= 10 && this.quantity < 100) {
            double pp = 0.90;
            totalPrice(pp); //overloading with 1 argument
            System.out.println(name);
            System.out.println("Because you buy more than 10 and less than 100, you will get special price which 1 apple = 0.90 sen");
            paid=totalPrice(pp);
        }
        
            else {
            double pp = 0.80;
            double dd; 
            
            if (name == "Apple") {
            	Discount aa = new Applediscount();
            	System.out.println("Because you buy more than 100, you will get 0.15% and you will get special price which 1 apple = 0.80 sen");
				System.out.println("DISCOUNT 1: "+aa.rateofdiscount()); 
				dd = aa.rateofdiscount();
            }
            
            else if (name == "HoneyCrisp") {
            	Discount aa = new HoneyCrispdiscount();
            	System.out.println("Because you buy more than 100, you will get 0.25% and you will get special price which 1 apple = 0.80 sen");
				System.out.println("DISCOUNT 2: "+aa.rateofdiscount()); 
				dd = aa.rateofdiscount();
            }
            
            else {
            	Discount aa = new Mangodiscount();
            	System.out.println("Because you buy more than 100, you will get 0.35% and you will get special price which 1 Mango = 0.80 sen");
				System.out.println("DISCOUNT 3: "+aa.rateofdiscount()); 
				dd = aa.rateofdiscount(); 	 
            }
            
            totalPrice(dd, pp); //overloading with 2 arguments
            System.out.println(name);
            paid=totalPrice(pp,dd);
		}
        
        System.out.println("You bought:");
        System.out.printf("\n%1s%30s%13s" , "Fruit" , "Quantity" , "Price (RM)");
	    System.out.print("\n--------------------------------------------------");
	    System.out.printf("\n%1s%24s%14.2f" , this.name , this.quantity , paid);
	    System.out.println();
	    System.out.print("\nPlease enter Amount Tendered: RM ");
        this.amountTendered = sc.nextDouble();
        if (amountTendered >= paid)
        {
           balance = amountTendered - paid;
           System.out.printf("%1s%43.2f" , "Balance" , balance);
           System.out.println("\n*******************");
           System.out.println("$$$$$$$$$$--THANK YOU. PLEASE COME AGAIN--$$$$$$$$$");
        }
        else
        {
           System.out.println("Error. Input cannot less than Amount Tendered!!");
           System.out.print("Please enter Amount Tendered: RM ");
           amountTendered = sc.nextDouble();
           balance = amountTendered - paid;
           System.out.printf("%1s%43.2f" , "Balance" , balance);
           System.out.println("*****************");
           System.out.println("$$$$$$$$$$--THANK YOU. PLEASE COME AGAIN--$$$$$$$$$");
        } 
	}
    
	public double totalPrice() {
		return this.price* this.quantity;
	}
	
	public double totalPrice(double pp) {
		return pp* this.quantity ;
	}
	
	public double totalPrice(double pp, double dd) {
		return (pp* this.quantity * (1-dd)) ;
	}
	
	public String toString(){
		return("Total Price = RM" + paid);
	}

}