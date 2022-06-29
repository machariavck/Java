
import javax.swing.JOptionPane;

public class TestAverageAndGrade {
	public static void main(String[] bth) {
		String sth = "Welcome to the Average and Grade Application 2.0..\nPress OK to continue...";
		JOptionPane.showMessageDialog(null, sth);
		int score1 = 0, score2 = 0, score3 = 0, score4 = 0, score5 = 0;
		boolean status = false, innerStatus = false;
		do {
			for (int x = 1; x <= 5; x++) {
				String iU = JOptionPane.showInputDialog(String.format("Enter a valid value for score%d...", x));
				if (x <= 2) {
					if ( x == 1)
						score1 = uI(x, Integer.parseInt(iU));
					else
						score2 = uI(x, Integer.parseInt(iU));
				} else if ( x == 3 || x == 4) {
					if (x == 3)
						score3 = uI(x, Integer.parseInt(iU));
					else
						score4 = uI(x, Integer.parseInt(iU));
				} else
					score5 = uI(x, Integer.parseInt(iU));
			}
			int average = calcAverage(score1, score2, score3, score4, score5);
			String iUU = JOptionPane.showInputDialog(String.format("The average is %d. Do you want to determine the grade? Enter Yes or No...", average));
			if (iUU.charAt(0) == 'y' || iUU.charAt(0) == 'Y') {
				do {
					String gg = JOptionPane.showInputDialog("Which score do you want to test the grade? Enter score1, score2,... till score5, or even the average");
					if (gg.equalsIgnoreCase("score1"))
						JOptionPane.showMessageDialog(null, determineGrade(score1, gg));
					else if (gg.equalsIgnoreCase("score2"))
						JOptionPane.showMessageDialog(null, determineGrade(score2, gg));
					else if (gg.equalsIgnoreCase("score3"))
						JOptionPane.showMessageDialog(null, determineGrade(score3, gg));
					else if (gg.equalsIgnoreCase("score4"))
						JOptionPane.showMessageDialog(null, determineGrade(score4, gg));
					else if (gg.equalsIgnoreCase("score5"))
						JOptionPane.showMessageDialog(null, determineGrade(score5, gg));
					else if (gg.equalsIgnoreCase("average"))
						JOptionPane.showMessageDialog(null, determineGrade(average, gg));
					else {
						innerStatus = true;
						JOptionPane.showMessageDialog(null, "Invalid String input! Try again.");
					}
				} while (innerStatus);
			}
			sth = JOptionPane.showInputDialog("Do you want to try the program again?. Enter yes to continue, or no to exit...");
			if (sth.charAt(0) == 'y' || sth.charAt(0) == 'Y')
				status = true;
		} while (status);
		System.exit(0);
	}
	public static int calcAverage(int a1, int a2, int a3, int a4, int a5) {
		return (int)Math.ceil((a1 + a2 + a3 + a4 + a5) / 5.0f);
	}
	public static int uI(int m, int y) {
		while (y > 99 || y < 5) {
			String ngng = JOptionPane.showInputDialog(String.format("That's an invalid score. Enter a valid score for score%d..", m));
			y = Integer.parseInt(ngng);
		}
		return y;
	}
	public static String determineGrade(int dd, String ng) {
		String jj = "Bb";		
		if (dd >= 90)
			jj = String.format("That's an A for %s. Great. Keep the bar high!", ng);
		else if (dd >= 80)
			jj = String.format("That's a B for %s. You can do better", ng);
		else if (dd >= 70)
			jj = String.format("That's a C for %s. Averagely... I think you can guess the word.", ng);
		else if (dd >= 60)
			jj = String.format("That's a D for %s. Failure is a reason to keep going", ng);
		else
			jj = String.format("That's an F for %s. Pretty much an awful fail", ng);
		return jj;
	}
}











































