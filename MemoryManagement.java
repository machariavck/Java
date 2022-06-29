/*

	MEMORY MANAGEMENT
	=================
	~ Although Java provides automatic garbage collection, it sometimes required to know how large the object heap is and how much of it is left
	~ these values can be obtained through the totalMemory() and freeMemory() methods
		totalMemory(): long => returns the total number of memory bytes available to the program
		freeMemory(): long => returns the approx number of bytes of free memory available to the Java run-time system
	~ Java's garbage collector runs periodically to recycle unused objects; the garbage collector can be run on demand by calling the gc() method
		gc(): void => initiates garbage collection
	~ a good thing is to call gc() and then call freeMemory() to get a baseline memory usage
	~ next, execute code and call freeMemory() again to see how much memory it is allocating

*/


class MemoryManagement {

	public static void main(String... sth) {
		var r = Runtime.getRuntime();
		var arr = new String[1000];

		System.out.println("Total available memory: " + r.totalMemory());

		System.out.println("Initial free memory available: " + r.freeMemory());

		r.gc();
		var max = r.freeMemory();
		System.out.println("Free memory after garbage collection: " + max);

		for (var i : arr) {
			i = "Something";
		}

		var min = r.freeMemory();
		System.out.println("Free memory after allocation: " + min);
		System.out.println("Memory used by allocation: " + (max - min));

		for (var i : arr) {
			i = null;
		}

		r.gc();
		System.out.println("Free memory after collecting discarded Strings: " + r.freeMemory());
	}
}