
public class VowCons {

	private String ob;
	private final static char[] VOWELS = { 'A', 'E', 'I', 'O', 'U' };

	public VowCons(String o) {
		ob = o;
	}

	public int returnVowels() {
		int count = 0;
		for (int i = 0; i < ob.length(); i++) {
			for (char r : VOWELS) {
				if (Character.toUpperCase(ob.charAt(i)) == r)
					count++;
			}
		}
		return count;
	}

	public int returnConsonants() {
		return ob.length() - this.returnVowels();
	}
}