package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SimpleGui1stuff implements ActionListener{
	static JButton button_1;
	public static void main (String[] args) {
		SimpleGui1stuff aa=new SimpleGui1stuff();
		JFrame frame = new JFrame("Java Swing JPanelDemo");
		JPanel jp=new JPanel(new GridLayout(2, 2,20,30));
		JPanel jp_1=new JPanel();
		JPanel jp_2=new JPanel();

		JTextArea text=new JTextArea();
		JTextArea text_1=new JTextArea();

		JCheckBox check=new JCheckBox("choose me");
		JButton button_2 = new JButton("I¡¯ve been clicked!");
		button_1 = new JButton("Here,haha");
		JLabel lable=new JLabel("admin",JLabel.CENTER);
		JLabel lable_1=new JLabel("password",JLabel.CENTER);

		//JButton button = new JButton("click me");
		button_2.setPreferredSize(new Dimension(50,50));
		button_1.setPreferredSize(new Dimension(50,50));
		check.setPreferredSize(new Dimension(150,50));
		check.addActionListener(aa);
		text.setPreferredSize(new Dimension(100,20));
		text_1.setPreferredSize(new Dimension(100,20));

		lable.setPreferredSize(new Dimension(75,20));
		lable_1.setPreferredSize(new Dimension(75,20));

		jp.add(button_1);
		jp.add(button_2);
		jp.add(check);
		jp_1.add(lable);
		jp_1.add(text);
		jp_2.add(lable_1);
		jp_2.add(text_1);

		frame.add(jp,BorderLayout.SOUTH);
		frame.add(jp_1,BorderLayout.NORTH);
		frame.add(jp_2,BorderLayout.CENTER);


		frame.setSize(600,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		button_1.setText("click me<?????????");

	}
}