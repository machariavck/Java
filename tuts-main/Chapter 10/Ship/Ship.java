
public class Ship {

	private String name;
	private String yearBuilt;

	public Ship(String n, String y) {
		name = n;
		yearBuilt = y;
	}

	public Ship() {
		this("","");
	}

	public String getName() {
		return name;
	}

	public String getYearBuilt() {
		return yearBuilt;
	}

	public void setName(String s) {
		name = s;
	}

	public void setYearBuilt(String s) {
		yearBuilt = s;
	}

	public String toString() {
		return "\nShip Name: " + name + "\nYear Built: " + yearBuilt;
	}
}