package excercises175;

import java.util.Scanner;

public class fiveB {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner inputDevice = new Scanner(System.in);
		// TODO Auto-generated method stub
		double num1 = 0;
		double num2 = 0;
		
		System.out.println("Choose a number: ");
		num1 = inputDevice.nextInt();
		
		System.out.println("Choose a number: ");
		num2 = inputDevice.nextInt();
		
		computePercent(num1, num2);
	}
	public static void computePercent(double num1, double num2)
	{
		System.out.println((num1 / num2) + " is the percent of " + num1 + " and " + num2);
	}

}
