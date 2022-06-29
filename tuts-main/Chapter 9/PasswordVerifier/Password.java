
public class Password {

	private String passcode;

	public Password(String p) {
		passcode = p;
	}

	public void setPassCode(String g) {
		passcode = g;
	}

	public boolean verify() {
		boolean itsValid = true;
		//check length
		if (passcode.length() < 6)
			itsValid = false;
		
		if (itsValid) {
			//check UpperCase
			itsValid = false;
			for (int i = 0; i < passcode.length(); i++) {
				if (Character.isUpperCase(passcode.charAt(i)))
					itsValid = true;
			}
			if (itsValid) {
				//check LowerCase
				itsValid = false;
				for (int i = 0; i < passcode.length(); i++) {
					if (Character.isLowerCase(passcode.charAt(i)))
						itsValid = true;
				}
				if (itsValid) {
					//check digit
					itsValid = false;
					for (int i = 0; i < passcode.length(); i++) {
						if (Character.isDigit(passcode.charAt(i)))
							itsValid = true;
					}
				}
			}
		}
		return itsValid;
	}
}