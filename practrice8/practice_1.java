
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class practice_1 extends JFrame implements inputinfo{
	public JButton in = new JButton("로그인");
	public JButton regi = new JButton("회원가입");  
	public JLabel id = new JLabel("아이디");
	public JTextField idf = new JTextField(20);
	public JLabel pw = new JLabel("비밀번호");
	public JTextField pwf = new JTextField(20);
	public JPanel p = new JPanel();
		public practice_1() {
		setTitle("로그인 프로그램");
		p.add(id);
		p.add(idf);
		p.add(pw);
		p.add(pwf);
		p.add(in);
		p.add(regi);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(p);
		setSize(300,300);
		setVisible(true);
		in.addActionListener(new MyListener());
		regi.addActionListener(new MyListener_2());
	}
		public class MyListener implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent r) {
				// TODO Auto-generated method stub
				String id = idf.getText();
				String pw = pwf.getText();
				if((id.equals("admin"))&&(pw.equals("Abcd123!"))) {
					JOptionPane.showMessageDialog(null, "관리자계정으로 로그인되었습니다.", "alert", JOptionPane.DEFAULT_OPTION);
					new admin();
					setVisible(false);
					return;
				}
				for(int i = 0; i < ID.size(); i++) {
				if((id.equals(ID.get(i)))&&(pw.equals(PW.get(i)))) {
					JOptionPane.showMessageDialog(null, "로그인되었습니다.", "alert", JOptionPane.DEFAULT_OPTION);
					new login();
					setVisible(false);
					return;
				}
			}
				JOptionPane.showMessageDialog(null, "아이디 혹은 비밀번호가 올바르지 않습니다.", "alert", JOptionPane.DEFAULT_OPTION);
				return;
			}
		}
		public class MyListener_2 implements ActionListener{
				@Override
				public void actionPerformed(ActionEvent r) {
					setVisible(false);
					new join();
				}
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new practice_1();
	}

}
