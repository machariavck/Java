
import java.util.*;

public class BarChart {
	public static void main(String[] sth) {
		int storeNo, y = 0, sales1 = 0, sales2 = 0, sales3 = 0, sales4 = 0, sales5 = 0;
		Scanner uInput = new Scanner(System.in);
		System.out.printf("\n\t\tWelcome to the Bar Chart program.\n");
		for (storeNo = 1; storeNo <= 5; storeNo++) {
			System.out.printf("\nEnter today's sales for store %d: ", storeNo);
			switch (storeNo) {
				case 1:
					sales1 = uInput.nextInt();
					break;
				case 2:
					sales2 = uInput.nextInt();
					break;
				case 3:
					sales3 = uInput.nextInt();
					break;
				case 4:
					sales4 = uInput.nextInt();
					break;
				case 5:
					sales5 = uInput.nextInt();
					break;
			}
		}
		System.out.printf("\n\nSALES\tBAR\tCHART");
		for (int x = 1; x <= 5; x++) {
			switch (x) {
				case 1:
					y = sales1 / 100;
					break;
				case 2:
					y = sales2 / 100;
					break;
				case 3:
					y = sales3 / 100;
					break;
				case 4:
					y = sales4 / 100;
					break;
				case 5:
					y = sales5 / 100;
					break;
			}
			System.out.printf("\nStore %d: ", x);
			for (int m = 1; m <= y; m++) {
				System.out.printf("*");
			}
		}
		System.out.println("\n\t\t\t\tBYE BYE!!!");
	}
}
