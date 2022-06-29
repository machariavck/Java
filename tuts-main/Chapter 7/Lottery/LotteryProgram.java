import java.util.*;

public class LotteryProgram {
				
	public static void main(String[] sth) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nWelcome to the Lottery Console Application. Press enter to continue..");
		sc.nextLine();
		Lottery gameOn = new Lottery();
		
		System.out.println("The game has started. Enter five lucky numbers from 1 through 9 below to win BIG!!\n");
		int[] userNumbers = new int[5];
		for (int r = 0; r < userNumbers.length; r++)
			userNumbers[r] = -1;
		for (int i = 0; i < userNumbers.length; i++) {
			System.out.printf("Number %d:: ", (i + 1));
			int d = sc.nextInt();
			int index = 0;
			while (index <= i) {
				if (userNumbers[index] == d || d < 1 || d > 9) {
					System.out.println("Invalid input. Try again.");
					System.out.printf("Number %d:: ", (i + 1));
					d = sc.nextInt();
					index = 0;
				} else
					index++;
			}
			userNumbers[i] = d;
		}
		gameOn.runLottery(userNumbers);
		
		System.out.println("Press enter to see results..");
		sc.nextLine();
		System.out.println("These are the winning numbers");
		System.out.println(gameOn.getWinningNumbers());
		gameOn.ifWon();
	}
}