/*
	~ inherited static(class) methods and inherited non-static(instance) methods:
		when you write a static method with the same signature,
		the old static method is just hidden, not overridden
*/


class A {
	void display() {
		System.out.println("This is an instance method of A");
	}

	static void show() {
		System.out.println("This is a static method of A");
	}
}


class B extends A {
	@Override
	void display() {
		System.out.println("This is an instance method of B");
		show();
	}

	static void show() {
		System.out.println("This is a static method of B");
	}
}

class StaticInheritance {
	public static void main(String... sth) {
		A a = new B();
		a.display();
		a.show();
	}
}