
public class CellPhone {

	private String manuf;
	private String model;
	private float retailPrice;

	public CellPhone(String mn, String md, float rP) {
		manuf = mn;
		model = md;
		retailPrice = rP;
	}
	
	public void setManuf(String x) {
		manuf = x;
	}
	
	public void setModel(String y) {
		model = y;
	}
	
	public void setRetailPrice(float r) {
		retailPrice = r;
	}

	public String getManuf() {
		return manuf;
	}

	public String getModel() {
		return model;
	}

	public float getRetailPrice() {
		return retailPrice;
	}
}
