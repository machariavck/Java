/*
	> a constructor reference for an array can be created, as shown below:
			type[]::new			//	type refers to the object being created
	> any functional interface that can be used to create an array must contain a method that takes a single int parameter and returns a reference to the array of the specified size
*/


import java.util.function.*;

/*
	>> INTERFACES
*/
interface NoParam {
	MyIntNum func();
}

interface MultiParam {
	MyIntNum func(int v);
}

interface SomeTest<T> {
	boolean test(T n, T m);
}

interface Defaults {
	default int doMath(int a) {
		return a * 2;
	}
}

interface IIntPredicate {
	//	ClassName::staticMethodName
	//	objRef::methodName
	boolean test(int n);
}

interface IMyIntNumPredicate {
	//	ClassName::instanceMethodName
	//	first parameter has to match the invoking object
	//	any other parameter matches the parameter specified by the instance method
	boolean test(MyIntNum mv, int n);
}

//	Generic Interface that creates an array
interface CreateArray<T> {
	T[] func(int n);
}



/*
	>> CLASSES
*/
//	instance methods
class MyIntNum {
	private int v;

	MyIntNum (int v) { this.v = v; }
	MyIntNum () { v = 1; }

	int getNum() { return v; }

	boolean isFactor(int n) {
		return (v % n) == 0;
	}
}


//	static methods
class MyIntPredicates {

	static boolean isPrime(int n) {
		if (n < 2) return false;
		for (int i = 2; i <= n/i; i++) {
			if (n % i == 0) return false;
		}
		return true;
	}

	static boolean isEven(int n) {
		return (n % 2) == 0;
	}

	static boolean isPositive(int n) {
		return n > 0;
	}

	static <T> boolean myGenMeth(T x, T y) {
		boolean result = false;
		//	...
		return result;
	}
}

/*
	>> TESTS
*/
class MethodReferences implements Defaults {

	static boolean numTest(IIntPredicate p, int v) {
		return p.test(v);
	}

	public int doMath(int a) {
		return a * a;
	}

	public void test(int value) {
		Function<Integer,Integer> oper1 = this::doMath;
		out.println("this::doMath() = " + oper1.apply(value));

		Function<Integer,Integer> oper2 = Defaults.super::doMath;
		out.println("Defaults.super::doMath() = " + oper2.apply(value));
	}

	public static void main(String[] sth) {
		//	staticMethods();
		//	instanceMethods();
		//	classInstanceMethods();
		//	(new MethodReferences()).test(10);
		//	createArray();
		constructorMethods();
	}

	//	implement CreateArray<T>
	static void createArray() {
		CreateArray<Thread> ca = Thread[]::new;
		Thread[] thrds = ca.func(5);
	}

	static void constructorMethods() {
		NoParam s1 = MyIntNum::new;
		MultiParam s2 = MyIntNum::new;

		MyIntNum sth = s1.func();
		out.println("For NoParam: " + sth.getNum());

		sth = s2.func(3);
		out.println("For MultiParam: " + sth.getNum());
	}

	static void classInstanceMethods() {
		var p = new MyIntNum(12);
		var x = new MyIntNum(16);
		IMyIntNumPredicate inp = MyIntNum::isFactor;
		
		if (inp.test(p, 3)) out.println("3 is a factor of " + p.getNum());
		if (!inp.test(x, 3)) out.println("3 is not a factor of " + x.getNum()); 
	}


	static void instanceMethods() {
		var p = new MyIntNum(12);
		var y = new MyIntNum(16);
		IIntPredicate pI = p::isFactor;
		IIntPredicate yI = y::isFactor;

		if (pI.test(3)) System.out.println("3 is a factor of " + p.getNum());
		if (!yI.test(5)) System.out.println("5 is not a factor of " + y.getNum());
	}


	static void staticMethods() {
		SomeTest<Integer> sth = MyIntPredicates::<Integer>myGenMeth;
		if (numTest(MyIntPredicates::isPrime, 17)) out.println("17 is a prime");
		if (numTest(MyIntPredicates::isEven, 18)) out.println("18 is an even number");
		if (numTest(MyIntPredicates::isPositive, 20)) out.println("20 is a positive number");
	}
}


