import java.util.Scanner;

public class FaBPointsProgram {
	public static void main(String[] alpha) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\nEnter a temperature and I'll tell which will boil at that temperature and those that would freeze at that temperature.");
		int t = sc.nextInt();
		FaBPoints matter = new FaBPoints(t);
		if (matter.isEthylFreezing())
			System.out.printf("\n\nEthyl will freeze below %d degrees Fahrenheit as its freezing point is -173 degrees Fahrenheit", matter.getTemperature());
		if (matter.isEthylBoiling())
			System.out.printf("\n\nEthyl will boil above %d degrees Fahrenheit as its boiling point is 172 degrees Fahrenheit", matter.getTemperature());
		if (matter.isOxygenFreezing())
			System.out.printf("\n\nOxygen will freeze below %d degrees Fahrenheit as its freezing point is -362 degrees Fahrenheit", matter.getTemperature());
		if (matter.isOxygenBoiling())
			System.out.printf("\n\nOxygen will boil above %d degrees Fahrenheit as its boiling point is -306 degrees Fahrenheit", matter.getTemperature());
		if (matter.isWaterFreezing())
			System.out.printf("\n\nWater will freeze below %d degrees Fahrenheit as its freezing point is 32 degrees Fahrenheit", matter.getTemperature());
		if (matter.isWaterBoiling())
			System.out.printf("\n\nWater will boil above %d degrees Fahrenheit as its boiling point is 212 degrees Fahrenheit", matter.getTemperature());
		System.out.println("\n\nThat was fun!");
	}
}