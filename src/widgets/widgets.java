package widgets;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;

public class widgets implements ActionListener, MouseListener ,WindowListener{
	JButton button;
	JCheckBox CheckBox;
	static widgets gui;
	public static void main(String[] args) {
		gui = new widgets();
		gui.go();
	}
	public void go() {
		JFrame frame = new JFrame();
		CheckBox = new JCheckBox();
		button = new JButton("click me");		
		frame.getContentPane().add(BorderLayout.CENTER,button);
		frame.getContentPane().add(BorderLayout.SOUTH,CheckBox);
		button.addMouseListener(gui);
		CheckBox.addActionListener(gui);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 500);
		frame.setVisible(true);
	}			
	public void actionPerformed(ActionEvent event) {
		button.setText("I¡¯ve been clicked!");
		
	}
	public void mousePressed(MouseEvent event) {
		button.setText("I¡¯ve been !");
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


}
