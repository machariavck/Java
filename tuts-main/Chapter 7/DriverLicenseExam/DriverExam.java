public class DriverExam {

	private String text = "BDAACABACDBCDADCCBDA";
	private final int QUESTIONS = 20;
	private char[] correctAnswers;
	private char[] studentAnswers;
	private String questionsMissed;
	
	public DriverExam(char[] in) {
		correctAnswers = text.toCharArray();
		studentAnswers = new char[QUESTIONS];
		questionsMissed = "";
		for (int i = 0; i < QUESTIONS; i++) {
			studentAnswers[i] = in[i];
			if (in[i] == 32)
				questionsMissed += ((i + 1) + ", ");;
		}
	}

	public boolean passed() {
		boolean pass = false;
		if (getCorrect() >= 15)
			pass = true;
		return pass;
	}

	public int getCorrect() {
		int correct = 0;
		for (int i = 0; i < QUESTIONS; i++) {
			if (studentAnswers[i] == correctAnswers[i])
				correct++;
		}
		return correct;
	}

	public int getIncorrect() {
		int incorrect = 0;
		for (int i = 0; i < QUESTIONS; i++) {
			if (studentAnswers[i] != correctAnswers[i])
				incorrect++;
		}
		return incorrect;
	}

	public String getMissed() {
		return questionsMissed;
	}
}
