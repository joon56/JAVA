
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class login extends JFrame{
	public JButton userout = new JButton("�α� �ƿ�");
	public JPanel userp = new JPanel();
	public login(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("�����");
		add(userout, "South");
		setSize(300,300);
		setVisible(true);
		userout.addActionListener(new MyListener());
	}
	
	private class MyListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent r) {
			setVisible(false);
			new practice_1();
			return;
		}
	}
}

