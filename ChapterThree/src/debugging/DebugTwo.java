package debugging;

public class DebugTwo 
{
	public static void main(String args[])
	   {
	      double a = 2, b = 5, c = 10;
	      add(a, b);
	      add(b, c);
	      subtract(c, a);            
	   }
	   public static void add(double a, double  b)
	   {
	      System.out.println("The sum of " + a +
	         " and " + b + " is " + (a + b));
	   }
	   public static void subtract(double c, double a)
	   {
	      System.out.println("The difference between " +
	        c + " and " + a + " is " +  (c - a));
	   }
}