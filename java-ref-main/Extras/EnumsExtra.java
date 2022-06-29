
//	Enumaration constants are treated as objects of their enumeration type

//	Enums cannot inherit a class or be a superclass; but can implement interfaces, have constructors, instance variables and methods

import static java.lang.System.*;

public class EnumsExtra {

	enum Transport {

		CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);

		private int speed;

		Transport (int s) {
			speed = s;
		}

		int getSpeed() {
			return speed;
		}
	}

	public static void main(String[] sth) {

		//	display speed
		out.println("Typical speed for an airplane is " + Transport.AIRPLANE.getSpeed() + " miles per hour.");

		// display all Transports and speeds
		out.println("All Transport speeds: ");
		for (Transport tp : Transport.values()) out.println(tp + " typical speed is " + tp.getSpeed() + " miles per hour.");
	}
}
