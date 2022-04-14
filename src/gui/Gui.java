package gui;

import javax.swing.*;


public class Gui {
	public static void main (String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton("click me!");
		frame.getContentPane().add(button);
	
		frame.setSize(500,500);
		frame.setVisible(true);
	}
}
