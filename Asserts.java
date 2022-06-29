/*
	ASSERT
	======
	~ "Assertion" - a condition expected to be true during the execution of the program
	~ the 'assert' keyword is used during program development to create an assertion
	~ at run time, if the condition actually is true, no other action takes place
	~ however, if the condition is false, then a default AssertionError object is thrown
	~ assertions are often used during testing to verify that some expected condition is actually met
	~ they are not usually used for released code
			assert { some condition };
	~ condition is an expression that must evaluate to a Boolean result e.g. assert n > 0;
	~ if n <= 0, an AssertionError is thrown
			assert { condition } : { expression };
	~ in this form, expression is a value passed to the AssertionError constructor
	~ 'expression' is any non-void expression that defines a reasonable string conversion
	~ to enable assertion checking at run time, the "-ea" option is specified e.g. java -ea SampleProgram
	~ released code is run with assertions disabled and any assertions present won't be evaluated

*/