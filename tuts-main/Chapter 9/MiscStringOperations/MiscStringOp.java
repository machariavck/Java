

public class MiscStringOp {

	public static int WordCount(String o) {
		String[] r = o.split(" ");
		return r.length;
	}

	public static String arrayToString(char... r) {
		StringBuffer sb = new StringBuffer();
		for (char c : r)
			sb.append(c);
		return sb.toString();
	}

	public static char mostFrequent(String o) {
		char x = o.charAt(0);
		char[] rr = o.toCharArray();
		int[] count = new int[rr.length];
		for (int i = 0; i < rr.length; i++) {
			for (int c = 0; c < rr.length; c++) {
				if (rr[i] == rr[c])
					++count[i];
			}
		}
		int highest = count[0];
		for (int i = 0; i < count.length; i++) {
			if (count[i] > highest) {
				highest = count[i];
				x = o.charAt(i);
			}
		}
		return x;
	}

	public static String replaceSubstring(String o1, String o2, String o3) {
		StringBuilder sb = new StringBuilder(o1);
		int position = sb.indexOf(o2);
		while (position != -1) {
			sb.replace(position, (o2.length() + position), o3);
			position = sb.indexOf(o2, (position + 1));
		}
		return sb.toString();
	}
}