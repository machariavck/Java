import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

//creating windows

public class SimpleWindow extends JFrame {

	private final int WINDOW_WIDTH = 650;
	private final int WINDOW_HEIGHT = 400;
	private JLabel label;
	private JTextField textfield;
	private JButton button1, button2, button3, button4;
	private JPanel panel;
	private static int count = 0;


	public SimpleWindow(String s) {
		setTitle(s);
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);
	}


	public void buildPanel() {
		label = new JLabel("Welcome lad! What's your name?");
		textfield = new JTextField(10);
		panel = new JPanel();
		button1 = new JButton("Enter");
		button2 = new JButton("Quit");
		button3 = new JButton("Change Color");
		button4 = new JButton("Quit Verbosely");
		ActionListener act1 = o -> {
				JOptionPane.showMessageDialog(null, (textfield.getText()).toUpperCase());
				getContentPane().setBackground(Color.BLUE);
		 };
		ActionListener act2 = o -> {
				if (o.getSource() == button4) {
					button4.setActionCommand("You clicked button 4");
					JOptionPane.showMessageDialog(null, o.getActionCommand());
					System.exit(0);
				} else if (o.getSource() == button2)
					System.exit(0);
		};
		
		button1.addActionListener(act1);
		button2.addActionListener(act2);
		button3.addActionListener(new Act());
		button4.addActionListener(act2);
		panel.add(label);
		panel.add(textfield);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
	}


	private class Act implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			count++;
			Color b = Color.BLACK;
			Color y = Color.YELLOW;
			if (count % 2 == 0) {
				y = Color.ORANGE;
				b = Color.BLACK;
			}
			textfield.setBackground(Color.LIGHT_GRAY);
			textfield.setForeground(y);
			label.setForeground(y);
			button1.setBackground(b);
			button1.setForeground(y);
			button2.setBackground(b);
			button2.setForeground(y);
			button3.setBackground(b);
			button3.setForeground(y);
			panel.setBackground(Color.WHITE);
			panel.setForeground(y);
		}
	}


	public static void main(String[] sth) {
		new SimpleWindow("Searchings");
	}
}