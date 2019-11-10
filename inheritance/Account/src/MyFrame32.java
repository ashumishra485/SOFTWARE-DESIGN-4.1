
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame32 extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel("  Account  Application  ");
	private JLabel l1 = new JLabel("Number ");
	private JTextField t1=new JTextField(" ",8);
	private JLabel l2 = new JLabel("Balance ");
	private JTextField t2=new JTextField("0",8);
	private JLabel l6 = new JLabel("Maximum ");
	private JTextField t6=new JTextField("0",8);
	private JButton b1=new JButton("Deposit");private JTextField t3=new JTextField("0",8);
	private JButton b2=new JButton("Withdraw");private JTextField t4=new JTextField("0",8);
	private JLabel l3 = new JLabel("Message ");
	private JTextField t5=new JTextField(" ",8);
	private JPanel p1=new JPanel();
	
	private Cashsave a =new Cashsave(999123,   100,600);
	
	public MyFrame32(String s){
		super(s);
		Container content=getContentPane();
		content.setLayout(new FlowLayout());
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setLayout(new GridLayout(6,2));
		l0.setFont(f);  l1.setFont(f);
		content.add(l0);
		p1.add(l1); p1.add(t1);
		p1.add(l2); p1.add(t2);
		p1.add(l6); p1.add(t6);
		p1.add(b1); p1.add(t3);
		p1.add(b2); p1.add(t4);
		p1.add(l3); p1.add(t5);
		content.add(p1);
		b1.addActionListener(this);   
		b2.addActionListener(this);  
 
		t1.setText("999123");t6.setText("600");
		t2.setText(""+a.read_balance());
		setSize(210,250);    setVisible(true);}
	
	public void actionPerformed(ActionEvent e){
        
	  	Object target=e.getSource();
	  	t5.setText("");
	 	if (target==b1){
	          		int amt=Integer.parseInt(t3.getText());
	          		boolean res =a.deposit(amt);
	             	t2.setText(""+a.read_balance());
	             	if (res==false)t5.setText("Exceeds Limit");
	             }
	 	if (target==b2){
      		int amt=Integer.parseInt(t4.getText());
      		boolean res= a.withdraw(amt);
         	t2.setText(""+a.read_balance());
         	if (res==false)t5.setText("Insuff Funds");
         }
	 	
	 }

}