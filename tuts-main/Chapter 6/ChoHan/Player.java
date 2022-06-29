import java.util.Random;

public class Player {
	private String name;
	private String guess;
	private int points;

	public Player(String pName) {
		name = pName;
		guess = "";
		points = 0;
	}

	public void makeGuess() {
		Random rd = new Random();
		guess = rd.nextInt(2) == 1 ? "Cho" : "Han";
	}

	public void addPoints(int newPoints) {
		points += newPoints;
	}

	public String getGuess() {
		return guess;
	}

	public String getName() {
		return name;
	}

	public int getPoints() {
		return points;
	}
}