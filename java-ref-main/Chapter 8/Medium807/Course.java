
public class Course {

	private String courseName;
	private Instructor instructor;
	private TextBook textBook;

	public Course(String n, Instructor i, TextBook t) {
		courseName = n;
		instructor = new Instructor(i);
		//instructor = i;	(shallow copy - creates a security hole)
		textBook = new TextBook(t);
	}

	public String getName() {
		return courseName;
	}

	public Instructor getInstructor() {
		return new Instructor(instructor);
	}

	public TextBook getTextBook() {
		return new TextBook(textBook);
	}

	public String toString() {
		return "Course Name: \n" + courseName + "\nInstructor: \n" + instructor + "\nText Book: \n" + textBook;
	}
}