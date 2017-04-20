package gameZone;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;
public class RockPaperScissors {
	public static void main(String[] args) throws Exception
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		Random rand = new Random();
		int  n = rand.nextInt(3) + 1;
		
		int rock = 1;
		int paper = 2;
		int scissors = 3;
		
		int game = 0;
		int win = 0;
		int lose = 0;
		
		do
		{
			String[] buttons = { "Rock", "Paper", "Scissors"};

		    int rc = JOptionPane.showOptionDialog(null, "Won " + win + " Lost " + lose,
		        null, JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[2]);
		    System.out.println(rc);
		    
		    if(buttons.equals("Rock"))
		    {
		    if(n == 3)
		    {
		    	win = win + 1;
		    }else
		    
		} while (game < 10);
		
		
	}

}
