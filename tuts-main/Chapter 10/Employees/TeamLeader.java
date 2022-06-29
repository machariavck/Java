
public class TeamLeader extends ProductionWorker {

	private double fixedMonthlyBonus;		//default monthly bonus is $100
	private int requiredTrainingHours;		//default training hours is 120 per year
	private int trainingHoursTaken;			//default value is zero

	public TeamLeader(double f, int r, int t) {
		fixedMonthlyBonus = f;
		requiredTrainingHours = r;
		trainingHoursTaken = t;
	}

	public TeamLeader(String n, String i, String d) {
		super(n, i, d);
	}

	public TeamLeader(TeamLeader t) {
		this(t.fixedMonthlyBonus, t.requiredTrainingHours, t.trainingHoursTaken);
		setNames(t.getNames());
		setEmployeeNumber(t.getEmployeeNumber());
		setDateHired(t.getDateHired());
		setShift(t.getShift());
		setHourlyPayRate(t.getHourlyPayRate());
	}

	public TeamLeader() {
		this(100, 120, 0);
	}

	public void setFixedMonthlyBonus(double f) {
		fixedMonthlyBonus = f;
	}

	public void setRequiredTrainingHours(int t) {
		requiredTrainingHours = t;
	}

	public void setTrainingHoursTaken(int t) {
		trainingHoursTaken = t;
	}

	public double getFixedMonthlyBonus() {
		return fixedMonthlyBonus;
	}

	public int getRequiredTrainingHours() {
		return requiredTrainingHours;
	}
	
	public int getTrainingHoursTaken() {
		return trainingHoursTaken;
	}

	@Override
	public double monthlyPay() {
		return getHourlyPayRate() * 12 * 30 * 109.51 + fixedMonthlyBonus * 109.51;
	}

	@Override
	public String toString() {
		return super.toString() + "\nFixed Monthly Bonus: KES " + fixedMonthlyBonus * 109.51 + "\nRequired Training Hours: " +
				requiredTrainingHours + "\nAttended Training Hours: " + trainingHoursTaken;
	}
}