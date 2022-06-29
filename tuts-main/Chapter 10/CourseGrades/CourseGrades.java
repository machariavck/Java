
public class CourseGrades implements Analyzable {

	private GradedActivity[] grades = new GradedActivity[4];
/*
	public CourseGrades(GradedActivity... g) {
		for (int i = 0; i < grades.length; i++)
			grades[i] = g[i];
	}
*/
	public void setLab(GradedActivity g) {
		grades[0] = g;
	}

	public void setPassFailExam(PassFailExam p) {
		grades[1] = p;
	}

	public void setEssay(Essay s) {
		grades[2] = s;
	}

	public void setFinalExam(FinalExam f) {
		grades[3] = f;
	}

	public double getAverage() {
		double d = 0;
		for (GradedActivity g : grades)
			d += g.getScore();
		return d / grades.length;
	}

	public GradedActivity getHighest() {
		GradedActivity g = grades[0];
		for (int i = 1; i < grades.length; i++) {
			if (grades[i].getScore() > g.getScore())
				g = grades[i];
		}
		return g;
	}

	public GradedActivity getLowest() {
		GradedActivity g = grades[0];
		for (int i = 1; i < grades.length; i++) {
			if (grades[i].getScore() < g.getScore())
				g = grades[i];
		}
		return g;
	}

	public String toString() {
		StringBuffer s = new StringBuffer();
		for (int i = 0; i < grades.length; i++)
			s.append(String.format("\n====================================\n%s\nGrade: %s\n", grades[i], grades[i].getGrade()));
		s.append("\n=====================================\n");
		s.append(String.format("Average Score: %.2f\nTest with Highest Grade: %s\nTest with Lowest Grade: %s\n", getAverage(), getHighest(), getLowest()));
		return s.toString();
	}
}
	