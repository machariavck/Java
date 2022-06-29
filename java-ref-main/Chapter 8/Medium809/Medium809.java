/* Chapter 8.9 Enumerated Types

	--> an enumerated data type consists of a set of predefined values such that the data type can be used to create variables that can hold only the values that belong to it
	--> the enum keyword is used to create your own data type and specify the values that belong to that type; the general format of an enumerated type declaration;
				enum TypeName {	One or more enum constants }
	--> an enumerated data type declaration begins with the keyword enum, followed by the name of the type, followed by a list of identifiers inside braces (named enum constants)
	--> enum constants must be legal Java identifiers and they aren't enclosed in quotation marks, therefore they aren't strings e.g.
				enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }
	--> it's not necessary to write enum constants in all uppercase letters i.e. they could be written as sunday, monday, and so forth. But since they represent constant values,
		it's standard convention to write them in all uppercase letters
	--> once the enumerated data type has been created, variables can be declared of that type e.g.
				Day workDay;
	--> workDay can only be assigned the values Day.SUNDAY, Day.MONDAY...Day.SATURDAY, any other value will result to a compile error e.g.
				Day workDay = Day.WEDNESDAY;
	--> instead of just WEDNESDAY, the assigned value is Day.WEDNESDAY; that's because it is the fully qualified name of the Day type's WEDNESDAY constant. In most cases, the
		fully qualified name of an enum constant has to be used
	--> Enumerated types are specialized classes; writing an enumerated type declaration is actually creating a special kind of a class. Moreso, the enum constants are actually
		class objects such that in the previous example, Day.SUNDAY, Day.MONDAY...Day.SATURDAY are all instances of the Day class. Assigning Day.WEDNESDAY to the workDay variable
		is actually assigning the address of the Day.WEDNESDAY object to the variable
	--> enum constants, which are actually objects, come equipped with a few methods
	--> one method is toString which returns the name of the calling enum constant as a string e.g. both statements display the string WEDNESDAY 
			System.out.println(workDay);			//recalling, the toString method is implicitly called when an object is passed to System.out.println
			System.out.println(Day.WEDNESDAY);
	--> another method is ordinal, which returns an integer value representing the constant's ordinal value (position in the enum declaration; first constant is at position 0) e.g.
			System.out.println(workDay.ordinal());
			System.out.println(Day.WEDNESDAY.ordinal());		//both statements display 3
	--> other methods include equals and compareTo; equals method accepts an object as its argument and returns true if that object is equal to the calling enum constant e.g.
			if (workDay.equals(Day.WEDNESDAY))
				System.out.println("They are the same");
	--> the compareTo method is designed to compare enum constants of the same type; it accepts an object as its argument and returns a negative integer value if the calling enum
		constant's ordinal value is less than the argument's ordinal value, zero if the calling enum constant is the same as the argument and a positive integer value if the calling
		enum constant's ordinal value is greater than the argument's ordinal value e.g.
			if (workDay.compareTo(Day.MONDAY) > 0)		// the boolean expression would return true
				System.out.println(workDay + " is greater than " + Day.Monday);
	--> one place to declare an enumerated type is inside a class; if its declared inside a class, it can't be inside a method
	--> an enumerated type declaration can also be written inside its own file, where the filename must match the name of the type; it's sensible because enumerated types are specialized
		classes e.g. the CarType.java file
	--> Java allows testing of enum constants with a switch statement; in the case statements, enumerated constants should not be written in fully qualified form, otherwise a
		compilation error will occur
	--> in the example below, the default statement is written even though the switch statement has a case for every enum constant in the CarType; this helps in the event that more
		enum constants are added to the CarType file. This type of planning is an example of "defensive programming"

*/

public class Medium809 {

	enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }

	public static void main(String[] sth) {
		
		Day workDay = Day.WEDNESDAY;


		//values() and valueOf() methods, public static
		Day[] allDays = Day.values(); //obtain an array of Day constants

		workDay = Day.valueOf("MONDAY"); // obtain the constant with the name (or string) MONDAY

		//for (Day t : allDays)
		for (Day d : Day.values())
			System.out.println((d.ordinal()+1) + ". " + d);

		
		//display using toString
		System.out.println(workDay);
		System.out.println(Day.WEDNESDAY);

		//display ordinal value
		System.out.println(Day.SUNDAY + " has the ordinal value " + Day.SUNDAY.ordinal());

		//comparing two enum constants
		if (Day.MONDAY.compareTo(Day.FRIDAY) > 0)
			System.out.println(Day.MONDAY + " is greater than " + Day.FRIDAY);
		else
			System.out.println(Day.FRIDAY + " is greater than " + Day.MONDAY);
		
		SportsCar newCar = new SportsCar(CarType.LAMBORGHINI, CarColor.BLUE, 120999);
		System.out.println(newCar);
		switch (newCar.getMake()) {
			case FORD:
					System.out.println("Your car was made in the United States");
					break;
			case PORSCHE:
					System.out.println("Your car was made in Germany");
					break;
			case FERRARI:
			case MASERATI:
					System.out.println("Your car was made in Italy");
					break;
			case BENTLEY:
			case JAGUAR:
					System.out.println("Your car was made in England");
					break;
			default:
					System.out.println("Not sure where that car was made");
		}
	}
}