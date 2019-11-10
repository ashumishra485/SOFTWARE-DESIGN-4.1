package testGUI1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class Test {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	//private JCheckBox checkBox1;
	JCheckBox checkBox1 = new JCheckBox("New check box");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test window = new Test();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel value1_1 = new JLabel("Value 1 ");
		value1_1.setBounds(99, 55, 46, 14);
		frame.getContentPane().add(value1_1);
		
		JLabel value2_1 = new JLabel("Value 2");
		value2_1.setBounds(99, 95, 46, 14);
		frame.getContentPane().add(value2_1);
		
		textField1 = new JTextField();
		textField1.setBounds(229, 52, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(229, 92, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int value1 = Integer.parseInt(textField1.getText());
				int value2 = Integer.parseInt(textField2.getText());
				int result = value1 + value2 ;
				textField3.setText(""+ result);
				
				if (result > 10)checkBox1.setSelected(true);
				else			checkBox1.setSelected(false);
			}
		});
		btnAdd.setBounds(81, 144, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSubtract = new JButton("Subtract");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int value1 = Integer.parseInt(textField1.getText());
				int value2 = Integer.parseInt(textField2.getText());
				int result = value1 - value2 ;
				textField3.setText("" + result);
			}
		});
		btnSubtract.setBounds(229, 144, 89, 23);
		frame.getContentPane().add(btnSubtract);
		
		JLabel result = new JLabel("Result");
		result.setBounds(99, 196, 46, 14);
		frame.getContentPane().add(result);
		
		textField3 = new JTextField();
		textField3.setBounds(229, 193, 86, 20);
		frame.getContentPane().add(textField3);
		textField3.setColumns(10);
		
		
		checkBox1.setBounds(156, 220, 97, 23);
		frame.getContentPane().add(checkBox1);
	}
}
