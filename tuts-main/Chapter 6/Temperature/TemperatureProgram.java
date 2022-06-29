import java.util.Scanner;

public class TemperatureProgram {

	public static void main(String[] sth) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\nProvide me with a temperature in Fahrenheit and I'll provide its conversion into Celsius and Kelvin:");
		double f = sc.nextDouble();
		Temperature ob = new Temperature(f);
		System.out.printf("\nThat temperature is equivalent to %.2f degrees Fahrenheit..", ob.getFahrenheit());
		System.out.printf("\nThat temperature is equivalent to %.2f degrees Celsius..", ob.getCelsius());
		System.out.printf("\nThat temperature is equivalent to %.2f degrees Kelvin.\n", ob.getKelvin());
		System.out.println("\nBye");
	}
}