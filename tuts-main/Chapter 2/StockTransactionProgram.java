import javax.swing.JOptionPane;

public class StockTransactionProgram {
    public static void main(String[] sth) {
        //shares Joe purchased
            int sharesBought = 1000;
        //purchase price per share
            float bpShare = 32.87F;
        //total amount paid for the shares
            float totBpShares = sharesBought * bpShare;
        //commission paid to the stockbroker
            float buyingCommission = (float)(0.02 * totBpShares);
        //shares sold
            int sharesSold = 1000;
        //selling price of each share
            float spShare = 33.92F;
        //total amount gotten after selling shares
            float totSpShares = spShare * sharesSold;
        //amount paid to broker after selling
            float sellingCommission = 0.02F * totSpShares;
        //profit earned
            float profitEarned = totSpShares - totBpShares - buyingCommission - sellingCommission;
        JOptionPane.showMessageDialog(null, "Welcome amount of money paid for the stock is " + totBpShares + ".");
        JOptionPane.showMessageDialog(null, "Commission to the broker for buying the stock: " + buyingCommission + ".");
        JOptionPane.showMessageDialog(null, "The amount the stock was sold is " + totSpShares + ".");
        JOptionPane.showMessageDialog(null, "Commission to the broker for selling the stock: " + sellingCommission + ".");
        JOptionPane.showMessageDialog(null, "Profit earned is " + profitEarned + "!");
        System.exit(0);
    }
}
        

            
