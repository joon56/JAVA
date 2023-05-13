
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class admin extends JFrame implements inputinfo{ 
	public JButton out = new JButton("로그 아웃");
	public JPanel adp = new JPanel();
	public JTextArea adid = new JTextArea("아이디", ID.size(), 10);
	public JTextArea adpw = new JTextArea("비밀번호", PW.size(), 10);
	public admin(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("관리자 계정");
		add(out, "South");
		add(adid, "West");
		add(adpw, "East");
		setSize(300,300);
		setVisible(true);
		for(int i = 0; i < ID.size(); i++) {
			adid.insert("\n" + ID.get(i) + "\n", i + 2);
			adpw.insert("\n" + PW.get(i) + "\n", i + 2);
		}
		out.addActionListener(new MyListener());
	}
	
	private class MyListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent r) {
			setVisible(false);
			new practice_1();
		}
	}
}