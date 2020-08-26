package assignments;

import java.util.Scanner;

public class unitConversion {

	  public static void main(String[] Strings) {

	        Scanner scan = new Scanner(System.in);

	        System.out.println("Please input a value for inch: ");
	        double inch = scan.nextDouble();
	        
	        //Note: One inch is 0.0254 meter.
	        double meters = inch * 0.0254;
	        
	        System.out.println(inch + " inch is " + meters + " meters.");

	    }
	}


