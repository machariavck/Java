
public class Person {

	private String names;
	private String address;
	private String telephone;

	public Person(String n, String a, String t) {
		names = n;
		address = a;
		telephone = t;
	}

	public Person(Person p) {
		names = p.names;
		address = p.address;
		telephone = p.telephone;
	}

	public Person() {
		this("", "", "");
	}

	public void setNames(String n) {
		names = n;
	}

	public void setAddress(String a) {
		address = a;
	}

	public void setTelephone(String t) {
		telephone = t;
	}

	public String getNames() {
		return names;
	}

	public String getAddress() {
		return address;
	}

	public String getTelephone() {
		return telephone;
	}

	@Override
	public String toString() {
		return "\nFull Names: " + names + "\nAddress: " + address + "\nTelephone Number: " + telephone;
	}
}