import java.util.*;

public class PayrollProgram {

	public static void main(String[] sth) {
		System.out.println("\n\nWelcome to PAYROLL CONSOLE PROGRAM V3.0\n\n");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		System.out.println("You'll enter the hours worked and pay rate of each employee.");
		sc.nextLine();
		Payroll pr = new Payroll();
		for (int i = 0; i < pr.getNumberOfEmployees(); i++) {
			System.out.println("\nFor employee number " +  pr.getEmployeeID(i) + ";\n" + "Hours worked: ");
			int hours = sc.nextInt();
			while (hours < 0) {
				System.out.println("Hours cant be negative. Enter again");
				hours = sc.nextInt();
			}
			pr.setHours(hours, i);
			System.out.println("Pay Rate: ");
			double payRate = sc.nextDouble();
			while (payRate < 6) {
				System.out.println("Too low for employees here. Try again");
				payRate = sc.nextDouble();
			}
			pr.setPayRate(payRate, i);
		}
		System.out.println("\n\nID NUMBER\tGROSS WAGES");
		System.out.println("==============================");
		for (int i = 0; i < pr.getNumberOfEmployees(); i++)
			System.out.println(pr.getEmployeeID(i) + "\t\t KES " + pr.getEachGrossPay(i));
	}
}