package gameZone;

import javax.swing.JOptionPane;

public class RandomGuessMatch 
{
	public static void main(String[] args)
	{
		final int MIN = 1;
		final int MAX = 5;
		int random;
		int guess;
		boolean isMatch;
		String guessString;
		random = MIN + (int)(Math.random() * MAX);
		
		guessString = JOptionPane.showInputDialog(null, "Guess my number between " + MIN + " and " +
		MAX, "Random guess",JOptionPane.INFORMATION_MESSAGE);
		
		guess = Integer.parseInt(guessString);
		isMatch = guess == random;
		JOptionPane.showMessageDialog(null, "Your guess was " + (random-guess) + " number away from the random number.");
		JOptionPane.showMessageDialog(null, "The number was " + random + ". The result is " + isMatch + ".");
	}
}
