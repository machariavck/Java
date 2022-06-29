
public class ShiftSupervisor extends Employee {

	private float salary;		
	private float bonus;		//default bonus is zero

	public ShiftSupervisor(String n, String i, String d, float s, float b) {
		super(n, i, d);
		salary = s;
		bonus = b;
	}

	public ShiftSupervisor(ShiftSupervisor s) {
		super(s.getNames(), s.getEmployeeNumber(), s.getDateHired());
		salary = s.salary;
		bonus = s.bonus;
	}

	public ShiftSupervisor(String n, String i, String d, float s) {
		this(n, i, d, s, 0);
	}

	public void setSalary(float s) {
		salary = s;
	}

	public void setBonus(float s) {
		bonus = s;
	}

	public float getSalary() {
		return salary;
	}

	public float getBonus() {
		return bonus;
	}

	public float getTotal() {
		return salary + bonus;
	}

	@Override
	public String toString() {
		return super.toString() + "\nAnnual Salary: KES " + salary + "\nAnnual Bonus: KES " + bonus + "\nGross Payout: KES " + getTotal();
	}
}