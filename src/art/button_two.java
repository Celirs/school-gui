package art;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class button_two {
	static JButton button;
	static JButton button1;
	static JLabel lable;
	static JFrame frame;
	public static void main (String[] args) {
		button_two aa=new button_two();
		aa.display();
	}
	public void display() {
	frame = new JFrame();
	button = new JButton("click me!");
	button1 = new JButton("click me!");
	lable   = new JLabel("i am here");
	mydraw circle =new mydraw();
	button.addActionListener(new colorbutton());
	button1.addActionListener(new labelbutton());
	frame.getContentPane().add(BorderLayout.SOUTH,button);
	frame.getContentPane().add(BorderLayout.EAST,button1);
	frame.getContentPane().add(BorderLayout.CENTER,circle);
	frame.getContentPane().add(BorderLayout.WEST,lable);
	frame.setSize(500,500);
	frame.setVisible(true);
	}
class labelbutton implements ActionListener{//inner class
	@Override
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		lable.setText("cliked !");
	}
}
class colorbutton implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		frame.repaint();
		
	}}
}

class mydraw extends JPanel{
	public void paintComponent(Graphics g) {	
		Color c =new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));//R~0-255 G~0-255 B~0-255 
		g.setColor(c);
		g.fillOval(20, 50, 100, 100);
	}
	
}
