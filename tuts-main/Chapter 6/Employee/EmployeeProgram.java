import java.util.Scanner;

public class EmployeeProgram {
	public static void main(String[] alpha) {
		Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
		Employee employee2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
		Employee employee3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
		Scanner sc = new Scanner(System.in);
		System.out.println("Whose data do you want to display? (Enter employee's ID)");
		int input = sc.nextInt();
		if (input == 47899) {
			System.out.println("\n\tYou have chosen " + employee1.getName() + ".");
			System.out.println("\tShe works in the " + employee1.getDepartment() + ".");
			System.out.println("\tApparently, she holds the " + employee1.getPosition() + " position.");
		} else if (input == 39119) {
			System.out.println("\n\tYou have chosen " + employee2.getName() + ".");
			System.out.println("\tHe works in the " + employee2.getDepartment() + ".");
			System.out.println("\tApparently, he holds the " + employee2.getPosition() + " position.");
		} else if (input == 81774) {
			System.out.println("\n\tYou have chosen " + employee3.getName() + ".");
			System.out.println("\tShe works in the " + employee3.getDepartment() + ".");
			System.out.println("\tApparently, she holds the " + employee3.getPosition() + " position.");
		} else {
			System.out.println("Invalid ID! (the employee doesn't exist)");
		}
	}
}
