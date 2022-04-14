package gui;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUi_Rect {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton("Here!");
		MyDrawPanelll MyDraw = new MyDrawPanelll();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(BorderLayout.CENTER, MyDraw);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}

class MyDrawPanelll extends JPanel {

	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		g.setColor(Color.orange);
		g.fillRect(20, 50, 100, 100);
	}
}