import java.util.Random;

public class Die {

	private final int SIDES = 6;
	private int value;
	
	public Die() {
		value = 0;
		roll();
	}
	
	public void roll() {
		Random d = new Random();
		value = d.nextInt(SIDES) + 1;
	}
	
	public int getValue() {
		return value;
	}
	
}