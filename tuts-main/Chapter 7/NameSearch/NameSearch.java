import java.util.*;
import java.io.*;

public class NameSearch {

	public static void main(String[] sth) throws IOException {
		//create girls names array
		File ofg = new File("GirlNames.txt");
		Scanner scg = new Scanner(ofg);
		ArrayList<String> girls = new ArrayList<>(200);
		while (scg.hasNext())
			girls.add(scg.nextLine());
		scg.close();
		//create boys names array
		File ofb = new File("BoyNames.txt");
		Scanner scb = new Scanner(ofb);
		String[] boys = new String[200];
		int i = 0;
		while (scb.hasNext() && i < boys.length) {
			boys[i] = scb.nextLine();
			i++;
		}
		scb.close();
		//run program
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter a name and I'll tell if its among the most popular");
		String g = sc.nextLine();
		boolean notFound = true;
		int index = 0;
		while (notFound && index < 200) {
			if (g.equalsIgnoreCase(girls.get(index))) {
				notFound = false;
				System.out.println("That is a girl's name. It is in element number " + index + ".");
			} else if (g.equalsIgnoreCase(boys[index])) {
				notFound = false;
				System.out.println("That's a boy's name. It is in element number " + index + ".");
			}
			index++;
		}
		if (notFound)
			System.out.println("That name isn't present.");
	}
}