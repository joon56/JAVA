
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
	public JButton out = new JButton("�α� �ƿ�");
	public JPanel adp = new JPanel();
	public JTextArea adid = new JTextArea("���̵�", ID.size(), 10);
	public JTextArea adpw = new JTextArea("��й�ȣ", PW.size(), 10);
	public admin(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("������ ����");
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