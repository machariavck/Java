import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;


class Trials {
	public static void main(String... sth) {
		var list = new ArrayList<String>();

		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");
		list.add("Fifth");
		list.add("fifth");

		assert list == null: "list is not null: it's " + String.valueOf(list == null);

		System.out.println("Max: " + Collections.max(list) + "\nMin: " + Collections.min(list));
		Collections.sort(list);

		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}


		System.out.println(Runtime.getRuntime().gc());
	}
}