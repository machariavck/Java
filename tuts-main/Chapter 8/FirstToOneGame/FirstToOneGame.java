import java.util.*;

public class FirstToOneGame {

	public static void main(String[] sth) {

		Scanner s = new Scanner(System.in);
		Player[] p = runIntro(s);
		boolean continuePlaying = true;
		while (continuePlaying) {
			rollDice(p);
			continuePlaying = checkFor1(p);
			if (continuePlaying) {
				System.out.println("\nPress enter to proceed for the next round...");
				s.nextLine();
			}
		}
		System.out.println("\nThat was a good game, wasn't it?");
		s.nextLine();
	}


	/**running Intro*/
	public static Player[] runIntro(Scanner sc) {
		System.out.println("\n\nWelcome to the First-to-One Game. Press enter to continue...");
		sc.nextLine();
		System.out.print("First, enter the number of players who will play: ");
		Player.players = sc.nextInt();
		while (Player.players < 2) {
			System.out.print("Invalid number of players. You should be 2 or more to play this game. Enter a valid number of players: ");
			Player.players = sc.nextInt();
		}
		sc.nextLine();
		Player[] player = new Player[Player.players];
		for (int i = 0; i < Player.players; i++)
			player[i] = new Player();
		System.out.println("\nSo, each player will have his turn to play. whoever reaches 1 point first wins the game. Press enter to start...");
		sc.nextLine();
		return player;
	}


	/**for every player roll dice and print points*/
	public static void rollDice(Player... l) {
		for (int i = 0; i < Player.players; i++) {
			l[i].rollDice();
			System.out.println("Player " + (i + 1) + " rolled. Rolled " + l[i].rolledValue() + ". The player's current points are " + l[i].getPoints());
		}
	}


	/**check if any of the player has 1 to end the game (and loop out)*/
	public static boolean checkFor1(Player... l) {
		boolean b = true;
		int i = 0;
		while (b && i < Player.players) {
			if (l[i].getPoints() == 1) {
				b = false;
				System.out.println("\n\nPLAYER " + (i + 1) + " WON");
			}
			i++;
		}
		return b;
	}
}