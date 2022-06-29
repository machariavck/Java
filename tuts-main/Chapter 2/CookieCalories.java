import javax.swing.JOptionPane;

public class CookieCalories {
    public static void main(String[] sth) {
        String inputVal = JOptionPane.showInputDialog("Hello friend. How many cookies have you eaten?");
        int cookies = Integer.parseInt(inputVal);
        int bag = cookies / 40;
        final int SERVINGS = bag * 10;
        final int SERVING_CALORIES = SERVINGS * 300;
        JOptionPane.showMessageDialog(null, "You have consumed " + servingCalories + " calories.");
        System.exit(0);
    }
}
