

class isMemberMethod {

	public static void main(String[] sth) {
		int[] arr = { 21, 2, 4, 69, 43, 23, 22, 91, 99, 47, 53, 11, 79, 78 };
		int t = 79;
		if (isMember(t, arr.length-1, arr)) System.out.println("It's a member");
		else System.out.println("NOT MEMBER!");
	}

	static boolean isMember(int t, int pos, int... r) {
		if (pos < 0) return false;
		else if (r[pos] == t) return true;
		return isMember(t, pos-1, r);
	}
}