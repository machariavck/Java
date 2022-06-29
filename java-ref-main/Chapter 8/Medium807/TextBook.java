
public class TextBook {

	private String title;
	private String author;
	private String publisher;

	public TextBook(String t, String a, String p) {
		title = t;
		author = a;
		publisher = p;
	}

	public TextBook(TextBook tb) {
		title = tb.title;
		author = tb.author;
		publisher = tb.publisher;
	}

	public void set(String t, String a, String p) {
		title = t;
		author = a;
		publisher = p;
	}

	public String toString() {
		return "Title: " + title + "\nAuthor: " + author + "\nPublisher: " + publisher;
	}
}