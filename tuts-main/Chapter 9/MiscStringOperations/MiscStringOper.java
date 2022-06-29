
public class MiscStringOper {

	public static void main(String[] beta) {
		String sth = "peace the keeper dog jumped over the fence";
		char[] arr = (sth.toUpperCase()).toCharArray();
		System.out.println(MiscStringOp.replaceSubstring(sth, "the", "that"));
		System.out.println("*" + MiscStringOp.mostFrequent(sth) + "*");
		System.out.println(MiscStringOp.arrayToString(arr));
		System.out.println(MiscStringOp.WordCount(sth));
	}
}