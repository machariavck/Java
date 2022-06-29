
import java.util.Scanner;

public class BookClubPoints {
	public static void main(String[] sth) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to Serendipity Booksellers. How many books have you purchased this month?");
		int books = userInput.nextInt();
		if (books > 0) {
			switch (books) {
				case 0:
					System.out.println("You have zero points because you have not purchased any books");
					break;
				case 1:
					System.out.println("You have five points, as you have purchased one single book");
					break;
				case 2:
					System.out.println("You have fifteen points, as you have purchased two books");
					break;
				case 3:
					System.out.println("You have thirty points, as you have purchased three books");
					break;
				case 4:
					System.out.println("You have sixty points, as you have purchased four books");
					break;
				default:
					System.out.println("You have sixty points, as you have purchased " + books + " books");
			}
		} else {
			System.out.println("You have entered an invalid value.");
		}
	}
}
			
			
