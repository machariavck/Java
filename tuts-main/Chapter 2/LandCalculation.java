import javax.swing.JOptionPane;

public class LandCalculation {
    public static void main(String[] sth) {
        final float CONVERSIONVALUE = 43560.0F;
        String inputValue;
        inputValue = JOptionPane.showInputDialog("Hello. How many square feet do you need converted?");
        int squareFeet = Integer.parseInt(inputValue);
        float numberOfAcres = squareFeet / CONVERSIONVALUE;
        JOptionPane.showMessageDialog(null, "Those square feet equal " + numberOfAcres + " acres.");
    }
}
