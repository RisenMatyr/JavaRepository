package methodConstruction;
import java.util.Scanner;
public class page134 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner inputDevice = new Scanner(System.in);
		char vType;
		int value;
		double commRate;
		
		System.out.print("Please enter value >> ");
		value = inputDevice.nextInt();
		
		System.out.print("Please enter commission rate >> ");
		commRate = inputDevice.nextDouble();
		
		System.out.print("Please enter car type >> ");
		vType = inputDevice.next().charAt(0);
		
		computeCommission(value,commRate, vType);
		computeCommission(40000, 0.10, 'L');
	}
	public static void computeCommission(int value,
			double rate, char vehicle)
	{
		double commission;
		commission = value * rate;
		System.out.println("\nThe " + vehicle + 
				" type vehicle is worth $" + value);
		System.out.println("With " + (rate * 100) +
				"% commission rate, the commission is $" +
				commission);
	}

}
