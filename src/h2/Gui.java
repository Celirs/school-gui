package h2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Gui implements ActionListener {
	static JButton button;
	
	public static void main(String[] args) {
	Gui actionListener = new Gui();
	//int aa = 12;
	JFrame frame=new JFrame();//
	button =new JButton("click me");
	/*JButton button1 =new JButton("click me!!!!");
	JButton button2 =new JButton("click me!!!!");
	JButton button3 =new JButton("click me!!!!");
	JButton button4 =new JButton("click me!!!!");*/
	button.addActionListener(actionListener);
	frame.getContentPane().add(BorderLayout.CENTER,button);
	/*frame.getContentPane().add(BorderLayout.SOUTH,button1);
	frame.getContentPane().add(BorderLayout.NORTH,button2);
	frame.getContentPane().add(BorderLayout.WEST,button3);
	frame.getContentPane().add(BorderLayout.EAST,button4);*/
	frame.setSize(600, 600);
	frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		button.setText("click me<?????????");
		System.out.print("Hello");
	}
	

}
