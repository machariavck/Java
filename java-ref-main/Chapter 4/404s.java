/* Chapter 4.4 The 'do-while' Loop

	--> this is a posttest loop since it doesn't test its BooleanExpression until it has completed an iteration; it's sort of an inverted 'while' loop
			do {
				//blockOfStatements
			} while (BooleanExpression);		(there has to be a semicolon terminating here)
	--> therefore, the 'do-while' loop always performs at least one iteration, even if the BooleanExpression is false to begin with
	--> this 'do-while' loop is usually used when one wants it to execute at least once

*/

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Simple404 {

	public static void main(String[] sth) {
		JOptionPane.showMessageDialog(null, "Hello. I'll provide you with an average if you provide me with three test scores. Okay?");
		//System.out.println("Hello. I'll provide you with an average if you provide me with three test scores.");
		String user_Input;
		//Scanner user_Input = new Scanner(System.in);
		//String sthGood;
		//char yesOrNo;
		short score1, score2, score3;
		short averageScore;
		do {				//THIS IS A USER CONTROLLED LOOP
			user_Input = JOptionPane.showInputDialog("Good. Give me the first score");
			//System.out.print("Great. Now provide me with the first score: ");
			score1 = Short.parseShort(user_Input);
			//score1 = user_Input.nextFloat();
			user_Input = JOptionPane.showInputDialog("Now give me second score");
			//System.out.print("The second score: ");
			score2 = Short.parseShort(user_Input);
			//score2 = user_Input.nextFloat();
			user_Input = JOptionPane.showInputDialog("Lastly, I want the third score");
			//System.out.print("The last score now: ");
			score3 = Short.parseShort(user_Input);
			//score3 = user_Input.nextFloat();
			averageScore = (short)((score1 + score2 + score3) / 3.0);
			user_Input = String.format("You have provided the values %d, %d and %d. So, the average is %d.\n\n", score1, score2, score3, averageScore);
			JOptionPane.showMessageDialog(null, user_Input);
			user_Input = JOptionPane.showInputDialog("Do you want to run another average test? Provide y or n for Yes or No respectively.");
			//System.out.println("Do you want to run another test? Provide yes (Y) or No (N).");
			//user_Input.nextLine();
			//sthGood = user_Input.nextLine();
			//yesOrNo = sthGood.charAt(0);
		} while ( user_Input.charAt(0) == 'y' || user_Input.charAt(0) == 'Y');
		JOptionPane.showMessageDialog(null, "Thanks for interacting with me!");
		//System.out.println("Thanks of interacting with me bro");
	}
}
