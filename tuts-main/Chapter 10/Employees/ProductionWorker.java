
public class ProductionWorker extends Employee {

	private int shift;				//default is day shift (1)
	private double hourlyPayRate;	//default pay rate is $20 per hour

	public ProductionWorker(String n, String i, String d, int s, double p) {
		super(n, i, d);
		shift = s;
		hourlyPayRate = p;
	}

	public ProductionWorker(String n, String i, String d) {
		this(n, i, d, 1, 20);
	}

	public ProductionWorker(int s, double p) {
		shift = s;
		hourlyPayRate = p;
	}

	public ProductionWorker(ProductionWorker p) {
		this(p.getNames(), p.getEmployeeNumber(), p.getDateHired(), p.shift, p.hourlyPayRate);
	}

	public ProductionWorker() {
		this(1,20);
	}

	public void setShift(int s) {
		shift = s;
	}

	public void setHourlyPayRate(double d) {
		hourlyPayRate = d;
	}

	public int getShift() {
		return shift;
	}

	public double getHourlyPayRate() {
		return hourlyPayRate;
	}

	public double monthlyPay() {
		return hourlyPayRate * 12 * 30 * 109.51;
	}

	@Override
	public String toString() {
		return super.toString() + "\nShift: " + shift + "\nHourly Pay Rate: KES " + hourlyPayRate * 109.51 + "\nMonthly Payout: KES " + monthlyPay();
	}
}