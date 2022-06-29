
import java.io.*;

class RecommendedStreamUsage {

	public static void main(String[] sth) throws IOException {
		usingReader();
		others();
	}

	static void usingReader(String... g) throws IOException {
		var s = new PrintWriter(System.out, true);
		/*if (g.length != 2) {
			s.println("Usage: javac Trials [filename1] [filename2]");
			return;
		}*/
		var b = new BufferedReader(new InputStreamReader(System.in));
		s.print("Enter the size of the array: ");
		int size = Integer.parseInt(b.readLine());
		var r = new int[size];
		for (int i = 0; i < size; i++) {
			s.println("Enter array value " + (i+1) + ": ");
			r[i] = Integer.parseInt(b.readLine());
		}
		s.print("\n\n\n");
		searchAlgorithms.Sort.bubbleSort(r);
		for (var v : r) s.print("{" + v + "} ");
		s.println();
	}
	
	static void others() {
		int b = 'X';
		System.out.format("%04d", b); 
	
		//Obtain a Console object by calling System.console()
		String g = new String(System.console().readPassword());
		System.out.println(g);
	}
}
