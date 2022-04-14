package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SimpleGui3C implements ActionListener {
	JFrame frame;
	JButton button;

	public static void main(String[] args) {
		SimpleGui3C gui = new SimpleGui3C();
		gui.go();
	}

	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("Here");
		MyDrawPanel drawPanel = new MyDrawPanel();
		button.addActionListener(this);
		button.addActionListener(new ColorListener());
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

class MyDrawPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		// Code to fill the oval with a random color
		// See page 347 for the code

		Image image = new ImageIcon("C:/Users/a_lei/Pictures/h.jpg").getImage();
		g.drawImage(image, 3, 4,400,300, this);

		
		int x = (int) (Math.random() * 255);
		int y = (int) (Math.random() * 255);
		int z = (int) (Math.random() * 255);
		System.out.print(x + "" + y + "" + z);
		Color c = new Color(x, y, z);
		g.setColor(c);
		g.fillOval(25, 25, 50, 50);
	}
}
