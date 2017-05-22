package exercises;

import java.util.Scanner;


public class AverageOfQuizzes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = new int [10];
		int score = 0;
		int count = 0;
		int total = 0;
		int highest = 0;
		int lowest = 100;
		final int QUIT = 999;
		final int MAX = 10;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter quiz score or " + QUIT + " to quit >>");
		
		score = input.nextInt();
		while(score != QUIT)
		{
			scores[count] = score;
			total = total + scores[count];
			count = count + 1;
			if(highest <= score)
				highest = score;
			if(count == MAX)
				score = QUIT;
			else
				System.out.print("Enter next quiz score or " + QUIT + " to quit >>");
				score = input.nextInt();			
		}
		System.out.print("\n The scores entered were: ");
		for (int x = 0; x < count; x = x + 1)
		{
			System.out.print(scores[x] + " ");
		}
		if(count != 0)
		{
			System.out.print("\nThe average is " + (total * 1.0 / count));
		}
		else
		{
			System.out.println("No scores were entered");
		}
	}
}