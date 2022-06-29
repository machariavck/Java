import javax.swing.*;


class CheckWriter {

	public static void main(String[] sth) {

		JOptionPane.showMessageDialog(null, "WELCOME TO KUR: BANK\n\n*moving forward since 2015*");
		String date = JOptionPane.showInputDialog("Provide the date today");
		date = formatDate(date);
		String name = JOptionPane.showInputDialog("Provide the full names of the recipient");
		name = formatName(name);
		String amount = JOptionPane.showInputDialog("Provide the amount to be issued in the check");
		amount = formatAmount(amount);

		displayAmount(date, name, amount);
		System.exit(0);
	}


	static void displayAmount(String d, String n, String a) {
		StringBuilder check = new StringBuilder("\n\n                                                           Date:   " + d + "      ");
		check.append("\nPay to the Order of:                       " + n + "                KES " + a + "      ");
		check.append("\n" + amountInWords(a));
		JOptionPane.showMessageDialog(null, check.toString());
	}


	static String amountInWords(String d) {
		String g;

		if (!d.substring(1,2).equals("0") && !d.substring(2,3).equals("0"))
			g = refer(d.substring(0,1)) + "thousand" + refer(d.substring(1,2)) + "hundred and" + refer(d.substring(2,3), d.substring(3,4)) + "and" +
					refer(d.substring(5,6), d.substring(6,7)) + "cent(s) only";
		
		else if (!d.substring(1,2).equals("0") && d.substring(2,3).equals("0") && !d.substring(3,4).equals("0"))
			g = refer(d.substring(0,1)) + "thousand" + refer(d.substring(1,2)) + "hundred and" + refer(d.substring(3,4)) + "and" +
					refer(d.substring(5,6), d.substring(6,7)) + "cent(s) only";
		
		else if (!d.substring(1,2).equals("0") && d.substring(2,3).equals("0") && d.substring(3,4).equals("0"))
			g = refer(d.substring(0,1)) + "thousand" + refer(d.substring(1,2)) + "hundred and" + refer(d.substring(5,6), d.substring(6,7)) + "cent(s) only";
		
		else if (d.substring(1,2).equals("0") && d.substring(2,3).equals("0") && !d.substring(3,4).equals("0"))
			g = refer(d.substring(0,1)) + "thousand and" + refer(d.substring(3,4)) + "and" + refer(d.substring(5,6), d.substring(6,7)) + "cent(s) only";
		
		else if (d.substring(1,2).equals("0") && !d.substring(2,3).equals("0"))
			g = refer(d.substring(0,1)) + "thousand and" + refer(d.substring(2,3), d.substring(3,4)) + "and" + refer(d.substring(5,6), d.substring(6,7)) + "cent(s) only";
			
		else
			g = refer(d.substring(0,1)) + "thousand and" + refer(d.substring(5,6), d.substring(6,7)) + "cent(s) only";

		StringBuilder sb = new StringBuilder(g);
		sb.setCharAt(1, Character.toUpperCase(sb.charAt(1)));
		return sb.toString();
	}


	static String refer(String c) {
		String g = " one , two , three , four , five , six , seven , eight , nine ";
		String[] num = g.split(",");
		return num[Integer.parseInt(c) - 1];
	}


	static String refer(String c, String d) {
		String g1 = " one , two , three , four , five , six , seven , eight , nine ";
		String g2 = " twenty , thirty , forty , fifty , sixty , seventy , eighty , ninety ";
		String g3 = " ten , eleven , twelve , thirteen , fourteen , fifteen , sixteen , seventeen , eighteen , nineteen ";
		String[] num1 = g1.split(",");
		String[] num2 = g2.split(",");
		String[] num3 = g3.split(",");
		
		StringBuilder finale = new StringBuilder();
		if (Integer.parseInt(c) > 1) {
			finale.append(num2[Integer.parseInt(c) - 2]);
			if (Integer.parseInt(d) > 0)
				finale.append(num1[Integer.parseInt(d) - 1]);
		}
		else if (Integer.parseInt(c) == 0) {
			if (Integer.parseInt(d) == 0)
				finale.append(" zero ");
			else
				finale.append(num1[Integer.parseInt(d) - 1]);
		} else
			finale.append(num3[Integer.parseInt(d)]);

		return finale.toString();
	}


	static String formatAmount(String e) {
		boolean correct;
		StringBuilder d;
		do {
			d = new StringBuilder(e);
			correct = true;

			//check limit
			if (d.length() != 7)
				correct = false;
			//check for digits
			if (correct) {
				for (int i = 0; i < d.length(); i++) {
					if (!Character.isDigit(d.charAt(i)) && d.charAt(i) != '.')
						correct = false;
				}
			}
			if (!correct)
				e = JOptionPane.showInputDialog("INVALID! Checks are issued for an amount between 1000.00 and 9999.99 only. Try again");
				
		} while (!correct);

		return d.toString();
	}


	static String formatName(String e) {
		boolean correct;
		StringBuffer d;
		do {
			d = new StringBuffer(e);
			correct = true;
			//check for letters only
			for (int i = 0; i < d.length(); i++) {
				if (!Character.isLetter(d.charAt(i)) && d.charAt(i) != ' ')
					correct = false;
			}
			//capitalize first letters on each name
			if (correct) {
				d.setCharAt(0, Character.toUpperCase(d.charAt(0)));
				int i = d.indexOf(" ");
				while (i != -1) {
					d.setCharAt((i+1), Character.toUpperCase(d.charAt(i+1)));
					i = d.indexOf(" ", (i + 1));
				}
			}
			if (!correct)
				e = JOptionPane.showInputDialog("Incorrect name provided. Please try again using letters only.");
		} while (!correct);

		return d.toString();
	}


	static String formatDate(String d) {
		boolean correct;
		do {
			correct = true;
			//check date length
			if (d.length() != 10)
				correct = false;
			//check date forward slashes
			if (correct && (d.charAt(2) != '/' || d.charAt(5) != '/'))
				correct = false;
			//check correct year
			if (Integer.parseInt(d.substring(6)) < 2015 || Integer.parseInt(d.substring(6)) > 2021)
				correct = false;
			//check correct month
			if (Integer.parseInt(d.substring(0,2)) > 12 || Integer.parseInt(d.substring(0,2)) < 1)
				correct = false;
			//check correct day, assuming all months have 31 days
			if (Integer.parseInt(d.substring(3,5)) > 31 || Integer.parseInt(d.substring(3,5)) < 1)
				correct = false;
			if (!correct)
				d = JOptionPane.showInputDialog("Incorrect date provided. Please try again in the format below.\n\n(mm/dd/yyyy)");
		} while (!correct);

		return d;
	}
}
