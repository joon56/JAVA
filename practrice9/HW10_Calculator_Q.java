
//---------------------------

	//1. fill in your code 8�� �κ� code �ۼ��ϱ�
	//2. ex.) 45 - 55 = -100 �� ���� �����ϱ�
	//3. �Ҽ��� operation �Ҽ��� ��� �ǵ��� �ϱ� ex.) 45.5 + 44.4

//---------------------------

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HW10_Calculator_Q extends JFrame {
	private JTextField inputSpace;
	//������ ���ڸ� ���� ���� num
	private String num = "";
	//��� ���� ��ư�� ����ϴ� ���� prev_operation
	private String prev_operation = "";
	//��� ����� �����ϱ� ���� ArrayList�� ���ڿ� ���� ��ȣ�� �ϳ��� ������ ����
	private ArrayList<String> equation = new ArrayList<String>();
	public HW10_Calculator_Q() {
		//������ ȭ��� ��ư�� ���� - �⺻ ���̾ƿ� ���
		setLayout(null);
		//������� JTextField ����
		inputSpace = new JTextField();
		//�������ɿ��� : �Ұ��� (��ư�� ���)
		inputSpace.setEditable(false);
		//���� ����
		inputSpace.setBackground(Color.WHITE);
		//������ġ ����
		inputSpace.setHorizontalAlignment(JTextField.RIGHT);
		//�۾�ü ����
		inputSpace.setFont(new Font("Arial", Font.BOLD, 50));
		//��ġ�� ũ��(x:8,y:10�� ��ġ�� 270x70�� ũ��)
		inputSpace.setBounds(8, 10, 270, 70);
		//��ư�� ���� �г�
		JPanel buttonPanel = new JPanel();
		//���̾ƿ� ���� - �������·� ��ġ���ִ� GridLayout���
		//GridLayout(4, 4, 10, 10) -> ���� ĭ��, ���� ĭ��, �¿� ����, ���� ����
		buttonPanel.setLayout(new GridLayout(6, 4, 30, 10));
		//��ġ�� ũ�� ����
		buttonPanel.setBounds(8, 90, 270, 235);
		//���� ��ư�� ���ڸ� ���ʴ�� �迭�� ����
		//���⿡ .�� �߰��Ͽ��� �迭 ����� �� �޸��Ͽ���.
		String button_names[] = { "C", "��", "��", "=", "-", "+", "7", "8", "9", "4", "5", "6", "1", "2", "3", ".", "0" };
		//��ư���� �迭 
		JButton buttons[] = new JButton[button_names.length];
		//�迭�� �̿��Ͽ� ��ư ����
		for (int i = 0; i < button_names.length; i++) {
			buttons[i] = new JButton(button_names[i]);
			//�۾�ü
			buttons[i].setFont(new Font("Arial", Font.BOLD, 20));
			//��ư�� �� ����
			if (button_names[i] == "C") buttons[i].setBackground(Color.RED);
			else if ((i >= 6) || (i > 14 && i < 16)) buttons[i].setBackground(Color.BLACK);
			else buttons[i].setBackground(Color.GRAY);
			//���ڻ� ����
			buttons[i].setForeground(Color.WHITE);
			//�׵θ� ����
			buttons[i].setBorderPainted(false);
			//�ؿ��� ���� �׼Ǹ����ʸ� ��ư�� �߰�
			buttons[i].addActionListener(new PadActionListener());
			//��ư���� ��ư�гο� �߰�
			buttonPanel.add(buttons[i]);
		}
		add(inputSpace);
		//��ư �г� �߰�
		add(buttonPanel);
		//â�� ����, ������, ���̱� ���� ���� ��������
		setTitle("����");
		setVisible(true);
		setSize(300,370);
		// 300 x 370 size�� ����
		//ȭ���� ����� ���
		setLocationRelativeTo(null);
		//���������� �Ұ���
		setResizable(false);
		//â�� ���� �� ���� ���� ���α׷��� ���� ����ǵ��� ��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}
	//�������� ��ư�� �׼� ������ ��� �߰�
	//�׼Ǹ����ʸ� ��ӽ����ְ� actionPerformed(ActionEvent e)�޼ҵ�� �̺�Ʈ ó��
	class PadActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			//� ��ư�� ���ȴ����� �˾Ƴ�
			String operation = e.getActionCommand();
			
			//C�� ������ ��� ���� ���� ������ ������
			if (operation.equals("C")) {
				inputSpace.setText("");
				
			//=�� ������ ��� ���� �Էµ� ���� ���, ��갪�� �������� ��
			} else if (operation.equals("=")) {
				//���� �޼ҵ���� �̿��Ͽ� ���, ���� ȭ�鿡 ���� �����
				String result = Double.toString(calculate(inputSpace.getText()));
				inputSpace.setText("" + result);
				num = "";
			
			
			//���� ���� ��ư�� �������� ���� ����
			} else if (operation.equals("+") || operation.equals("-") || operation.equals("��") || operation.equals("��")) {
				//ù ���� ������ �Է��� �� ����
				if (inputSpace.getText().equals("") && operation.equals("-")) {
					inputSpace.setText(inputSpace.getText() + e.getActionCommand());
					
				//������ ���� ��ư�� �����ڰ� �ƴϰ� && ���� ������ ������� ���� ���� ���ǹ�
				} else if (!inputSpace.getText().equals("") && !prev_operation.equals("+") && !prev_operation.equals("-") && !prev_operation.equals("��") && !prev_operation.equals("��")) {
					inputSpace.setText(inputSpace.getText() + e.getActionCommand());
				}
			}
			//������ ��ư�� ������ �� ���Ŀ� �߰���
			else {
				inputSpace.setText(inputSpace.getText() + e.getActionCommand());
			}
			//���������� ���� ��ư�� ���
			prev_operation = e.getActionCommand();
		}
	}
	
	private void fullTextParsing(String inputText) {
		equation.clear();
		//������ ���ڸ� �ϳ��ϳ� ���İ�
		for (int i = 0; i < inputText.length(); i++) {
			char ch = inputText.charAt(i);
			
			//�����ȣ�� ������ ArrayList�� �߰��ǰ� �ʱ�ȭ
			if (ch == '-' || ch == '+' || ch == '��' || ch == '��') {
				//�����ȣ�� ������ : ���� ���ڶ�� ���� �ǹ�
				//���ڸ� ArrayList�� �߰�
				equation.add(num);
				//num �ʱ�ȭ
				num = "";
				//�����ȣ�� ArrayList�� �߰�
				equation.add(ch + "");
			} else {
				//�������� �׳� ���� ó��
				num = num + ch;
			}
		}
		//�ݺ��� ������ �����ִ� ���ڰ� �߰�
		equation.add(num);
		//�����ڰ� ���� �� num�� ArrayList�� �߰��ϴµ�, ó���� -�� ������ ""�� �߰��Ǿ� ������ �߻���
		//�� ""�� ����
		equation.remove("");
	}
	//��� ���
	public double calculate(String inputText) {
		fullTextParsing(inputText);
		//���� �޼ҵ带 �����ϸ� ArrayList�� ���ڿ� ���� ��ȣ�� ���
		double prev = 0;
		double current = 0;
		//���� ��ȣ�� ���� ó���� ���� ����
		String mode = "";
		
		//������ �켱���� ����
		for (int i = 0; i < equation.size(); i++) {
			String s = equation.get(i);
			//�����ڰ� ���� ������ mode�� ���� ����
			if (s.equals("+")) {
				mode = "add";
			} else if (s.equals("��")) {		// �������� ���⿡ elseif -�϶��� ������ �̷��� �Ǹ� ������ �� �� �� ���Ǳ� ������ ����		
				mode = "mul";
			} else if (s.equals("��")) {
				mode = "div";
			} else {
				//���� �ִ� �����ڰ� ���� Ȥ�� �������̰� ���� �ε����� ���� ������ �� ���� ����
				if ((mode.equals("mul") || mode.equals("div")) && !s.equals("+") && !s.equals("-") && !s.equals("��") && !s.equals("��")) {
					Double one = Double.parseDouble(equation.get(i - 2));
					Double two = Double.parseDouble(equation.get(i));
					Double result = 0.0;
					
					//mode�� ���� ���
					if (mode.equals("mul")) {
						result = one * two;
						
				
					} else if (mode.equals("div")) {
						result = one / two;
						
				
					}
					//result���� ArrayList�� �߰�
					equation.add(i + 1, Double.toString(result));
					
					for (int j = 0; j < 3; j++) {
						equation.remove(i - 2);
					}
					//���� ��� 3 + 5 x 6����  3 + 30�� �Ǿ����Ƿ� �ε����� 2��ŭ �ǵ��ư�
					i -= 2;	// ������� ���� �ε����� �̵�
				}
			}
		}	// ���� �������� ���� ����Ѵ�
		
		//+�ϰ�� add, -�ϰ�� sub
		for (String s : equation) {
			if (s.equals("+")) {
				mode = "add";
			} else if (s.equals("-")) {
				mode = "sub";
			
			//����, ������ ���� ������
			}  else {
				//������ ��� ���ڿ��� Double�� ����ȯ
				current = Double.parseDouble(s);
				
				//mode���� ���� ó��, prev�� ��� ��갪�� ���ŵ�
				if (mode.equals("add")) {
					prev += current;
			
				} 
				else if (mode.equals("sub")) {
					prev -= current;		
				} 
				else {
					prev = current;
				}
			}
			//�Ҽ��� ������ ° �ڸ����� �ݿø� -> ȭ�� ǥ�� ������ �ֱ⶧��
			prev = Math.round(prev * 100000) / 100000.0;
	
		}
		//�� ��ȯ
		return prev;
	}
	
	public static void main(String[] args) {
		new HW10_Calculator_Q();
	}
}