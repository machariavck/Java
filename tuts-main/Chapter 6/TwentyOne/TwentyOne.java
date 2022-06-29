import java.util.Scanner;

public class TwentyOne {

	public static void main(String[] sth) {

		System.out.println("\n\nWelcome to the Game of Twenty One!!");
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\nYou are playing against me. Press enter to continue...");
		sc.nextLine();
		String yesOrNo = "yes";
		int compPoints, userPoints;
		while (yesOrNo.charAt(0) == 'y' || yesOrNo.charAt(0) == 'Y') {
			compPoints = 0;
			userPoints = 0;
			Player comp = new Player();
			Player user = new Player();
			for (int rounds = 1; rounds < 22; rounds++) {
				comp.rollDice();
				System.out.println("\nDo you want to continue and roll the dice? Enter 1 if yes, 0 to quit");
				int ifRoll = sc.nextInt();
				sc.nextLine();
				if (ifRoll == 0) {
					yesOrNo = "No";
					rounds = 22;
				}
				else {
					System.out.println("\nThe dice are rolling....");
					sc.nextLine();
					user.rollDice();
					compPoints += comp.getPoints();
					userPoints += user.getPoints();
					System.out.println("\nThe dice have been rolled and points assigned respectively.");
					sc.nextLine();
				}
			}
			System.out.printf("\n\nI got %d points while you have %d points.", compPoints, userPoints);
			presentWinner(compPoints, userPoints);
			System.out.println("\nDo you wish to play again? Enter yes to continue, no to end");
			yesOrNo = sc.nextLine();
		}
	}
	
	public static void presentWinner(int c, int u) {
		if (c > u)
			System.out.println("\nAI is better at luck than humans!!");
		else
			System.out.println("\nHumans won. Smh.");
	}
}