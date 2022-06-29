import java.util.*;

public class ProductionWorkerProgram {

	public static void main(String[] sth) {
		getEmployeeDetails();
	}


	public static void getEmployeeDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the name of a worker");
		String names = sc.nextLine();
		System.out.println("Enter the date the employee was hired");
		String hireDate = sc.nextLine();
		System.out.println("Enter the employee number of the worker");
		String number = sc.nextLine();
		productionWorker(names, number, hireDate, sc);
	}


	public static void productionWorker(String name, String num, String date, Scanner sc) {
		boolean stop = false;
		while (!stop) {
			try {
				ProductionWorker worker = new ProductionWorker(name, num, date);
				stop = true;
				getProductionWorkerDetails(worker, sc);
			} catch (Exception e) {
				System.out.print(e.getMessage() + ". Enter again: ");
				num = sc.nextLine();
			}
		}
		System.out.println(worker);
	}


	public static void getProductionWorkerDetails(ProductionWorker worker, Scanner sc) {
		System.out.println("What shift does the employee work? Enter 1 for day shift or 2 for night shift");
		boolean stop = false;
		while (!stop) {
			try {
				worker.setShift(sc.nextInt());
				stop = true;
			} catch (Exception e) {
				System.out.print(e.getMessage() + ". Enter again: ");
			}
		}
		System.out.println("How much is the hourly pay rate?");
		while (stop) {
			try {
				worker.setHourlyPayRate(sc.nextDouble());
				stop = false;
			} catch (Exception e) {
				System.out.print(e.getMessage() + ". Enter again: ");
			}
		}
	}
}