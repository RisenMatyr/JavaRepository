package excercises;
import java.text.DecimalFormat;
import java.util.Scanner;
public class PizzaChoice 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double mustard = 4.20;
		double mayonnaise = 5.00;
		double ketchup = 6.65;
		double total;
		double large = 13.00;
		double medium = 7.00;
		double small = 5.00;
		int topping;
		int size;
		String choice;
		
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		
		System.out.println("Welcome to Steamers Pizza! We will roll you out of here in a wheelchair.");
		System.out.println("\nNow you have a few things you can choose from. ");
		System.out.println("Would you like to order a pizza? yes or no");
		choice = input.nextLine();
		if ("yes".equals(choice))
		{
			System.out.println("What size pizza would you like?\n(1 for small, 2 for medium, and 3 for large)");
			size = input.nextInt();
			if (size == 1)
			{
				System.out.println("That is a Number " + size + ". Would you like any toppings?");
				System.out.println("What toppings would you like?\n(1 for Mustard, 2 for Mayonnaise, 3 for Ketchup)");
				topping = input.nextInt();
				if (topping == 1)
				{
					total = small + mustard;
					System.out.println("That's a small with Mustard, your total adds up to " + df.format(total) + "\n");

				}
				if (topping == 2)
				{
					total = small + mayonnaise;
					System.out.println("That's a small with Mayonnaise, your total adds up to " + df.format(total) + "\n");

				}
				if (topping == 3)
				{
					total = small + ketchup;
					System.out.println("That's a small with ketchup, your total adds up to " + df.format(total) + "\n");

				}
			}
			
			if (size == 2)
			{
				System.out.println("That is a Number" + size + "\nWould you like any toppings?"); 
				System.out.println("What toppings would you like?\n(1 for Mustard, 2 for Mayonnaise, 3 for Ketchup)");
				topping = input.nextInt();
				if (topping == 1)
				{
					total = medium + mustard;
					System.out.println("That's a medium with Mustard, your total adds up to " + df.format(total) + "\n");

				}
				if (topping == 2)
				{
					total = medium + mayonnaise;
					System.out.println("That's a medium with Mayonnaise, your total adds up to " + df.format(total) + "\n");

				}
				if (topping == 3)
				{
					total = medium + ketchup;
					System.out.println("That's a medium with ketchup, your total adds up to " + df.format(total) + "\n");

				}
			}
			if (size == 3)
			{
				System.out.println("That is a Number" + size + "\nWould you like any toppings?");
				System.out.println("What toppings would you like?\n(1 for Mustard, 2 for Mayonnaise, 3 for Ketchup)");
				topping = input.nextInt();
				if (topping == 1)
				{
					total = large + mustard;
					System.out.println("That's a large with Mustard, your total adds up to " + df.format(total) + "\n");

				}
				if (topping == 2)
				{
					total = large + mayonnaise;
					System.out.println("That's a large with Mayonnaise, your total adds up to " + df.format(total) + "\n");

				}
				if (topping == 3)
				{
					total = large + ketchup;
					System.out.println("That's a large with ketchup, your total adds up to " + df.format(total)+ "\n");
				}
			}
		}
	}
}
