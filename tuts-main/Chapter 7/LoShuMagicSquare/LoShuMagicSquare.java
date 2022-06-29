import java.util.*;


public class LoShuMagicSquare {

	public static void main(String[] sth) {
		System.out.println("\n\nWelcome to the magic square. Here it is.");
		int[][] arr = new int[3][3];
		Scanner sc = new Scanner(System.in);
		int d = 0;
		System.out.println("Enter the values of the array and I'll tell if it's a Lo Shu Magic Square");
		for (int r = 0; r < 3; r++) {
			System.out.println("Row " + (r + 1));
			System.out.println("*******");
			for (int c = 0; c < 3; c++) {
				System.out.printf("Column %d: ", (c + 1));
				d = sc.nextInt();
				while ( d > 9 || d < 0 || d == arr[0][0] || d == arr[0][1] || d == arr[0][2] || d == arr[1][0] || d == arr[1][1] || d == arr[1][2] || d == arr[2][0] || d == arr[2][1] || d == arr[2][2]) {	
					System.out.println("Invalid value. Enter again");
					System.out.printf("Column %d: ", (c + 1));
					d = sc.nextInt();
				}
				arr[r][c] = d;
			}
			System.out.println();
		}
		if (acceptArr(arr))
			System.out.println("That's a Lo Shu Magic Square");
		else
			System.out.println("That isn't a Lo Shu Magic Square");
		
	}

	public static boolean acceptArr(int[][] r) {
		int diag = r[0][0] + r[1][1] + r[2][2];
		int row = r[1][0] + r[1][1] + r[1][2];
		int col = r[0][2] + r[1][2] + r[2][2];
		boolean isMagical = false;
		if (diag == 15 && row == 15 && col == 15)
			isMagical = true;
		return isMagical;
	}
}