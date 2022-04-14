package art;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class panel implements ActionListener{
	static JFrame frame ;
	public static void main(String[] args) {
		panel a =new panel();
		frame = new JFrame();
		JButton button = new JButton("Here!");
		button.addActionListener(a);
		MyDrawPanelll MyDraw = new MyDrawPanelll();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, MyDraw);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.setSize(500, 500);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame.repaint();
		System.out.print("hello~~`");
	}
}

class MyDrawPanelll extends JPanel {
	public void paintComponent(Graphics g) {
		Image image = new ImageIcon("C:/Users/a_lei/Pictures/h.jpg").getImage();
		g.drawImage(image, 200, 50, 500, 500,this);
		int red =(int)(Math.random()*256);
		int green =(int)(Math.random()*256);
		int blue =(int)(Math.random()*256);

		Color c =new Color(red, green, blue);
		g.setColor(c);
		g.fillRect(20, 50, 100, 100);
		g.fill3DRect(200, 200, 300, 400, true);
		g.fillOval(0, 2, 100, 100);
	}
}
