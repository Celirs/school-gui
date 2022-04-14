package art;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
 
public class GUi implements ActionListener{
	static JButton button;

	public static void main (String[] args) {
		GUi a=new GUi();
		JFrame frame = new JFrame();
		button = new JButton("click me!");
		button.addActionListener(a);
		frame.getContentPane().add(button);
		frame.setSize(500,500);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		button.setText("???????");
		System.out.print("hello~~`");
	}
}
