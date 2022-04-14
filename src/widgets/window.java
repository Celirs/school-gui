package widgets;



import java.awt.TextArea;
import java.awt.event.*;

import javax.swing.*;

public class window implements WindowListener {
    TextArea text;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	window win =new window();
    	win.go();
    }
    public void go() {
    	text=new TextArea();
        JFrame frame = new JFrame();
        frame.add(text);
        frame.setTitle("Closing Frame with Window Listener");
        frame.setSize(300, 300);
        frame.addWindowListener(this);
        frame.setVisible(true);
	}      
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowOpened");
        text.setText("窗口首次变为可见时调用");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		text.setText("用户试图从窗口的系统菜单中关闭窗口时调用");
		System.out.println("windowClosing");

          
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		   System.out.println("windowClosed");
           text.setText("因对窗口调用 dispose 而将其关闭时调用");
		   System.out.println("windowClosed");
		   System.out.println("windowClosed");
		   System.out.println("windowClosed");
		   System.out.println("windowClosed");

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowIconified");
        text.setText("窗口从正常状态变为最小化状态时调用");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowDeiconified");
        text.setText("窗口从最小化状态变为正常状态时调用");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowActivated");
        text.setText("将 Window 设置为活动 Window 时调用");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		 System.out.println("windowDeactivated");
         text.setText("当 Window 不再是活动 Window 时调用");
	}


    }