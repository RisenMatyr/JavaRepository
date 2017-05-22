package gameZone;
import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.Random;
public class RockPaperScissors {
	@SuppressWarnings({ "unused" })
	public static void main(String[] args) throws Exception
	{
		@SuppressWarnings({ "resource" })
		Scanner input = new Scanner(System.in);
		
		int game = 0;
		int win = 0;
		int lose = 0;
		
		String Output;
		
		do
		{
			String Game;
			Game = JOptionPane.showInputDialog(null, "        Rock, Paper, or Scissors?\n           "
					+ " Won " + win + " Lost " + lose + " Games " + game);
		    if(Game.equals("Rock") || Game.equals("rock"))
		    {
		    	Random rand = new Random();
				int  n = rand.nextInt(3) + 1;
		    if(n == 3)
		    {
				JOptionPane.showMessageDialog(null, "Enemy choose Scissors, you won!");
		    	win = win + 1;
		    	game = game + 1;
		    }
		    	else if(n == 1)
				{
		    		JOptionPane.showMessageDialog(null, "Enemy choose Rock, it was a tie");
			   		game = game + 1;
				}
				else if(n == 2)
				{
					JOptionPane.showMessageDialog(null, "Enemy choose Paper, you lost");
			  		lose = lose + 1;
		    		game = game + 1;
				}
		    }
		    if(Game.equals("Paper") || Game.equals("paper"))
		    {
		    	Random rand = new Random();
				int  n = rand.nextInt(3) + 1;
		    if(n == 1)
		    {
		    	JOptionPane.showMessageDialog(null, "Enemy choose Rock, you won!");
		    	win = win + 1;
		    	game = game + 1;
		    }
		    	else if(n == 2)
		    	{
		    		JOptionPane.showMessageDialog(null, "Enemy choose Paper, it was a tie");
		    		game = game + 1;
		    	}
		    	else if(n == 3)
		    	{
		    		JOptionPane.showMessageDialog(null, "Enemy choose Scissors, you lost");
		    		lose = lose + 1;
		    		game = game + 1;
		    	}
		    }
		    if(Game.equals("Scissors") || Game.equals("scissors"))
		    {
		    	Random rand = new Random();
				int  n = rand.nextInt(3) + 1;
		    if(n == 2)
		    {
		    	JOptionPane.showMessageDialog(null, "Enemy choose Paper, you won!");
		    	win = win + 1;
		    	game = game + 1;
		    }
	    	else if(n == 1)
			{
	    		JOptionPane.showMessageDialog(null, "Enemy choose Rock, you lost");
		  		lose = lose + 1;
		   		game = game + 1;
			}
			else if(n == 3)
			{
				JOptionPane.showMessageDialog(null, "Enemy choose Scissors, it was a tie");
	    		game = game + 1;
			}
	    }
		}while (game < 10);
		if (win > lose)
	    {
			JOptionPane.showMessageDialog(null, "Congrats you won the game!");
	    }
		if (win < lose)
	    {
			JOptionPane.showMessageDialog(null, "You lost!");
	    }
		if (win == lose)
	    {
			JOptionPane.showMessageDialog(null, "It was a tie");
	    }
	}
}
	
		
		
	


