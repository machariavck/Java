/* Chapter 8.10 Garbage Collection

	--> the JVM periodically runs a garbage collector process that removes unreferenced objects from memory
	--> in Java, fortunately, an object that's no longer needed (thus unreferenced) is destroyed automatically by the JVM's garbage collector
	--> a finalize method is called automatically just before an instance of the class is destroyed by the garbage collector; it has a void return type and accepts no arguments
	--> if you wish to execute code just before an object is destroyed, the code can be placed in the finalize method
	--> the garbage collector runs periodically, and you can't predict exactly when it will execute, thus you can't tell exactly when an object's finalize method will execute
*/

public class Medium810 {

	public static void main(String[] sth) {
		BankAccount1 acc1, acc2;
		
		acc1 = new BankAccount1();
		acc2 = acc1;
		
		acc1 = null;
		acc2 = null;
		
		//the object is no longer referenced, so its removed by the garbage collector
		
		System.out.println("Something nice");
	}
}