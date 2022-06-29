
import java.util.*;
import javax.swing.JOptionPane;

public class SlotMachineSimulation {
	public static void main(String[] sth) {
		JOptionPane.showMessageDialog(null, "Welcome to the Console Slot-Machine Game v1.0...Press OK to start playing");
		String uI;
		Random rM = new Random();
		int moneyStaked, choice, c1 = 0, c2 = 0, c3 = 0, totalMoneyStaked = 0, totalEarnings = 0, newEarnings = 0;
		char response;
		do {
			uI = JOptionPane.showInputDialog("Great. How much do you want to stake? You can stake as much as you want, but gamble RESPONSIBLY");
			moneyStaked = Integer.parseInt(uI);
			totalMoneyStaked += moneyStaked;
			JOptionPane.showMessageDialog(null, "Nice. Press OK to ruffle the six sweet fruits; cherries, oranges, plums, bells, melons and bars.");
			for (int count = 1; count <= 3; count++) {
				choice = rM.nextInt(6);
				if (choice == 0 || choice == 1)
					uI = (choice == 0 ? "Cherries":"Oranges");
				else if (choice == 2 || choice == 3)
					uI = (choice == 2 ? "Plums":"Bells");
				else if (choice == 4 || choice == 5)
					uI = (choice == 4 ? "Melons":"Bars");
				JOptionPane.showMessageDialog(null, "Ruffle " + count + " has the fruit " + uI + ". Press OK to continue");
				if (count == 1)
					c1 = choice;
				else if (count == 2)
					c2 = choice;
				else if (count == 3)
					c3 = choice;
			}
			if (c1 == c2 && c2 == c3 ) {
				newEarnings = moneyStaked * 3;
				JOptionPane.showMessageDialog(null, String.format("CONGRATULATIONS!! YOU HAVE WON BIG!!! YOUR EARNINGS ARE %d!", newEarnings));
				uI = JOptionPane.showInputDialog("DO YOU WISH TO PLAY AGAIN OUTSTANDING WINNER??? Type yes or no to proceed");
				response = uI.charAt(0);
			} else if (c1 == c2 || c2 == c3 || c1 == c3) {
				newEarnings = moneyStaked * 2;
				JOptionPane.showMessageDialog(null, String.format("Congratulations. You have won double your stake. Your earnings are %d!", newEarnings));
				uI = JOptionPane.showInputDialog("Do you wish to play again winner? Type yes or no to proceed");
				response = uI.charAt(0);
			} else {
				uI = JOptionPane.showInputDialog(null, "Sorry. You have not won anything. Please try again, type yes to continue or no to exit");
				response = uI.charAt(0);
			}
			totalEarnings += newEarnings;
		} while (response == 'y' || response == 'Y');
		JOptionPane.showMessageDialog(null, "You have gambled a total of " + totalMoneyStaked + " and have earned a total of " + totalEarnings + "!!");
		JOptionPane.showMessageDialog(null, "I hope you had fun :) Else, Goodbye");
		System.exit(0);
	}
}
