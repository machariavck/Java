
import javax.swing.JOptionPane;

public class TestScoresGrade {
	public static void main(String[] sth) {
		short score1, score2, score3, averageScore;
		String inputScore = JOptionPane.showInputDialog("Hello. Provide you chemistry score");
		score1 = Short.parseShort(inputScore);
		inputScore = JOptionPane.showInputDialog("Now provide your biology score");
		score2 = Short.parseShort(inputScore);
		inputScore = JOptionPane.showInputDialog("Lastly, you physics score");
		score3 = Short.parseShort(inputScore);
		averageScore = (short)((score1 + score2 + score3) / 3.0);
		String outputMessage;
		if (averageScore > 79 && averageScore < 101) {
			outputMessage = String.format("Your average score is %d and your grade is %s", averageScore, (averageScore > 89 ? "A. Excellent Bruv!!!": "B, Nice Work!"));
			JOptionPane.showMessageDialog(null, outputMessage);
		} else if (averageScore > 59 && averageScore < 80) {
			outputMessage = String.format("Your average score is %d and your grade is %s", averageScore, (averageScore > 69 ? "C, Good job.": "D. Do better!"));
			JOptionPane.showMessageDialog(null, outputMessage);
		} else if (averageScore < 60 && averageScore > 0) {
			outputMessage = String.format("Your average score is %d and your grade is an F. You have failed!!!!!", averageScore);
			JOptionPane.showMessageDialog(null, outputMessage);
		} else {
			JOptionPane.showMessageDialog(null, "Error. Your average score is way off the limits.");
		}
	}
}
