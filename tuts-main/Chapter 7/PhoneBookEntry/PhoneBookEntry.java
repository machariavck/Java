
public class PhoneBookEntry {

	private String name;
	private String phoneNum;

	public PhoneBookEntry(String n, String p) {
		name = n;
		phoneNum = p;
	}

	public void setName(String n) {
		name = n;
	}

	public void setPhoneNum(String n) {
		phoneNum = n;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}
}