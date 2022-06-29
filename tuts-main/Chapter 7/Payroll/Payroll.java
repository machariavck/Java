public class Payroll {
	
	private final int NUM_OF_EMPLOYEES = 7;
	private int[] employeeID = { 5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489 };
	private int[] hours = new int[NUM_OF_EMPLOYEES];
	private double[] payRate = new double[NUM_OF_EMPLOYEES];
	private double[] wages = new double[NUM_OF_EMPLOYEES];
	
	public Payroll() {
		System.out.println("Enter the data appropriately\n");
	}

	public void setHours(int h, int id) {
		hours[id] = h;
	}
	
	public void setPayRate(double pr, int id) {
		payRate[id] = pr;
	}

	public int getEmployeeID(int id) {
		return employeeID[id];
	}
	
	public int getNumberOfEmployees() {
		return NUM_OF_EMPLOYEES;
	}

	public double getEachGrossPay(int id) {
		return Math.ceil(hours[id] * payRate[id]);
	}
}