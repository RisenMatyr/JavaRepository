package excercises175;

import java.util.Scanner;

public class fourB {


	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner inputDevice = new Scanner(System.in);
		// TODO Auto-generated method stub
		int num1;
		int num2;
		
		System.out.println("Choose a number: ");
		num1 = inputDevice.nextInt();

		displayTwiceTheNumber(num1);
		displayNumberPlusFive(num1);
		displayNumberSquared(num1);
		
		System.out.println("Choose a second number: ");
		num2 = inputDevice.nextInt();
		
		displayTwiceTheNumber(num2);
		displayNumberPlusFive(num2);
		displayNumberSquared(num2);
	}
	public static void displayTwiceTheNumber(int n)
	{
		int factor = 2;
		System.out.println(n + " times " + factor + " is " + (n * factor));
	}
	public static void displayNumberPlusFive(int n)
	{
		int add = 5;
		System.out.println(n + " plus " + add + " is " + (n + add));
	}
	public static void displayNumberSquared(int n)
	{
		System.out.println(n + " squared is " + (n * n));
	}

}
