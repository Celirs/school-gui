package inner_class;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class tow_button {

	static JButton button;
	static JFrame frame;
	static ColorListener Color =new tow_button().new ColorListener();
	static LabelButtonListener Label =new tow_button().new LabelButtonListener();

	public static void main(String[] args) {
		frame = new JFrame();
		button = new JButton("click me!");
		button.addActionListener(Label);
		frame.getContentPane().add(button);
		frame.setSize(500, 500);
		frame.setVisible(true);
	}



class ColorListener implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		frame.repaint();
	}
}

class LabelButtonListener implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		button.setText("That hurt!");
	}
}
}