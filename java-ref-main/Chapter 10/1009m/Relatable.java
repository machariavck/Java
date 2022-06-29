
public interface Relatable {

	int FIELD1 = 20;
	boolean equals(GradedActivity g);
	boolean isGreater(GradedActivity g);
	boolean isLess(GradedActivity g);

	default void display() {
		System.out.println("This is the default display method");
	}
}