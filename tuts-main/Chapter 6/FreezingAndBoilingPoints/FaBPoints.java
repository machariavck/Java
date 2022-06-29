public class FaBPoints {

	private int temperature;

	public FaBPoints(int t) {
		temperature = t;
	}

	public FaBPoints(String t) {
		temperature = Integer.parseInt(t);
	}

	public FaBPoints() {
		temperature = 0;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int t) {
		temperature = t;
	}

	public boolean isEthylFreezing() {
		return temperature <= -173 ? true: false;
	}

	public boolean isEthylBoiling() {
		return temperature >= 172 ? true: false;
	}

	public boolean isOxygenFreezing() {
		return temperature <= -362 ? true: false;
	}

	public boolean isOxygenBoiling() {
		return temperature >= -306 ? true: false;
	}

	public boolean isWaterFreezing() {
		return temperature <= 32 ? true: false;
	}

	public boolean isWaterBoiling() {
		return temperature >= 212 ? true: false;
	}
}