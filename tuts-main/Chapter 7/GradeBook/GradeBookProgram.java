import java.util.*;

public class GradeBookProgram {
	public static void main(String[] sth) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nYou are to enter each student's names and their test scores. Press enter to continue..");
		GradeBook gb = new GradeBook(5, 4);
		sc.nextLine();
		for (int i = 0; i < 5; i++) {
			System.out.println("\n******************************************************************");
			System.out.print("Student Name:: ");
			String name = sc.nextLine();
			System.out.println();
			gb.setName(name);
			for (int t = 0; t < 4; t++) {
				System.out.printf("Test score %d: ", (t + 1));
				int g = sc.nextInt();
				while (g < 0 || g > 100) {
					System.out.println("Invalid input. Enter again.");
					System.out.printf("Test score %d: ", (t + 1));
					g = sc.nextInt();
				}
				sc.nextLine();
				gb.setScores(i, t, g);
			}
		}
		System.out.println("******************************************************************");
		System.out.println("******************************************************************");
		System.out.println("Press enter to view the report of each student");
		sc.nextLine();
		System.out.println("******************************************************************");
		System.out.println("******************************************************************");
		for (int student = 0; student < 5; student++) {
			System.out.println();
			System.out.println("==================");
			System.out.println(gb.getName(student));
			System.out.println("==================");
			for (int test = 0; test < 4; test++)
				System.out.printf("Test: %d Score: %d\n", (test + 1), gb.getTestScores(student, test));
			System.out.println("\nAverage Score: " + gb.average(student));
			System.out.println("Grade: " + gb.grading(student));
		}
		System.out.println("******************************************************************");
		System.out.println("~THE END~");
	}
}