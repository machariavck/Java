import java.util.*;

public class Die {
	
	private final int MIN_SIDES = 4;
	private int sides;
	private int value;

	public Die(int sides) {
		if (sides < MIN_SIDES)
			throw new IllegalArgumentException("The die must have at least " + MIN_SIDES + " sides.");
		this.sides = sides;
		roll();
	}
	
	private void roll() {
		Random r = new Random();
		value = r.nextInt(sides) + 1;
	}
	
	public int getValue() {
		return value;
	}

	public int getSides() {
		return sides;
	}

	public String toString() {
		return "\nDie Sides: " + sides + "\nValue: " + value;
	}
}