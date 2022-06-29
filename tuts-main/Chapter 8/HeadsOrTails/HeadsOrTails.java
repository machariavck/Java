import java.util.*;

public class HeadsOrTails {

	public static void main(String[] sth) {
		Scanner sc = new Scanner(System.in);
		Player[] p = runIntro(sc);
		Coin c = new Coin();
		boolean continuePlaying = true;
		
		while (continuePlaying) {
			runGuesses(p);
			flipCoin(p, c, sc);
			continuePlaying = checkFor5Points(p);
			if (!continuePlaying) {
				System.out.println("\nThat was a good game, wasn't it?");
				sc.nextLine();
			}
		}
	}


	/**Run intro and create Players*/
	public static Player[] runIntro(Scanner s) {
		System.out.println("\n\nWelcome to the Heads-Or-Tails Game. Press enter to continue...");
		s.nextLine();
		System.out.print("First, enter the number of players who will play: ");
		Player.players = s.nextInt();
		while (Player.players < 2) {
			System.out.print("Invalid number of players. You should be 2 or more to play this game. Enter a valid number of players: ");
			Player.players = s.nextInt();
		}
		s.nextLine();
		Player[] pp = new Player[Player.players];
		for (int i = 0; i < Player.players; i++)
			pp[i] = new Player();
		System.out.println("\nSo, each player guess heads or tails, then the coin is flipped. Whomever reaches 5 points first wins the game. Press enter to start...");
		s.nextLine();
		return pp;
	}


	/**Run player guesses*/
	public static void runGuesses(Player... l) {
		String guess;
		for (int i = 0; i < Player.players; i++) {
			guess = l[i].guessSide();
			System.out.println("Player " + (i + 1) + " guessed " + guess + ". The player's current points are " + l[i].getPoints());
		}
	}


	/**flip coin and assign respective points*/	
	public static void flipCoin(Player[] l, Coin d, Scanner s) {
		System.out.println("\nPress enter to flip the coin...");
		s.nextLine();
		d.toss();
		System.out.println("\nThe side facing up on the coin is " + d.getSideUp() + ". Press enter to continue...\n\n");
		s.nextLine();
		for (int i = 0; i < Player.players; i++) {
			if (d.getSideUp().equals(l[i].getSideGuessed()))
				l[i].addPoint();
		}
	}


	/**check if any player has reached 5 points to win*/
	public static boolean checkFor5Points(Player... l) {
		boolean playOn = true;
		for (int i = 0; i < Player.players; i++) {
			if (l[i].getPoints() == 5) {
				playOn = false;
				System.out.println("PLAYER " + (i + 1) + " WON");
			}
		}
		return playOn;
	}
}