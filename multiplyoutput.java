package assignments;

import java.util.Scanner;

public class multiplyoutput {

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Input first number please");
	int input1 = scan.nextInt();
	
	System.out.println("Input second number please");
	int input2 = scan.nextInt();
	
	int output = input1 * input2;
	System.out.println("first number * second number = " + output);
}
		
}
