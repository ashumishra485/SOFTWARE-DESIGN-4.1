
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FootballTeamGUI extends JFrame {

	JLabel idLabel = new JLabel("Jersey Number:");
	JTextField idTextField = new JTextField(10);
	JLabel nameLabel = new JLabel("Name: ");
	JTextField nameTextField = new JTextField(10);

	JButton addButton = new JButton("Add");
	JButton deleteButton = new JButton("Delete");
	JButton displayAllButton = new JButton("Display All");
	JButton exitButton = new JButton("Exit");

	private LinkedList<FootballTeam> PlayerList = new LinkedList<FootballTeam>();
	private final JButton btnNewButton = new JButton("Linear Search (By Id)");
	private final JButton btnNewButton_1 = new JButton("Binary Search (By Id)");
	private final JTextField txtSF = new JTextField();
	private final JLabel lblNewLabel = new JLabel("Search By Id:");
	private final JTextArea studentTextArea = new JTextArea();
	private final JButton bstbutton = new JButton("LinkedList Search (By Name)");

	public FootballTeamGUI() {
		txtSF.setColumns(10);
		JPanel flow1Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel flow2Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel gridPanel = new JPanel(new GridLayout(2, 1));
		gridPanel.setBounds(0, 516, 701, 78);

		flow1Panel.add(idLabel);
		flow1Panel.add(idTextField);
		flow1Panel.add(nameLabel);
		flow1Panel.add(nameTextField);

		gridPanel.add(flow1Panel);

		flow1Panel.add(lblNewLabel);

		flow1Panel.add(txtSF);
		gridPanel.add(flow2Panel);
		getContentPane().setLayout(null);
		getContentPane().add(gridPanel);
		studentTextArea.setBounds(61, 46, 588, 304);
		
		getContentPane().add(studentTextArea);
	
		bstbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Iterator<FootballTeam> iterator = PlayerList.iterator();
				boolean flag = false;
				while (iterator.hasNext()) {
				/*	if(iterator.next().getName().equals(nameTextField.getText())) {
						System.out.println(iterator.next().getName());
					}els/e {
						//S/ystem.out.println("NO");
					}
					*/
					
					if(iterator.next().getName().equals(nameTextField.getText())){
						flag = true;
						break;
					}
				}
				
				if(flag) {
					JOptionPane.showMessageDialog(null, "Player is present in the team");
				}
				else {
					JOptionPane.showMessageDialog(null, "Player is not present in the team");
					
				}
				
				
			}
		});
		bstbutton.setBounds(264, 362, 201, 29);
		
		getContentPane().add(bstbutton);
		btnNewButton.setBounds(57, 362, 154, 29);
		getContentPane().add(btnNewButton);
		btnNewButton_1.setBounds(495, 362, 154, 29);
		getContentPane().add(btnNewButton_1);
				addButton.setBounds(57, 420, 154, 29);
				getContentPane().add(addButton);
				deleteButton.setBounds(283, 420, 154, 29);
				getContentPane().add(deleteButton);
				displayAllButton.setBounds(495, 420, 147, 29);
				getContentPane().add(displayAllButton);
				exitButton.setBounds(283, 472, 154, 29);
				getContentPane().add(exitButton);
				
				JLabel lblNewLabel_1 = new JLabel("FOOTBALL SEARCH SYSTEM");
				lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
				lblNewLabel_1.setBounds(250, 18, 301, 16);
				getContentPane().add(lblNewLabel_1);
				exitButton.addActionListener(event -> exitApplication());
				displayAllButton.addActionListener(event -> displayAll());
				deleteButton.addActionListener(event -> deleteStudent());
		
				addButton.addActionListener(event -> addStudent());
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(txtSF.getText());
				ArrayList<Integer> list = new ArrayList<Integer>();
				for (int i = 0; i < PlayerList.size(); i++) {
					list.add(Integer.parseInt(PlayerList.get(i).getId()));
				}

				int index = Collections.binarySearch(list, id);

				JFrame f = new JFrame();

				if (index != -1) {
					JOptionPane.showMessageDialog(f,
							"Player is present in the team at " + (Integer) (index + 1) + " position");
				} else {
					JOptionPane.showMessageDialog(f, "Player is not present in the team");
				}
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txtSF.getText();
				boolean flag = false;
				for (int i = 0; i < PlayerList.size(); i++) {
					if (id.equals(PlayerList.get(i).getId())) {
						flag = true;
					}
				}

				JFrame f = new JFrame();

				if (flag) {
					JOptionPane.showMessageDialog(f, "Player is present in the team");
				} else {
					JOptionPane.showMessageDialog(f, "Player is not present in the team");
				}
			}
		});
	}

	private boolean isStudentIdInLinkedList(String idStr) {
		boolean inList = false;

		for (FootballTeam stud : PlayerList) {
			if (stud.getId().compareToIgnoreCase(idStr) == 0) {
				inList = true;
			}
		}

		return inList;
	}

	private void addStudent() {
		if (isStudentIdInLinkedList(idTextField.getText()) == true) {
			JOptionPane.showMessageDialog(null, "Error: Player Jersey Number is already in the team.");
		} else {
			try {
				FootballTeam stud = new FootballTeam(nameTextField.getText(), idTextField.getText());

				PlayerList.add(stud);

				displayAll();

				nameTextField.setText("");
				idTextField.setText("");

			} catch (FootballTeamException error) {
				JOptionPane.showMessageDialog(null, error.toString());
				// myLabel.setText (error.toString ());

			}

		}
	}

	private void deleteStudent() {
		if (PlayerList.size() == 0) {
			JOptionPane.showMessageDialog(null, "Error: Team is empty.");
		} else if (isStudentIdInLinkedList(idTextField.getText()) == false) {
			JOptionPane.showMessageDialog(null, "Error: Player Jersey Number is not in the team.");
		} else {
			for (int s = 0; s < PlayerList.size(); s++) {
				String currId = PlayerList.get(s).getId();

				if (currId.compareToIgnoreCase(idTextField.getText()) == 0) {
					PlayerList.remove(s);
				}
			}

			displayAll();

			nameTextField.setText("");
			idTextField.setText("");
		}
	}

	private void displayAll() {
		studentTextArea.setText("");

		for (FootballTeam stud : PlayerList) {
			studentTextArea.append(stud + "\n");
		}
	}

	private void exitApplication() {
		System.exit(0);
	}

	public static void main(String[] args) {
		FootballTeamGUI app = new FootballTeamGUI();
		app.setVisible(true);
		app.setSize(700, 600);
		app.setLocation(200, 100);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}