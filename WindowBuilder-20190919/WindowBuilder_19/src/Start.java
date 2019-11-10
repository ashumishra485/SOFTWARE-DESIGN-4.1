import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Start {

	private JFrame frame;
	private JTextField textField;
	Counter c = new Counter(6);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
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
	public Start() {
		initialize();
		myRefresh();
	}

	private void myRefresh() {
		textField.setText(""+c.readValue());
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Value");
		lblNewLabel.setBounds(127, 80, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(217, 77, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnIncrease = new JButton("Increase");
		btnIncrease.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.step();
				myRefresh();
			}
		});
		btnIncrease.setFont(new Font("Tahoma",Font.PLAIN,16));
		btnIncrease.setBounds(84, 136, 89, 23);
		frame.getContentPane().add(btnIncrease);
		
		JButton btnDecrease = new JButton("Decrease");
		btnDecrease.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.step1();
				myRefresh();
			}
		});
		btnDecrease.setBounds(233, 136, 89, 23);
		frame.getContentPane().add(btnDecrease);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 97, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmReset = new JMenuItem("Reset");
		mntmReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.reset();
				myRefresh();
			}

			private void reset() {
				// TODO Auto-generated method stub
				
			}
		});
		
		JMenuItem mntmClose = new JMenuItem("Close");
		mntmClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmClose);
		mnNewMenu.add(mntmReset);
	}
}
