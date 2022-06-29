
public class Payroll {

	private String employeeName;
	private String idNumber;
	private float hourlyPayRate;
	private int hoursWorked;

	public Payroll(String e, String i) throws EmptyString {
		setEmployeeName(e);
		setIdNumber(i);
		hourlyPayRate = 0;
		hoursWorked = 0;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public float getHourlyPayRate() {
		return hourlyPayRate;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setEmployeeName(String n) throws EmptyString {
		if (n.equals(""))
			throw new EmptyString();
		employeeName = n;
	}

	public void setIdNumber(String n) throws EmptyString {
		if (n.equals(""))
			throw new EmptyString();
		idNumber = n;
	}

	public void setHourlyPayRate(float f) throws InvalidValue {
		if ( f < 0 || f > 25)
			throw new InvalidValue((int)f);
		hourlyPayRate = f;
	}

	public void setHoursWorked(int h) throws InvalidValue {
		if ( h < 0 || h > 84)
			throw new InvalidValue(h);
		hoursWorked = h;
	}

	public float getGrossPay() {
		return hoursWorked * hourlyPayRate;
	}

	public String toString() {
		return String.format("Employee Name: %s\nID Number: %s\nHours Worked: %d\nHourlyPayRate: KES %,.2f\nGross Pay: KES %,.2f", employeeName,
				idNumber, hoursWorked, hourlyPayRate, getGrossPay());
	}
}