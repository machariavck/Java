
import java.util.Scanner;

public class MagicDates {
	public static void main(String[] sth) {
		Scanner inputSth = new Scanner(System.in);
		short day, month, year;
		System.out.println("Hello. Please input the date in numerals below.");
		day = inputSth.nextShort();
		System.out.println("Now please input which month is it today in numerals.");
		month = inputSth.nextShort();
		System.out.println("Now provide the year and we'll tell you if it's a magic date (just provide the last two numbers of the year).");
		year = inputSth.nextShort();
		short product = (short)(month * day);
		if (product == year)
			System.out.println("That date is magic dude!!!");
		else 
			System.out.println("Bro, that's definitely not a magic date.");
	}
}
		
