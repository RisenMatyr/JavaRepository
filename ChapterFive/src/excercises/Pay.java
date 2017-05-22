package excercises;

import javax.swing.JOptionPane;

public class Pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//what skill level the worker is
		//options for insurance
		skill();
	}
	public static void skill()
	{
		String skillLevelString;
		String insuranceLevelString;
		String retirementString;
		String hoursWorkedString;
		int skillLevelInt;
		int insuranceLevelInt;
		double totalNetPay;
		double totalGrossPay;
		double hoursWorkedDouble;
		
		skillLevelString = JOptionPane.showInputDialog(null, "What skill level are you 1, 2, or 3?");
		skillLevelInt = Integer.parseInt(skillLevelString);
		
		if(skillLevelInt == 1)
		{
			insuranceLevelString = JOptionPane.showInputDialog(null, "What insurance do you have? 1, 2, or 3?");
			insuranceLevelInt = Integer.parseInt(insuranceLevelString);
			if(insuranceLevelInt == 1)
			{
				hoursWorkedString = JOptionPane.showInputDialog(null, "How many hours during the week did you work?");
				hoursWorkedDouble = Double.parseDouble(hoursWorkedString);
				totalGrossPay = 17 * hoursWorkedDouble;
				totalNetPay = totalGrossPay - 32.50;
				JOptionPane.showMessageDialog(null, "You worked " + hoursWorkedDouble + " hours. Your grosspay is " + totalGrossPay + " subtracting insurance for level 1" +
				" making your total net pay equal " + totalNetPay); 
			}
			if(insuranceLevelInt == 2)
			{
				hoursWorkedString = JOptionPane.showInputDialog(null, "How many hours during the week did you work?");
				hoursWorkedDouble = Double.parseDouble(hoursWorkedString);
				totalGrossPay = 17 * hoursWorkedDouble;
				totalNetPay = totalGrossPay - 20;
				JOptionPane.showMessageDialog(null, "You worked " + hoursWorkedDouble + " hours. Your grosspay is " + totalGrossPay + " subtracting insurance for level 1" +
				" making your total net pay equal " + totalNetPay); 
			}
			if(insuranceLevelInt == 3)
			{
				hoursWorkedString = JOptionPane.showInputDialog(null, "How many hours during the week did you work?");
				hoursWorkedDouble = Double.parseDouble(hoursWorkedString);
				totalGrossPay = 17 * hoursWorkedDouble;
				totalNetPay = totalGrossPay - 10;
				
				retirementString = JOptionPane.showInputDialog(null, "3% retirement option Yes or No?");
				if(retirementString.equals("Yes"));
				{
					//Calculate retirement pay here
				}
				if(retirementString.equals("No"))
				{
				JOptionPane.showMessageDialog(null, "You worked " + hoursWorkedDouble + " hours. Your grosspay is " + totalGrossPay + " subtracting insurance for level 1" +
				" making your total net pay equal " + totalNetPay); 
				}
			}
		}
		if(skillLevelInt == 2)
		{
			
		}
		if(skillLevelInt == 3)
		{
			
		}
	}
	public static void insurance()
	{
		
	}
}
