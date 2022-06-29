public class PersonalInformation {

	private String name;
	private String address;
	private int age;
	private int phoneNumber;

	public PersonalInformation() {
		name = "";
		address = "";
		age = 0;
		phoneNumber = 0;
	}

	public void setName(String n) {
		name = n;
	}

	public void setAddress(String a) {
		address = a;
	}

	public void setAge(int a) {
		age = a;
	}

	public void setPhoneNumber(int p) {
		phoneNumber = p;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}
}
	