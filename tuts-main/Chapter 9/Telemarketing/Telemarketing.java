import javax.swing.*;

public class Telemarketing {

	public static void main(String[] sth) {
		String[] name = { "Harrison, Rose", "James, Jean", "Smith, William", "Smith, Brad" };
		String[] phone = { "555-2234", "555-9098", "555-1785", "555-9224" };
		
		String in = JOptionPane.showInputDialog("Enter a name or a few characters representing the name, I'll print the details");
		StringBuffer g = new StringBuffer();
		for (int i = 0; i < name.length; i++) {
			if ((name[i].toLowerCase()).indexOf(in.toLowerCase()) != -1)
				g.append(name[i] + ": " + phone[i] + "\n");
		}
		JOptionPane.showMessageDialog(null, g);
	}
}