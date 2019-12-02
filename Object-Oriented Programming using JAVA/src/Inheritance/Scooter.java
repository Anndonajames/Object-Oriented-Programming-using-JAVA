package Inheritance;

public class Scooter  extends Bike
	 {
		 public void display(String name2,String  color2, float cc2, int speed2, double price2, int discount2,int weight2)
		 {
				System.out.println("Scooter :");
				System.out.println("Name :"+name2);
				System.out.println("Color :"+color2);
				System.out.println("Capacity :"+cc2);
				System.out.println("Speed :"+speed2);
				System.out.println("Price :"+price2);
				System.out.println("Weight :"+weight2);
				
				System.out.println("Manufacturer Discount :"+discount2);
				double sp2=price2-discount2;
				System.out.println("Scooter price is :"+sp2);
				
			}
	 
	 }
	 
