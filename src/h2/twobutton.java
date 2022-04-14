package h2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class twobutton {
	int a = 12;
	JButton button;
	JButton button1;
	JLabel label;
	JFrame frame;

	public static void main(String[] args) {
		twobutton gui = new twobutton();
		gui.display();
	}

	public void display() {
		frame = new JFrame();
		label = new JLabel("HERE");
		button = new JButton("change circle");
		button1 = new JButton("change label");
		MyDrawPanell drawPanel = new MyDrawPanell();
		button.addActionListener(new ColorButtonListener());
		button1.addActionListener(new LabelButtonListener());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.EAST, button1);
		frame.getContentPane().add(BorderLayout.WEST, label);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	class ColorButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			frame.repaint();
		}
	}

}
//inner class

class LabelButtonListener implements ActionListener {
	twobutton gui = new twobutton();

	public void actionPerformed(ActionEvent event) {
		gui.label.setText("That hurt!");
	}
}

class MyDrawPanell extends JPanel {

	public void paintComponent(Graphics g) {

		Image image = new ImageIcon("C:/Users/a_lei/Pictures/h.jpg").getImage();
		g.drawImage(image, 3, 4, 400, 300, this);

		Graphics2D g2d = (Graphics2D) g;

		int red = (int) (Math.random() * 255);
		int green = (int) (Math.random() * 255);
		int blue = (int) (Math.random() * 255);
		Color startColor = new Color(red, green, blue);

		red = (int) (Math.random() * 255);
		green = (int) (Math.random() * 255);
		blue = (int) (Math.random() * 255);
		Color endColor = new Color(red, green, blue);

		GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
		g2d.setPaint(gradient);
		g2d.fillOval(70, 70, 100, 100);
		// g2d.draw3DRect(blue, red, green, blue, getFocusTraversalKeysEnabled());
	}
}
