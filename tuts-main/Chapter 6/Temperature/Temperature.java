public class Temperature {

	private double ftemp;
	
	public Temperature(double t) {
		ftemp = t;
	}

	public void setFahrenheit(double t) {
		ftemp = t;
	}

	public double getFahrenheit() {
		return ftemp;
	}

	public double getCelsius() {
		return (5 / 9) * (ftemp - 32);
	}
	
	public double getKelvin() {
		return ((5 / 9) * (ftemp - 32)) + 273;
	}
}