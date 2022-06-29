public class Player {

	private int points;

	public Player() {
		points = 0;
	}

	public void rollDice() {
		Die d1 = new Die();
		Die d2 = new Die();
		points = d1.getValue() + d2.getValue();
	}

	public int getPoints() {
		return points;
	}
}

