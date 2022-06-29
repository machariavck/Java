import java.util.*;


public class ProductionWorkerProgram {

	public static void main(String[] sth) {

		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the name of a worker");
		String names = sc.nextLine();
		System.out.println("Enter the employee number of the worker");
		String number = sc.nextLine();
		while (!valid(number)) {
			System.out.println("Wrong number format. Use this format; XXX-L, where X is a digit (0 - 9), L is a letter (A - M)");
			number = sc.nextLine();
		}
		System.out.println("Enter the date the employee was hired");
		String hireDate = sc.nextLine();
		
		teamLeader(names, number, hireDate, sc);
		/*
		productionWorker(names, number, hireDate, sc);
		supervisor(names, number, hireDate, sc);
		*/
	}


	public static void teamLeader(String n, String i, String d, Scanner sc) {
		TeamLeader tl = new TeamLeader(n, i, d);
		System.out.println("What shift does the team leader work?");
		int shift = sc.nextInt();
		tl.setShift(shift);
		System.out.println("What is the hourly pay rate for the team leader in dollars?");
		double pr = sc.nextDouble();
		tl.setHourlyPayRate(pr);
		System.out.println("How much is the fixed monthly bonus in dollars for the team leader?");
		double bon = sc.nextDouble();
		tl.setFixedMonthlyBonus(bon);
		System.out.println("How many hours should the leader train?");
		int h = sc.nextInt();
		tl.setRequiredTrainingHours(h);
		System.out.println("How many hours of training did the team leader attend?");
		h = sc.nextInt();
		tl.setTrainingHoursTaken(h);
		System.out.println(tl + "\nThese details are correct, isn't it? Shall I print again?");
		sc.nextLine();
		sc.nextLine();
		System.out.println(new TeamLeader(tl));
	}
		

	/**ProductionWorker class test*/
	public static void productionWorker(String name, String num, String date, Scanner sc) {
		ProductionWorker worker = new ProductionWorker(name, num, date);
		System.out.println("What shift does the employee work? Enter 1 for day shift or 2 for night shift");
		int t = sc.nextInt();
		System.out.println("How much is the hourly pay rate?");
		double p = sc.nextDouble();
		worker.setShift(t);
		worker.setHourlyPayRate(p);
		System.out.println(worker);
	}


	/**supervisor class test*/
	public static void supervisor(String name, String num, String date, Scanner sc) {
		System.out.println("How much does the supervisor earn yearly?");
		float s = sc.nextFloat();
		System.out.println("How much is the bonus?");
		float b = sc.nextFloat();
		ShiftSupervisor sup = new ShiftSupervisor(name, num, date, s, b);
		System.out.println(sup);
	}


	/**validating employee number*/
	public static boolean valid(String n) {
		boolean correct = true;
		if (n.length() != 5)
			correct = false;
		if (correct) {
			for (int i = 0; i < 3; i++) {
				if (!Character.isDigit(n.charAt(i)))
					correct = false;
			}
			if (n.charAt(3) != '-' || n.charAt(4) < 65 || n.charAt(4) > 77)
				correct = false;
		}
		return correct;
	}
}