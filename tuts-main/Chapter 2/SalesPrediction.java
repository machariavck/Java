import javax.swing.JOptionPane;

public class SalesPrediction {
    public static void main(String[] bbb) {
        JOptionPane.showMessageDialog(null, "Welcome to the East Coast Division Sales Program");
        String inputValue;
        int companySales;        
        inputValue = JOptionPane.showInputDialog("How much was the company sales in dollars?");
        companySales = Integer.parseInt(inputValue);
        final float PERCENTAGE = 0.62F;
        float genValue = companySales * PERCENTAGE;
        JOptionPane.showMessageDialog(null, "This is the amount generated: $" + genValue + "!");
    }
}
