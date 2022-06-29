
public class Employee {

	private String names;
	private String employeeNumber;
	private String dateHired;

	public Employee(String name, String number, String d) {
		names = name;
		employeeNumber = number;
		dateHired = d;
	}

	public Employee(Employee n) {
		names = n.names;
		employeeNumber = n.employeeNumber;
		dateHired = n.dateHired;
	}

	public Employee() {
		this("", "", "");
	}

	public void setNames(String n) {
		names = n;
	}

	public void setEmployeeNumber(String n) {
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