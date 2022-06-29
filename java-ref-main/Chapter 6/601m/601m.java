/* Chapter 6.1 Objects and Classes

	--> an object is a software component that exists in memory and serves a specific purpose in a program
	--> it has two general capabilities; store data (through fields) or perform operations (through methods)
	--> a class specifies the data an object can hold and the actions that an object can perform; it serves as a blueprint for objects
	--> primitive variables are referred to as 'primitive' since they have no built-in capabilities other than storing data
	--> an object created from a class is called an instance of the class e.g. creating an object from the Random class i.e.
					Random rand = new Random();
	--> the first part of the statement appearing on the left side of the = operator, reads Random rand. This declares a variable named rand
			which can be used to reference an object of the Random type
	--> the second part of the statement appearing on the right side of the = operator reads new Random(). The new operator creates an object in memory and returns that object's memory address. So, the expression new Random() creates an object from the Random class and returns that object's memory address
	--> the '=' operator assigns the memory address that was returned from the new operator to the rand variable

*/
