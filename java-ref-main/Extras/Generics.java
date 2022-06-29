/*
	GENERICS

	> Generics operate on a type parameter; used to create classes, interfaces and methods
	> Object references don't have type safety and therefore need casts
	> Generics only work with reference types
	> More than one parameter can be used in a generic type
	> The general form of a generic class can be shown in the syntax below;
		class-name<type-arg-list> var-name = new class-name<type-arg-list>(cons-arg-list);
	> All numeric classes are subclasses of Number thus have the methods; doubleValue(), intValue()
	> Creating an upper bound can be accomplished like this:
		<T extends 'superclass'> 		where T can be replaced only by superclass or subclasses of superclass
	> A wildcard argument ? represents an unknown type and it simply matches any valid object of the invoking class
	> The wildcard does not affect what type of objects can be created
	> Wildcard arguments can also be bounded similar to how type parameters can be bounded i.e.
		<? extends 'superclass'>
		<? super 'subclass'> 		for subclass or superclasses to subclass (it's similarly inclusive)
	> Casting one instance of a generic class into another is possible if they're compatible and have similar type arguments
	> Syntax for a generic method:		<type-param-list> ret-type meth-name(param-list) { //...
	> Generic interfaces are specified just like generic classes
	> any class implementing a generic interface must itself be generic, at least to the extent it takes a type parameter
		that is passed to the interface
 	> if a class implements a specific type of generic interface, then the implementing class doesn't need to be generic
	> type parameter(s) specified by a generic interface can be bounded as well i.e.
		interface Containment<T extends Number> { ...
	> any implementing class must also specify the type argument having the same bound i.e.
		class GenericMethods<T extends Number> implements Containment<T> { ...
	> there's no need to specify the bound again in the implements clause; in fact, it would cause an error
	> 'raw types' are allowed to enable pre-generics legacy code be compatible with a generic class
	> when raw types are created, the type is replaced by Object and thus type safety is lost
	> javac dispays unchecked warnings when a raw type is used in a way that compromises type safety
	> type inference can be done with the diamond operator i.e.
		TwoGen<Integer, String> obj = new TwoGen<>(42, "testing");
	> local variable type inference is also used i.e.
		var obj = new TwoGen<Integer, String>(42, "testing");
	> compatibility of generics with preexisting nongeneric code is enabled through the use of 'erasure'; as explained below
	> after compiling, all generic type information is removed; type parameters are replaced with their bound type (which
		 is Object if no explicit bound is specified) and then applying appropriate casts to maintain type compatibility
	> Ambiguity errors occur when erasure causes two seemingly distinct generic declarations to resolve to the same erased
		type thus causing a conflict e.g. using two similar methods that attempt to overload when types are the same
	> Some generic restrictions apply to creating objects of a type parameter, static members, exceptions and arrays
	> Type parameters cannot be instantiated
	> No static member can use a type parameter declared by the enclosing class
	> An array can't be instantiated whose element type is a type parameter
	> An array cannot be created of type-specific generic references
		e.g. Gen<Integer> gens[] = new Gen<Integer>[20] 	// IS WRONG
			Gen<?> gens[] = new Gen<?>[10] 	//IS OK
	> A generic class cannot extend Throwable; cannot create generic exception classes
	> to extend a class and multiple interfaces, it can be done like this:
		class Containment<T extends ClassT & Comparable<? super T>>
	> a class name occurs before the interfaces, and only one class can be listed

*/

//	Generic Interface
interface Containment<T> {
	boolean contains(T ob);
}


//	Generic Class
class Gen<T> {

	T ob;

	Gen(T ob) {
		this.ob = ob;
	}

	String getName() {
		return ob.getClass().getName();
	}
}


//	class Generics<T> implements Containment<T> {
class Generics implements Containment<Double> {

	private int num;

	//	Generic Constructor:
	private <T extends Number> Generics(T ob) {
		num = ob.intValue() * 2;
	}

	//	factory method
	public static <T extends Number, E extends T> Generics getSumOfTwoObjects(T ob1, E ob2) {
		return new Generics(ob1.intValue() + ob2.intValue());
	}

	int getDouble() {
		return (int)num;
	}
	
	//	Comparable is an interface in java.lang and a class implementing Comparable defines objects that can be ordered
	static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] x, V[] y) {
		
		if (x.length != y.length) return false;

		for (int i = 0; i < x.length; i++)
			if (!x[i].equals(y[i])) return false;
		return true;
	}

	//	implemented method of Containment<T>
	public boolean contains(Double d) {
		System.out.println("I have the double value " + d);
		return true;
	}


	public static void main(String[] sth) {

		var v = new Generics(28);
		System.out.println(v.contains(29.2));

		Gen<String> book = new Gen<String>("Victor's Book");
		System.out.println("The book's name is of type " + book.getName());

		var g = getSumOfTwoObjects(28, 22);
		System.out.println("Executing factory method. Double value is " + g.getDouble());

		Integer[] nums = { 1,2,3,4,5 };
		Integer[] nums2 = { 1,2,3,4,5 };
		Integer[] nums3 = { 1,2,3,6,4};

		if (arraysEqual(nums,nums2)) System.out.println("nums and nums2 are equal");
		if (!arraysEqual(nums,nums3)) System.out.println("nums and nums3 are not equal");
	}
}
