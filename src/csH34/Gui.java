package csH34;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Gui implements ActionListener {
	JButton button;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gui gui = new Gui();
		JFrame frame = new JFrame();
		JButton button = new JButton("<<<<<<<<<<");
		//JButton button1 = new JButton("click me");
		button.addActionListener(gui);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(button);
		//frame.getContentPane().add(button1);
		//frame.add(button,BorderLayout.SOUTH);
		//frame.add(button1,BorderLayout.NORTH);
		frame.setSize(600,600);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent event) {
		button.setText("I¡¯ve been clicked!");
	}

}
