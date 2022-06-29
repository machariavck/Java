
public abstract class Student {

	private String name;
	private String idNumber;
	private int yearAdmitted;

	public Student(String n, String i, int y) {
		name = n;
		idNumber = i;
		yearAdmitted = y;
	}

	public String toString() {
		return "Student Name: " + name + "\nStudent ID: " + idNumber + "\nAdmission Date: " + yearAdmitted;
	}

	public abstract int getRemainingHours();
}