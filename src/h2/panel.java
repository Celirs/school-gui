package h2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class panel {

	static JButton button;
	static JFrame frame;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frame =new JFrame("my Frame");
		button =new JButton("my Button");
		MyDrawgraphic MyDraw= new MyDrawgraphic();
		frame.getContentPane().add(BorderLayout.CENTER, MyDraw);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.setSize(400, 600);
		frame.setVisible(true);
	}
}
class MyDrawgraphic extends JPanel {
	public void paintComponent(Graphics g) {		
		g.setColor(Color.orange);
		g.fillRect(20, 50, 100, 100);
		g.fillOval(120, 120, 50, 50);
	}
}