import javax.swing.JOptionPane;

public class SalesTax {
    public static void main(String[] sth) {
        String inputValue;
        inputValue = JOptionPane.showInputDialog("Welcome to the Sales Tax app. Please enter the purchase amount in USD.");
        float purchaseAmount = Float.parseFloat(inputValue);
        float countySalesTax = (float)(0.02 * purchaseAmount);
        float stateSalesTax = (float)(0.04 * purchaseAmount);
        float totalSalesTax = countySalesTax + stateSalesTax;
        int totalSales = (int)(Math.ceil(totalSalesTax) + Math.ceil(purchaseAmount));
        JOptionPane.showMessageDialog(null, "Here is the sales report! The purchase amount is $" +
            purchaseAmount + ". The county sales tax is $" + countySalesTax + " and the state sales tax is $" + 
            stateSalesTax + ". Your total sales tax is $" + totalSalesTax + " thus the grand total is $" +
            totalSales + "!");
        System.exit(0);
    }
}
