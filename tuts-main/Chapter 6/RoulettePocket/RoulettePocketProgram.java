import java.util.Scanner;

public class RoulettePocketProgram {
	
	public static void main(String[] sth) {
		System.out.println("\n\nHello. Welcome to the Roulette Wheel!!");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		System.out.println("Enter a pocket number");
		int t = sc.nextInt();
		while (t < 0 || t > 36) {
			System.out.println("Error. That is not in the range! Try again.");
			System.out.println("Enter a pocket number");
			t = sc.nextInt();
		}
		RoulettePocket rp = new RoulettePocket(t);
		System.out.printf("\nPocket number %d gives pocket color %s\n", t, rp.getPocketColor());
	}
}
		