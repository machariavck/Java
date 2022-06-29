
public class Dealer {
	
	private int die1Value;
	private int die2Value;

	public Dealer() {
		die1Value = 0;
		die2Value = 0;
	}

	public void rollDice() {
		final int SIDES = 6;
		Die die1 = new Die(SIDES);
		Die die2 = new Die(SIDES);
		die1Value = die1.getValue();
		die2Value = die2.getValue();
	}

	public int getDie1Value() {
		return die1Value;
	}

	public int getDie2Value() {
		return die2Value;
	}

	public String getChoOrHan() {
		int sum = die1Value + die2Value;
		return (sum % 2) == 0 ? "Cho (even)" : "Han (odd)";
	}
}