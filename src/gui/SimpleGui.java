package gui;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;
public class SimpleGui implements ActionListener {
	JButton button,button1;
	static SimpleGui gui;
	public static void main(String[] args) {
		gui = new SimpleGui();
		gui.display();
	}
	public void display() {
		JFrame frame = new JFrame();
		button = new JButton("click me");
		button1 = new JButton("click me");
		button.addActionListener(gui);
		button1.addActionListener(gui);
		
		frame.getContentPane().add(BorderLayout.EAST,button);
		frame.getContentPane().add(BorderLayout.SOUTH,button1);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent event) {
		if(event.getSource()==button) {
		button.setText("I¡¯ve been clicked!");
		System.out.print("I¡¯ve been clicked!");}
	}
}