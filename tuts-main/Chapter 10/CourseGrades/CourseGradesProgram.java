
public class CourseGradesProgram {

	public static void main(String[] sth) {

		LabActivity lab = new LabActivity(21, 30);
		PassFailExam pfe = new PassFailExam(10, 6, 70);
		Essay ess = new Essay(43);
		FinalExam fe = new FinalExam(50, 21);

		CourseGrades cg = new CourseGrades();
		cg.setLab(lab);
		cg.setPassFailExam(pfe);
		cg.setEssay(ess);
		cg.setFinalExam(fe);
		
		System.out.println(cg);
	}
}