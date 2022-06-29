import java.util.*;

public class Lottery {

	private int[] lotteryNumbers;
	private int matchedNumbers;

	public Lottery() {
		lotteryNumbers = new int[5];
		for (int gg = 0; gg < lotteryNumbers.length; gg++)
			lotteryNumbers[gg] = -1;
		matchedNumbers = 0;
		Random r = new Random();
		int d = 0;
		int index;
		for (int i = 0; i < lotteryNumbers.length; i++) {
			d = r.nextInt(9) + 1;
			index = 0;
			while (index <= i) {
				if (lotteryNumbers[index] == d) {
					d = r.nextInt(9) + 1;
					index = 0;
				} else
					index++;
			}
			lotteryNumbers[i] = d;
		}
	}

	public void runLottery(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int t = 0; t < arr.length; t++) {
				if (arr[i] == lotteryNumbers[t])
					matchedNumbers++;
			}
		}
	}

	public String getWinningNumbers() {
		String out = "";
		for (int i : lotteryNumbers)
			out += ("[" + i + "] ");
		return out;
	}

	public void ifWon() {
		if (matchedNumbers == 5)
			System.out.println("\nYOU GOT ALL LUCKY NUMBERS CORRECT. CONGRATULATIONS!!! YOU WON THE GRAND PRIZE!!!!");
		else if (matchedNumbers > 2)
			System.out.printf("\nYou got %d lucky numbers. Congratulations!!\n", matchedNumbers);
		else if (matchedNumbers > 0)
			System.out.printf("\nYou only got %d lucky number(s)!!\n", matchedNumbers);
		else
			System.out.println("\nFAILURE is not the end. Try again.");
	}
}