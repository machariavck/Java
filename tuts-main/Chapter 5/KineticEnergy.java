
import javax.swing.JOptionPane;

class KineticEnergy {
	public static void main(String sth[]) {
		JOptionPane.showMessageDialog(null, "Hello Bro! WELCOME BACK. Press OK to continue..");
		String uI = JOptionPane.showInputDialog("Now, I calculate kinetic energy. So, tell me, give me your value of mass\n\n (in kgs)");
		while (Float.parseFloat(uI) <= 0 || Float.parseFloat(uI) > 2000) {
			uI = JOptionPane.showInputDialog("Wrong value!!! Please provide a correct and realistic value\n\n(not less than 1 kg or greater than 2 tonnes)");
		}
		float mass = Float.parseFloat(uI);
		uI = JOptionPane.showInputDialog("Great. Now give me the velocity of the object. It should be in metres per second.");
		while (Float.parseFloat(uI) <= 0 || Float.parseFloat(uI) > 500) {
			uI = JOptionPane.showInputDialog("Wrong value!! Do try again Mr.\n\n(not less than 1 or greater than 500 metres per second)");
		}
		float velocity = Float.parseFloat(uI);
		JOptionPane.showMessageDialog(null, String.format("Your value of kinetic energy is %,.2f joules!", kineticEnergy(mass, velocity)));
	}
	
	public static double kineticEnergy(float m, float v) {
		return m * v * v * 0.5d;
	}
}