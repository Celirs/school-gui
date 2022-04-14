package csH34;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class widgets implements ActionListener{
	static JFrame frame;
	public static void main(String[] args) {
		
		widgets myactionlistener =new widgets();
		frame = new JFrame();

		JButton button = new JButton("Yes!");
		JButton button1 = new JButton("No!");
		JButton button2 = new JButton("No!");
		button.setPreferredSize(new Dimension(120,20));

		button1.setPreferredSize(new Dimension(120,20));
		JPanel mypanel = new JPanel(new GridLayout(1, 3,20,30));
		//mypanel.setLayout(null);
		mypanel.add(button);
		mypanel.add(button1);
		mypanel.add(button2);
		MyDrawPanelll MyDraw = new MyDrawPanelll();
		button.addActionListener(myactionlistener);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, MyDraw);
		//frame.getContentPane().add(BorderLayout.NORTH, button);

		frame.getContentPane().add(BorderLayout.SOUTH, mypanel);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame.repaint();
	}
}

class MyDrawPanelll extends JPanel {
	public void paintComponent(Graphics g) {
		Image image = new ImageIcon("C:/Users/a_lei/Pictures/h.jpg").getImage();
		g.drawImage(image, 0, 0,400,300, this);
		int R = (int) (Math.random()*256);
		int G = (int) (Math.random()*256);
		int B = (int) (Math.random()*256);

		Color c =new Color(R,G,B);
		g.setColor(c);
		g.fillRect(20, 50, 100, 100);
		g.drawLine(125, 50, 100, 200);
	}
}
