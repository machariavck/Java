/*
	NESTED CLASSES
	==============
	~ a 'nested class' is a class within another class
	~ the scope of a nested class is bounded by the scope of its enclosing class
	~ a nested class has access to members (even private) of the class in which it's nested (vice versa not true)
	~ it's also possible to declare a nested class that's local to a block
	~ a nested class that's declared directly within its enclosing class scope is a member of its enclosing class
	~ two types of nested classes exist: 'static' and 'non-static'
	~ a 'static' nested class has the static modifier applied and must access non-static members of the enclosing class through an object
	~ a 'non-static' nested class is referred to as an 'inner class'
	~ it has access to all members of its outer class and refers to them directly in the same way other non-static members of the outer class do
	~ local variables referenced from an inner class must be final or effectively final
*/

class NestedClasses {

	int x = 100;

	void run() {
		for (int i = 0; i < 3; i++) {
			int t = i;
			class In {
				void display() {
					System.out.println("x * " + t + " = " + x*t);
				}
			}
			new In().display();
		}
	}

	void test() {
		new Inside().display();
	}

	class Inner {
		void display() {
			System.out.println("x has the value " + x);
		}
	}

	static class Inside {
		void display() {
			System.out.println("x has the value " + new NestedClasses().x);
		}
	}

	public static void main(String... sth) {
		new NestedClasses().run();
	}
}