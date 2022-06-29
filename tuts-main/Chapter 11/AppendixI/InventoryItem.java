
public class InventoryItem {

	private String description;
	private int units;


	public InventoryItem(String d, int u) {
		description = d;
		units = u;
	}

	public InventoryItem() {
		this("", 0);
	}


	public void setDescription(String s) {
		description = s;
	}

	public void setUnits(int u) {
		units = u;
	}


	public String getDescription() {
		return description;
	}

	public int getUnits() {
		return units;
	}

	public String toString() {
		return "\nDescription: " + description + "*\nUnits Available: " + units;
	}
}