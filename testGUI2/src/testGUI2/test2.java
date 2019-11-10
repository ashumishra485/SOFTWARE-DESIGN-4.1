package testGUI2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class test2 {

	private JFrame frame;
	private JTextField textField;
	private JComboBox comboBox;
	private JCheckBox checkBox;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test2 window = new test2();
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
	public test2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 334);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel value = new JLabel("value");
		value.setBounds(117, 101, 46, 14);
		frame.getContentPane().add(value);
		
		textField = new JTextField();
		textField.setBounds(202, 98, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Step Up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int value = Integer.parseInt(textField.getText());
				value++;
				textField.setText(""+value);
				
				
			}
		});
		btnNewButton.setBounds(102, 145, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Step Down");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int value = Integer.parseInt(textField.getText());
				value--;
				textField.setText(""+value);
			}
		});
		btnNewButton_1.setBounds(215, 145, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Negative");
		chckbxNewCheckBox.setBounds(170, 192, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JButton btnNewButton_2 = new JButton("Set");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(""+comboBox.getSelectedItem());
				
			}
		});
		btnNewButton_2.setBounds(102, 232, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox.setBounds(242, 233, 28, 20);
		frame.getContentPane().add(comboBox);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 11, 97, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu mnOption = new JMenu("option");
		menuBar.add(mnOption);
		
		JMenuItem mntmClose = new JMenuItem("close");
		mntmClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnOption.add(mntmClose);
	}
}
