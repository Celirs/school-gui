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
        text.setText("�����״α�Ϊ�ɼ�ʱ����");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		text.setText("�û���ͼ�Ӵ��ڵ�ϵͳ�˵��йرմ���ʱ����");
		System.out.println("windowClosing");

          
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		   System.out.println("windowClosed");
           text.setText("��Դ��ڵ��� dispose ������ر�ʱ����");
		   System.out.println("windowClosed");
		   System.out.println("windowClosed");
		   System.out.println("windowClosed");
		   System.out.println("windowClosed");

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowIconified");
        text.setText("���ڴ�����״̬��Ϊ��С��״̬ʱ����");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowDeiconified");
        text.setText("���ڴ���С��״̬��Ϊ����״̬ʱ����");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowActivated");
        text.setText("�� Window ����Ϊ� Window ʱ����");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		 System.out.println("windowDeactivated");
         text.setText("�� Window �����ǻ Window ʱ����");
	}


    }