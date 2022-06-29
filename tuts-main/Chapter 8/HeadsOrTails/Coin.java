import java.util.*;

public class Coin {

	private String sideUp;
	Random d = new Random();
	
	public Coin() {
		sideUp = (d.nextInt(2) == 1) ? "heads" : "tails";
	}
	
	public void toss() {
		sideUp = (d.nextInt(2) == 1) ? "heads" : "tails";
	}
	
	public String getSideUp() {
		return sideUp;
	}
}