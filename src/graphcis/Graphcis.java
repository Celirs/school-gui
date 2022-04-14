package graphcis;
import java.awt.*;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Graphcis implements ActionListener{
	JButton button ;//
	JFrame frame;//
	
	public static void main(String[] args) {
		
		Graphcis gui = new Graphcis();
		gui.display();
	}
	
	public void display() {
		
		frame = new JFrame();
		button = new JButton("click me");
		button.addActionListener(this);
		frame.add(BorderLayout.SOUTH,button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyDrawPanell drawPanel = new MyDrawPanell();
		frame.add(BorderLayout.CENTER, drawPanel);

		frame.setSize(600, 300);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent event) {
		frame.repaint();
		button.setText("I¡¯ve been clicked!");
		System.out.print("I¡¯ve been clicked!");
	}
	
	class MyDrawPanell extends JPanel {

		public void paintComponent(Graphics g) {

			Image image = new ImageIcon("C:/Users/a_lei/Pictures/h.jpg").getImage();
			g.drawImage(image, 3, 4,400,300, this);
			g.drawLine(20, 120, 600, 120);

			Graphics2D g2d = (Graphics2D) g;
			
			int red = (int) (Math.random() * 255);
			int green = (int) (Math.random() * 255);
			int blue = (int) (Math.random() * 255);
			Color startColor = new Color(red, green, blue);
			
			red = (int) (Math.random() * 255);
			green = (int) (Math.random() * 255);
			blue = (int) (Math.random() * 255);
			Color endColor = new Color(red, green, blue);
			
			GradientPaint gradient = new GradientPaint(70,70,startColor, 150,150, endColor);
			g2d.setPaint(gradient);
			g2d.fillOval(70,70,100,100);
			//g2d.draw3DRect(blue, red, green, blue, getFocusTraversalKeysEnabled());
		}
	}

}
