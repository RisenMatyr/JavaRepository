package examples;
import java.util.Scanner;
public class EggsDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int  eggsLeft, dozenEggs;
		int eggsWanted;
		
		Scanner inputDevice = new Scanner(System.in);
		
		double dozenTotal, singlePrice;
		double dozenPrice = 2.00;
		
		System.out.println("How many eggs you want >> ");
		eggsWanted = inputDevice.nextInt();
		dozenEggs = eggsWanted / 12;
		eggsLeft = eggsWanted % 12;
		dozenTotal = dozenEggs * dozenPrice;
		singlePrice = eggsLeft * 0.25;
		
		System.out.println("You have " + dozenEggs + " dozen eggs...");
		System.out.println("You have " + eggsLeft + " eggs left...");
		System.out.println("This will cost " + (singlePrice + dozenTotal) + "$");
	}

}