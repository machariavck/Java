import java.util.*;

public class Die {
	
	private int noSides;
	private int dieValue;

	public Die(int sides) {
		noSides = sides;
		roll();
	}
	
	void roll() {
		Random r = new Random();
		dieValue = r.nextInt(noSides) + 1;
	}
	
	public int getDieValue() {
		return dieValue;
	}

	public int getNoSides() {
		return noSides;
	}
}
