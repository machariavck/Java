
public class Player {

	private final int STARTING_POINTS = 50;
	public static int players;
	private int points;
	private int rValue = 0;

	public Player() {
		points = STARTING_POINTS;
	}

	public void rollDice() {
		Die d1 = new Die();
		Die d2 = new Die();
		rValue = d1.getValue() + d2.getValue();
		if ((points - rValue) < 1)
			points += rValue;
		else 
			points -= rValue;
	}

	public int rolledValue() {
		return rValue;
	}

	public int getPoints() {
		return points;
	}
}
	