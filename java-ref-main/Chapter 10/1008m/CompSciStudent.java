
public class CompSciStudent extends Student {

	private final int MATH_HOURS = 20;
	private final int CS_HOURS = 40;
	private final int GEN_ED_HOURS = 60;

	private int mathHours;
	private int csHours;
	private int genEdHours;

	public CompSciStudent(String n, String i, int y) {
		super(n, i, y);
	}

	public void setMathHours(int m) {
		mathHours = m;
	}

	public void setCsHours(int c) {
		csHours = c;
	}

	public void setGenEdHours(int g) {
		genEdHours = g;
	}

	@Override
	public int getRemainingHours() {
		return MATH_HOURS + CS_HOURS + GEN_ED_HOURS - mathHours - csHours - genEdHours;
	}

	@Override
	public String toString() {
		return super.toString() + "\nMajor: Computer Science\nMath Hours Taken: " + mathHours +
				"\nComputer Science Hours Taken: " + csHours + "\nGeneral Ed Hours Taken: " + genEdHours;
	}
}
