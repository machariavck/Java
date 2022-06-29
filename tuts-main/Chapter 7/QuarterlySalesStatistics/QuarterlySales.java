import java.util.Scanner;

public class QuarterlySales {
	
	public static void main(String[] sth) {
		System.out.println("\nHello. Enter sales figures for every quarter of a particular division.\n");
		Scanner sc = new Scanner(System.in);
		double[][] sales = new double[6][4];
		double[][] quarterDifference = new double[6][3];
		double[] totalSalesQuarter = new double[4];
		for (int division = 0; division < sales.length; division++) {
			for (int quarter = 0; quarter < sales[division].length; quarter++) {
				System.out.printf("Division %d quarter %d: ", (division + 1), (quarter + 1));
				double d = sc.nextDouble();
				while (d < 0) {
					System.out.println("Incorrect value. Negative numbers not allowed. Try again");
					System.out.printf("Division %d quarter %d: ", (division + 1), (quarter + 1));
					d = sc.nextDouble();
				}
				sales[division][quarter] = d;
				if (quarter > 0)
					quarterDifference[division][quarter - 1] = sales[division][quarter] - sales[division][quarter - 1];
			}
			System.out.println();
		}
		sc.nextLine();
		System.out.println("====================================================================================");

		//sales figures by division
		for (int division = 0; division < sales.length; division++) {
			for (int quarter = 0; quarter < sales[division].length; quarter++)
				System.out.printf("\nDivision %d  Quarter %d has had a sales of KES %,.2f", (division + 1), (quarter + 1), sales[division][quarter]);
			System.out.println();
		}
		System.out.println("\n====================================================================================");
		System.out.println("Press enter to view division's increase or decrease from the previous quarter.");
		sc.nextLine();

		//each division's increase or decrease from the previous quarter
		for (int division = 0; division < sales.length; division++) {
			for (int quarter = 0; quarter < sales[division].length; quarter++) {
				if (quarter > 0)
					System.out.printf("\nDivision %d: Quarter %d to Quarter %d change was KES %,.2f", (division + 1), quarter, (quarter + 1), quarterDifference[division][quarter - 1]);
			}
			System.out.println();
		}
		System.out.println("\n====================================================================================");
		System.out.println("Press enter to view total sales for each quarter.");
		sc.nextLine();

		//total sales for each quarter
		for (int quarter = 0; quarter < 4; quarter++) {
			for (int division = 0; division < sales.length; division++)
				totalSalesQuarter[quarter] += sales[division][quarter];
			System.out.printf("\nTotal Sales for quarter %d: KES %,.2f", (quarter + 1), totalSalesQuarter[quarter]);
		}
		System.out.println("\n====================================================================================");
		System.out.println("Press enter to view the company's increase or decrease from the previous quarter.");
		sc.nextLine();

		//the company's increase or decrease from the previous quarter
		for (int quarter = 1; quarter < 4; quarter++) {
			double diff = totalSalesQuarter[quarter] - totalSalesQuarter[quarter - 1];
			System.out.printf("\nFrom quarter %d to quarter %d, there is a change of KES %,.2f", quarter, (quarter + 1), diff);
		}
		System.out.println("\n====================================================================================");
		System.out.println("Press enter to view the average sales for all divisions that quarter.");
		sc.nextLine();

		//the average sales for all divisions that quarter
		for (int quarter = 0; quarter < 4; quarter++) {
			double average = totalSalesQuarter[quarter] / 6;
			System.out.printf("\nFor quarter %d, the average sales were KES %,.2f", (quarter + 1), average);
		}
		System.out.println("\n====================================================================================");
		System.out.println("Press enter to view the division with the highest sales for that quarter.");
		sc.nextLine();

		//division with the highest sales for that quarter
		for (int quarter = 0; quarter < 4; quarter++) {
			int v = 1;
			double highest = sales[0][quarter];
			for (int division = 1; division < sales.length; division++) {
				if (sales[division][quarter] > highest) {
					highest = sales[division][quarter];
					v = division + 1;
				}
			}
			System.out.printf("\nFor quarter %d, the division with the highest sales was division %d", (quarter + 1), v);
		}
		System.out.println("\n====================================================================================");
		System.out.println("THE END!");
		sc.nextLine();
	}
}