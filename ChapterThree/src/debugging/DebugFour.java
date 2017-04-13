package debugging;

public class DebugFour 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int myCredits = 13;
	      int yourCredits = 17;
	      double rate = 75.84;
	      System.out.println("My tuition:");
	      tuitionBill(myCredits, rate);
	      System.out.println("Your tuition:");
	      tuitionBill(yourCredits, rate);
	}
	   public static void tuitionBill(int c, double r)
	{
	      int a = 0;
		int b = 0;
		System.out.println("Total due " + (a*b));
	}
}
