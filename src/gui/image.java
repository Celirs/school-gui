package gui;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class image implements ActionListener {
	JFrame frame;
	JButton button;

	public static void main(String[] args) {
		image gui = new image();
		gui.go();
	}

	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("Here");
		button.addActionListener(this);
		button.addActionListener(new ColorListener());
		MyDrawPanell drawPanel = new MyDrawPanell();
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.setSize(400, 300);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent event) {
		button.setText("I¡¯ve been clicked!");
	}

	class ColorListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			frame.repaint();
		}
	} // close inner class
}

class MyDrawPanell extends JPanel {

	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {

		Image image = new ImageIcon("C:/Users/a_lei/Pictures/h.jpg").getImage();
		g.drawImage(image, 3, 4,400,300, this);


	}
}
