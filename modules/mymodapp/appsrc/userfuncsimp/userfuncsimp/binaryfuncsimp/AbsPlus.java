
package userfuncsimp.binaryfuncsimp;
import userfuncs.binaryfuncs.BinaryFunc;

public class AbsPlus implements BinaryFunc {

	public String getName() {
		return "absPlus";
	}

	public int run(int a, int b) {
		return Math.abs(a) + Math.abs(b);
	}
}