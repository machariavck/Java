import java.util.*;

public class Player {

	public static int players;
	private int points;
	Random d = new Random();
	private String guess;

	public Player() {
		points = 0;
		guess = "";
	}

	public String guessSide() {
		 guess = (d.nextInt(2) == 1) ? "heads" : "tails";
		 return guess;
	}

	public String getSideGuessed() {
		return guess;
	}

	public void addPoint() {
		points++;
	}

	public int getPoints() {
		return points;
	}
}

	