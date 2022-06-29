/*
	aka METADATA
	~ used to embed supplemental information into a source file
	~ Annotation (from java.lang.annotation package) is a super-interface of all annotations
	~ all annotations consist solely of method declarations
	~ any type of declaration can have an annotation associated with it i.e. classes, methods, fields, parameters, enum constants, even an annotation can be annotated
	~ from JDK 8, a type use can also be annotated i.e. a cast or a method return type
	~ 'MARKER annotations' are annotations with no parameters - their sole purpose is to mark an item with some attribute
	~ some general purpose annotations in java.lang.annotation include:
		@Retention	@Documented	@Target		@Inherited	@Repeatable	@Native
	~ those included in java.lang include:
		@Override	@Deprecated	@SafeVarargs	@FunctionalInterface	@SuppressWarnings
*/


import static java.lang.Math.*;
import static java.lang.System.*;

public class Annotations {
	public static void main(String[] sth) {
		int d = 200;
		d += sqrt(d);
		out.println(d + "\n" + sqrt(d));
		run();
		gen();
	}

	@Deprecated
	static void run() {
		out.println("running");
	}

	@metadata (sth = "Good evening", t = 2)
	static void gen() {
		out.println("practice");
	}
}


@interface Metadata {
	String sth();
	int t();
}

@FunctionalInteface
interface NewFormula {
	void run();
}
