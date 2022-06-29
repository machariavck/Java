import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

//layout managers

public class Layouts extends JFrame {

	private final int COMPONENTS = 4;

	private JLabel[] label;
	private JButton[] button;
	private JPanel[] panel;
	private JTextField textField;


	public Layouts() {
		setTitle("Bollocks");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setLayout(new GridLayout(2, 2));
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 7));		// x - > 10 pixels, y -> 7 pixels
		//setLayout(new BorderLayout(5, 10));	// x -> 5 pixels, y -> 10 pixels
		buildPanel();
		pack();
		setVisible(true);
	}

	void buildPanel() {
		label = new JLabel[COMPONENTS];
		button = new JButton[COMPONENTS];
		panel = new JPanel[COMPONENTS];
		
		for (int i = 0; i < COMPONENTS; i++) {
			label[i] = new JLabel("Button " + (i + 1));
			button[i] = new JButton("Button " + (i + 1));
			panel[i] = new JPanel();
			panel[i].add(label[i]);
			//panel[i].add(label[i], BorderLayout.SOUTH);
			panel[i].add(button[i]);
		}
		
		for (int i = 0; i < COMPONENTS; add(panel[i++]));
	}

	public static void main(String[] sth) {
		new Layouts();
	}
}