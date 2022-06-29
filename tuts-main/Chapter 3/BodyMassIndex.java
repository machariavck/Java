
import javax.swing.JOptionPane;

public class BodyMassIndex {
	public static void main(String[] sth) {
		JOptionPane.showMessageDialog(null, "Hello. This is the BMI program. We expect you to provide your weight and height values correctly. Okay?");
		String userInput = JOptionPane.showInputDialog("Nice. Now, first provide your weight. It should be in pounds.");
		int userWeight = Integer.parseInt(userInput);
		userInput = JOptionPane.showInputDialog("Good. Now provide your height in inches.");
		int userHeight = Integer.parseInt(userInput);
		float bodyMassIndex = (float)(userWeight * 703 / Math.pow(userHeight, 2));
		String finalOutput;
		if (bodyMassIndex < 18.5 || bodyMassIndex > 25) {
			finalOutput = String.format("Your BMI is %4.1f. You are %s.", bodyMassIndex, (bodyMassIndex < 18.5 ? "underweight": "grossly overweight"));
			JOptionPane.showMessageDialog(null, finalOutput);
		} else {
			finalOutput = String.format("Your BMI is %4.1f. Your sedentary lifestyle fits you as you have an optimal weight.", bodyMassIndex);
			JOptionPane.showMessageDialog(null, finalOutput);
		}	
	}
}
