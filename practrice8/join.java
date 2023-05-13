
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class join extends JFrame implements inputinfo{  
	public JLabel l = new JLabel("ID");
	public JTextField T = new JTextField(20);
	public JLabel qq = new JLabel("(아이디 8자 이상)");
	public JLabel b = new JLabel("PW");
	public JTextField e = new JTextField(20);
	public JLabel zz = new JLabel("(대소문자 8자 이상 + 특수문자!@#$& 만 포함)");
	public JPanel z = new JPanel();
	public JButton a = new JButton("회원가입");
	public join() {
		setTitle("회원가입");
		setVisible(true);
		add(z);
		z.add(l);
		z.add(T);
		z.add(qq);
		z.add(b);
		z.add(e);
		z.add(zz);
		add(a, "South");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.addActionListener(new MyListener());
	}
	
	public class MyListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent r) {
			ID.add(T.getText());
			PW.add(e.getText());
			setVisible(false);
			new practice_1();
		}
	}
}