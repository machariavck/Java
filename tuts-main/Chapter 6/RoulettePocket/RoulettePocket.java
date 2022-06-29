public class RoulettePocket {
	
	private String pocketColor;
	
	public RoulettePocket(int p) {
		setPocketColor(p);
	}
	
	public void setPocketColor(int p) {
		if (p == 0)
			pocketColor = "green";
		else if (p > 0 && p < 11)
			pocketColor = (p % 2 == 0) ? "black" : "red";
		else if (p > 10 && p < 19)
			pocketColor = (p % 2 == 0) ? "red" : "black";
		else if (p > 18 && p < 29)
			pocketColor = (p % 2 == 0) ? "black" : "red";
		else if (p > 28 && p < 37)
			pocketColor = (p % 2 == 0) ? "red" : "black";
	}

	public String getPocketColor() {
		return pocketColor;
	}
}