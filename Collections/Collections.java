/*
	COLLECTIONS FRAMEWORK
	=====================
	~ some interfaces defined by java.util:
		+ Map(.Entry)	+ SortedMap		+ NavigableMap
		+ Set			+ SortedSet		+ NavigableSet
		+ Collection	+ Comparator	+ EventListener		+ Enumeration		+ Formattable
		+ Deque			+ Queue			+ List				+ RandomAccess		+ ServiceLoader.Provider
		+ Iterator	+ ListIterator	+ PrimitiveIterator(.OfDouble, .OfLong, .OfInt)	+ Spliterator(.OfPrimitive, ...)
	~ the interfaces that underpin collections are:
		> Collection - enables one to work with group of objects; it's at the top of the collections hierarchy
			> List - extends Collection to handle sequences (lists of objects)
			> Queue - extends Collection to handle special types of lists in which elements are removed only from the head
				> Deque - extends Queue to handle a double-ended queue
			> Set - extends Collection to handle sets, which must contain unique elements
				> SortedSet - extends Set to handle sorted sets
					> NavigableSet - extends SortedSet to handle retrieval of elements based on closest-match searches
	~ 

*/


import java.util.List;
import java.util.ArrayList;

class Collections {

	public static void main(String... sth) {
		var arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(3);
		var r = List.of(arr);

		System.out.println();

	}
}