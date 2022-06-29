import javax.swing.*;


public class MorseCodeConverter {

	public static void main(String[] sth) {

		String in = JOptionPane.showInputDialog("Welcome to the Morse Code Converter\n\nEnter a statement or character I convert to Morse Code");
		JOptionPane.showMessageDialog(null, "Here is your statement in Morse Code\n\n" + toMorseCode(in));
		System.exit(0);
	}


	public static String toMorseCode(String g) {
		String n = g.toUpperCase();
		String referenceChars = ",.?0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] rc = referenceChars.toCharArray();
		String morseCode = "--..-- .-.-.- ..--.. ----- .---- ..--- ...-- ....- ..... -.... --... ---.. ----. .- -... -.-. -.. . ..-. --. .... " +
							".. .--- -.- .-.. -- -. --- .--. --.- .-. ... - ..- ...- .-- -..- -.-- --..";
		String[] mc = morseCode.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n.length(); i++) {
			for (int t = 0; t < rc.length; t++) {
				if (n.charAt(i) == ' ') {
					sb.append(" ");
					t = rc.length;
				} else if (n.charAt(i) == rc[t]) {
					sb.append(mc[t]);
					t = rc.length;
				}
				
			}
		}
		return sb.toString();
	}
}
