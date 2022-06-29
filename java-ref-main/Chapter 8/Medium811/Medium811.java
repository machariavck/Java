/* Chapter 8.11 Focus on Object-Oriented Design: Class Collaboration

	--> classes commonly interact (or collaborate) with each other to perform their operations
	--> in object-oriented applications, objects of different classes usually collaborate; where sometimes an object needs the services of another object in order to fulfill
		its responsibilities e.g. an object would want to read values from the keyboard and then write them to a file, thus would require a Scanner object and a PrintWriter
		object which are created from classes in the Java API. Objects you create from your own classes can also collaborate with each other
	--> during object-oriented design process, you determine many of the collaborations among classes by examining the responsibilities of each class. Recalling, responsibilities
		of a class are things that the class should know and actions that it should do.
	--> a popular method of discovering a class' responsibilities and collaborations is by creating CRC cards (CRC - class, responsibilities, collaborations)
	--> simple index cards can be used for this procedure where after finding the classes needed for a program, a single index card is set aside for each class. At the top of the
		index card, the class name is written. The rest of the card is then divided into two columns where the left column is used to list a class' responsibilities
	--> as each responsibility is written, determine whether collaboration is required. If required, the name of the collaborating class is written in the right column and if
		collaboration isn't required, 'none' is written or the space is left blank

*/

public class Medium811 {

	public static void main(String[] sth) {

		Stocks absa = new Stocks("ABSA", 9.27);
		StockPurchase dealOne = new StockPurchase(absa, 1000);
		
		System.out.println(dealOne);
	}
}