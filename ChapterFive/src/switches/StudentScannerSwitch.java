package switches;
import java.util.Scanner;

public class StudentScannerSwitch {

	public static void main(String[] args) {
		int studentID;
		@SuppressWarnings("unused")
		boolean choice;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		
		do
		{
		System.out.println("Please scan Social Security Card");
		studentID = input.nextInt();
		switch(studentID)
		{
		case 138992:
			System.out.println("Dusty's ID number");
			break;
		case 131193:
			System.out.println("Evan's ID number");
			break;
		case 122190:
			System.out.println("Brandon's ID number");
			break;
		case 308508:
			System.out.println("AshLynn's ID number");
			break;
		case 304275:
			System.out.println("Gairren's ID number");
			break;
		case 112006:
			System.out.println("Nick's ID number");
			break;
		case 138076:
			System.out.println("Alex's ID number");
			break;
		case 308725:
			System.out.println("Alex's ID number");
			break;
		default:
			System.out.println("Fund's failed to transfer");
			break;
		}
		System.out.println("Funds transfered succesfully would you like to give me more money\nI meant would you like to scan again?");
		choice = input.next() != null;
		}while (choice = "yes" != null);
		
	}

}
