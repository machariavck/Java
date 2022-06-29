
public class Employee {

	private String names;
	private String employeeNumber;
	private String dateHired;

	public Employee(String name, String number, String d) throws InvalidEmployeeNumber {
		names = name;
		setEmployeeNumber(number);
		dateHired = d;
	}

	public Employee(Employee n) throws InvalidEmployeeNumber {
		this(n.names, n.employeeNumber, n.dateHired);
	}


	public void setNames(String n) {
		names = n;
	}

	public void setEmployeeNumber(String n) throws InvalidEmployeeNumber {
		if (n.length() != 8 || !(n.substring(0, 3)).equalsIgnoreCase("ste") || !(n.substring(6)).equalsIgnoreCase("21"))
			throw new InvalidEmployeeNumber();
		employeeNumber = n;
	}

	public void setDateHired(String n) {
		dateHired = n;
	}

	public String getNames() {
		return names;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public String getDateHired() {
		return dateHired;
	}

	public String toString() {
		return "\nEmployee Names: " + names + "\nEmployee Number: " + employeeNumber + "\nDate Hired: " + dateHired;
	}
}