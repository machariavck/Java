import java.util.Scanner;

public class DriverExamProgram {

	public static void main(String[] sth) {
		System.out.println("\nWelcome to the Driver Exam Program. Enter your answers below..");
		Scanner sc = new Scanner(System.in);
		char[] arr = new char[20];
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + ". ");
			String ss = sc.nextLine();
			while ((ss.charAt(0) != 32 && ss.charAt(0) < 65) || ss.charAt(0) > 68) {
				System.out.println("Invalid input. Enter again.");
				System.out.print((i + 1) + ". ");
				ss = sc.nextLine();
			}
			arr[i] = ss.charAt(0);
		}
		DriverExam de = new DriverExam(arr);
		if (de.passed())
			System.out.printf("\nWell, you passed. You got %d questions correct and %d incorrect. Well done!\n", de.getCorrect(), de.getIncorrect());
		else
			System.out.printf("\nWell, you failed. You got %d questions correct and %d incorrect.\n", de.getCorrect(), de.getIncorrect());
		
		if (de.getMissed() == "")
			System.out.println("Great. You did not leave any questions answered.");
		else
			System.out.printf("\nYou left questions " + de.getMissed() + " unanswered");
	}
}
