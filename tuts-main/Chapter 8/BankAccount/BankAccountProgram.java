
public class BankAccountProgram {

	public static void main(String[] sth) {

		BankAccount ob = new BankAccount(5000);
		BankAccount ob2 = new BankAccount(ob);
		System.out.println(ob2);
	}
}