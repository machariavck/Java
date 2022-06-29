import java.util.Scanner;

public class ChoHan {
	public static void main(String[] sth) {
		final int ROUNDS = 5;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the first player's name: ");
		String player1 = sc.nextLine();
		System.out.print("\nEnter the second player's name: ");
		String player2 = sc.nextLine();
		int player1Points = 0, player2Points = 0;
		for (int count = 1; count <= ROUNDS; count++) {
			System.out.println("\n-----------------------------------------------------------");
			System.out.printf("Now playing round %d.\n", count);
			Dealer dl = new Dealer();
			dl.rollDice();
			System.out.printf("The dealer rolled %d and %d.\n", dl.getDie1Value(), dl.getDie2Value());
			System.out.printf("Result: %s\n", dl.getChoOrHan());
			player1Points += printGuess(player1, dl.getChoOrHan());
			player2Points += printGuess(player2, dl.getChoOrHan());	
		}
		for (int x = 1; x <= 2; x++) {
			System.out.println("-----------------------------------------------------------");
		}
		theEnd(player1, player2, player1Points, player2Points);

	}
	
	public static int printGuess(String p, String c) {
		Player pl = new Player(p);
		pl.makeGuess();
		String g = pl.getGuess();
		System.out.printf("The player %s guessed %s.\n", p, g);
		if (g.charAt(0) == c.charAt(0)) {
			System.out.printf("Awarding 1 point(s) to %s.\n", p);
			pl.addPoints(1);
		}
		return pl.getPoints();
	}

	public static void theEnd(String p1, String p2, int t1, int t2) {
		System.out.println("\tGame Over. Here are the results:\n\n");
		System.out.printf("\t\t%s: %d points.\n", p1, t1);
		System.out.printf("\t\t%s: %d points.\n\n", p2, t2);
		if (t2 > t1)
			System.out.printf("\t%s is the grand winner\n", p2.toUpperCase());
		else if (t1 > t2)
			System.out.printf("\t%s is the grand winner\n", p1.toUpperCase());
		else
			System.out.printf("It's a draw!!\n");
	}
}