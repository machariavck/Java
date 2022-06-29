
public class ProductionWorker extends Employee {

	private int shift;				//default is day shift (1)
	private double hourlyPayRate;	//default pay rate is $20 per hour

	public ProductionWorker(String n, String i, String d, int s, double p) throws InvalidShift, InvalidPayRate, InvalidEmployeeNumber {
		super(n, i, d);
		setShift(s);
		setHourlyPayRate(p);
	}

	public ProductionWorker(String n, String i, String d) throws InvalidShift, InvalidPayRate, InvalidEmployeeNumber {
		this(n, i, d, 1, 20);
	}

	public ProductionWorker(ProductionWorker p) throws InvalidShift, InvalidPayRate, InvalidEmployeeNumber {
		this(p.getNames(), p.getEmployeeNumber(), p.getDateHired(), p.shift, p.hourlyPayRate);
	}


	public void setShift(int s) throws InvalidShift {
		if (s < 1 || s > 2 )
			throw new InvalidShift();
		shift = s;
	}

	public void setHourlyPayRate(double d) throws InvalidPayRate {
		if (d < 20 || d > 40)
			throw new InvalidPayRate();
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