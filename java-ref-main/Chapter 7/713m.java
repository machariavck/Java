/*	Chapter 7.13 The ArrayList Class

	--> this is a class in the Java API similar to an array and allows you to store objects but unlike an array, it's object's size automatically adjusts to accomodate
		the number of items being stored in it
	--> an ArrayList object offers many advantages over an array such as; an ArrayList object automatically expands as items are added to it and automatically shrinks
		as items are removed from it
	--> it is found in the java.util package, thus imported with the statement;		import java.util.ArrayList
	--> an ArrayList object can be created in the following format;
			ArrayList<String> nameList = new ArrayList<String>();
	--> a new ArrayList object is created and its address stored in the nameList variable. The word String written inside the angled brackets specifies the ArrayList
		holds String objects. Attempting to store any other type of object in this ArrayList would result to an error.
	--> to add items to the ArrayList object, the add method is used, where it adds an item at the last position in an ArrayList object e.g.
				nameList.add("James");		nameList.add("Catherine");
	--> when these statements execute, nameList will hold two references to String objects; the first will reference "James" and the second "Catherine"
	--> items that are stored in an ArrayList have a corresponding index, to specify the item's location in the ArrayList, much like an array subscript. The first item
		added to the ArrayList is stored at index 0, the next item is stored at index 1 and so forth i.e. "James" will be stored at index 0, "Catherine" at index 1 etc
	--> the ArrayList class has a size method that reports the number of items stored in an ArrayList, where it returns the number of items as an int e.g.
			System.out.println("The ArrayList has " + nameList.size() + " objects stored in it");	//in the example above, it returns two
	--> to return the item stored at a specific index, the ArrayList class' get method is used
	--> the ArrayList class has a toString() method that returns a string representing all of the items stored in an ArrayList object
	--> to remove an item from an ArrayList object, the remove() method is used where the item's index is passed as an argument to the method. When an item is removed
		from an ArrayList, the items that come after it are shifted downward in position to fill the empty space
	--> to insert an item at a specific index, an overloaded version of the add() method is used. When an item is added at a specific index, the items coming after it are
		shifted upward in position to accomodate the new item
	--> to replace an item at a specific index with another item, the ArrayList class' set() method can be used
	--> as previously discussed, the ArrayList object's size is the number of items stored in the ArrayList object; which increases by one if an item is added or reduces by
		one if an item is removed. An ArrayList object also has a capacity, which is the number of items it can store without having to increase its size.
	--> when an ArrayList object is first created, using the noarg constructor, it has initial capacity of 10 items; meaning it can hold up to 10 items without having to
		increase its size. When an eleventh item is added, the ArrayList object must increase its size to accomodate the new item
	--> to specify a different starting capacity, an int argument can be passed to the ArrayList constructor e.g. to have an initial capacity of 100 objects;
				ArrayList<String> list = new ArrayList<String>(100);
	--> an ArrayList can hold any type of object e.g.
				ArrayList<BankAccount> accountList = new ArrayList<BankAccount>();
	--> since Java 7, you can simplify the instantiation of an ArrayList by using the diamond operator <>. This means you're no longer required to write the data type in the
		part of the statement that calls the ArrayList constructor; instead, the set of empty angled brackets (diamond operator) is written. It causes the compiler to infer
		the required data type from the reference variable declaration e.g.
				ArrayList<InventoryItem> list = new ArrayList<>();

*/

import java.util.ArrayList;

public class Medium713 {

	public static void main(String[] sth) {
		//usingSomeSimpleMethods();
		usingBankAccountObject();
	}

	/**illustrates the add, size, get, toString, remove, set methods*/
	public static void usingSomeSimpleMethods() {
		ArrayList<String> peoplesNames = new ArrayList<String>();
		peoplesNames.add("Watch");
		peoplesNames.add("Greatness");
		peoplesNames.add("Wrapper");
		
		System.out.println(peoplesNames.toString());
		
		System.out.println("The peoplesNames array has " + peoplesNames.size() + " objects.");
		for (String i : peoplesNames)
			System.out.println(i);

		/*removing an item*/
		peoplesNames.remove(1);
		System.out.println("The item at index 1 has been removed. Here are the items now.");
		for (int i = 0; i < peoplesNames.size(); i++)
			System.out.println("Index: " + i + " Name: " + peoplesNames.get(i));

		/*inserting an item*/
		peoplesNames.add(1, "Pepperspray");
		System.out.println("Pepperspray was added at index 1. Here are the items now.");
		for (int i = 0; i < peoplesNames.size(); i++)
			System.out.println("Index: " + i + " Name: " + peoplesNames.get(i));

		/*replacing an item*/
		peoplesNames.set(2, "Jellybeans");
		System.out.println("Wrapper was replaced with Jellybeans. Here are the items now.");
		for (int i = 0; i < peoplesNames.size(); i++)
			System.out.println("Index: " + i + " Name: " + peoplesNames.get(i));
	}

	/**storing BankAccount objects in an ArrayList*/
	public static void usingBankAccountObject() {
		ArrayList<BankAccount> accounts = new ArrayList<>();
		accounts.add(new BankAccount(100));
		accounts.add(new BankAccount(500));
		accounts.add(new BankAccount(1500));
		
		for (int i = 0; i < accounts.size(); i++) {
			BankAccount account = accounts.get(i);
			System.out.println("Account at index " + i + " has balance " + account.getBalance());
		}
	}
}
