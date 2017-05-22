package exercises;

public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] salaries = {6.25, 6.55, 10.25, 16.85};
		
		String[] employeeNames = {"John", "Bob", "Tina", "Jack"};
		
		salaries[0] = 6.25;
		salaries[1] = 6.55;
		salaries[2] = 10.25;
		salaries[3] = 16.85;
		
		System.out.println("Salaries one  by one are:");
		for(int i = 0; i < 4; i = i + 1)
		{
		System.out.println("Name : " + employeeNames[i] + " " + salaries[i]);
		}
	}

}
