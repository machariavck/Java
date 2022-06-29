import java.util.*;

public class ShipProgram {

	public static void main(String[] sth) {
		Scanner sc = new Scanner(System.in);
		Ship[] ship = new Ship[4];
		String arsenal = "7-Cylinder Triple-Fire UnderWater Cannons";
		ship[0] = new CargoShip("KG-Cargo 2021", "02-2021", 4);
		ship[1] = new CruiseShip("Slim-Cruise 2021", "04-2040", 2000);
		ship[2] = new Ship("Ordinary-X 21", "05-2090");
		ship[3] = new Ship() {
				public String toString() {
					return "Battle Ship Name: " + getName() + "\nArsenal: " + arsenal;
				}
		};
		ship[3].setName("BattleCruiser 2.0 VXX");
		for (Ship s : ship)
			System.out.println("\n" + s);
	}
}