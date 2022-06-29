import java.util.*;

public class PayrollTest {

	public static void main(String[] sth) {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		while (b) {
			System.out.println("Enter an employee's name..");
			String n = sc.nextLine();
			System.out.println("Enter the employee's ID number..");
			String d = sc.nextLine();
			try {
				Payroll p = new Payroll(n, d);
				System.out.println("Enter the number of hours worked by the employee..");
				p.setHoursWorked(sc.nextInt());
				System.out.println("Enter the hourly pay rate for the employee..");
				p.setHourlyPayRate(sc.nextFloat());
				b = false;
				System.out.println(p);
			} catch (InvalidValue | EmptyString e) {
				System.out.println(e.getMessage() + " Try again");
				sc.nextLine();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}