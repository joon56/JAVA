import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class practice_1 extends JFrame {
	
	private JButton button;
	public practice_1() {
		this.setSize(400,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);	this.setTitle("버튼 이벤트 예제");
		JPanel panel = new JPanel();
		button = new JButton("A");
		button.addActionListener(new MyListener());
		panel.add(button);
		this.add(panel);
		this.setVisible(true);
	}
	
	private class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(button.getText() == "A") {
				button.setText("B");
			}
			else {
				button.setText("A");
			}
			
		}
	}
	
	public static void main(String[] args) {
		practice_1 p = new practice_1();

	}

}
