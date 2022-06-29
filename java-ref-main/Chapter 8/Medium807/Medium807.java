/* Chapter 8.7 Aggregation

	--> it occurs when an instance of a class is a field in another class, which makes sense when designing software at times
	--> in the example provided, the Course class takes an Instructor object and a TextBook object as fields
	--> making an instance of one class a field in another class is called object aggregation; aggregate - a whole made of constituent parts
	--> the Course class is an aggregate class because it is made of constituent objects
	--> a "has a" relationship is used when an instance of a class is a member of another class e.g. the course 'has an' instructor
	--> the "has a" relationship is sometimes referred to as a "whole-part relationship"
	--> aggregation is shown in a UML diagram by connecting two classes with a line that has an open diamond at one end; where the diamond
		is found closest to a third class which is the aggregate
	--> security issues can potentially arise when writing an aggregate class, where 'security holes' can unintentionally be created that
		can allow code outside the class to modify private data inside the class
	--> one way to prevent security holes is to perform deep copies when creating field objects and can be explained this way; an aggregate
		object contains references to other objects. When you make a copy of the aggregate object, also make copies of the objects it 
		references (that's a deep copy)
	--> making a copy of an aggregate object but only making a reference copy of the objects it references is called a shallow copy
	--> with String objects, a deep copy is not needed because String objects are immutable, thus its contents would never change
	--> another way to prevent security holes is to return copies of field objects, not the originals, where a method in an aggregate class
		returns a reference to a copy of a field object
	--> it's permissible to return a reference to a String object, even if the String object is a private field, because it's immutable
	--> by default, a reference variable that's an instance field is initialized to the value null, meaning it doesn't reference an object
	--> attempting to perform an operation with a null reference variable causes a program to terminate; to prevent that, if statements can
		be used to check if the fields are set to null or simply make sure all reference variables have values assigned to them

*/

public class Medium807 {

	public static void main(String[] sth) {

		Instructor myInstructor = new Instructor("DeadPool", "SpiderMan", "122-1232, NY");
		TextBook myTextBook = new TextBook("Starting out with Java", "Gaddis", "Pearson");
		Course myCourse = new Course("Intro to Java", myInstructor, myTextBook);

		System.out.println(myCourse);
	}
}
		