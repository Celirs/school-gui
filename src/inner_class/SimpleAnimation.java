package inner_class;

import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {
	int x = 70;
	int y = 70;
	static JFrame f = new JFrame("My First Music Video");
	public static void main(String[] args) {
		SimpleAnimation gui = new SimpleAnimation();
		gui.go();
	}

	public void go() {
		f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyDrawPanel drawPanel = new MyDrawPanel();
		f.getContentPane().add(drawPanel);
		f.setSize(300, 300);
		f.setVisible(true);
		for (int i = 0; i < 130; i++) {
			x++;
			y++;
			f.repaint();
			try {
				Thread.sleep(50);
			} catch (Exception ex) {
			}
		}
	}// close go() method

	class MyDrawPanel extends JPanel {
		public void paintComponent(Graphics g) {
			//g.setColor(Color.white);
			//g.fillRect(0,0,300, 300);
			//System.out.print(this.getWidth()+""+this.getHeight());
			g.setColor(Color.green);
			g.fillOval(x, y, 40, 40);
		}
	} // close inner class
} // close outer class