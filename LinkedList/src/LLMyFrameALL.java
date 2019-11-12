
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class LLMyFrameALL extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel("  Array  Application  ");
	private JLabel l1 = new JLabel("");
	private JLabel l12 = new JLabel("");
	private JLabel l13 = new JLabel("");
	private JTextField t1=new JTextField("0",78);
	private JLabel l2 = new JLabel("Name ");
	private JTextField t2=new JTextField("W",8);
	private JLabel l23 = new JLabel("Transactions ");
	private JTextField t23=new JTextField("0",8);
	private JButton b1=new JButton("add");private JTextField t3=new JTextField("25",8);
	private JButton b2=new JButton("youngest ");private JTextField t4=new JTextField("",8);
	private JLabel l3 = new JLabel("Age ");
	private JTextField t5=new JTextField("C",8);private JTextField t6=new JTextField(" ",8);
	private JPanel p1=new JPanel();
	private JButton b3=new JButton("SearchbyName");
	private JButton b7=new JButton("Oldest Age");private JTextField t7=new JTextField(" ",8);private JLabel l7 = new JLabel("");
	private JButton b8=new JButton("CountName");private JTextField t81=new JTextField("B",8);JTextField t82=new JTextField("",8);
	private JButton b9=new JButton("AllOlderThan:");private JTextField t91=new JTextField("8",8);JTextField t92=new JTextField("",8);
	private JButton b10=new JButton("Spare:");private JTextField t101=new JTextField("",8);JTextField t102=new JTextField("",8);
	LLinkedList l=new LLinkedList();
	 
	public void display(){
		  t1.setText(l.printlist());
	}
	
	public LLMyFrameALL(String s){
		super(s);
		
        l.insert("A",5);
        l.insert("B",15);
        l.insert("C",4);
        l.insert("D",8);
        l.insert("B",25);
        l.insert("B",20);
        
		Container content=getContentPane();
		content.setLayout(new FlowLayout());
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setLayout(new GridLayout(8,3));
		t1.setFont(f);  
		l1.setFont(f);l2.setFont(f);l3.setFont(f);
		content.add(t1);
		//// p1.add(t1);
		p1.add(l1);p1.add(l2); p1.add(l3);
		p1.add(b1); p1.add(t2);p1.add(t3);
		p1.add(b2); p1.add(t4);p1.add(l12);
		p1.add(b3); p1.add(t5);p1.add(t6);
		p1.add(b7); p1.add(t7);p1.add(l7);
		p1.add(b8); p1.add(t81);p1.add(t82);
		p1.add(b9); p1.add(t91);p1.add(t92);
		p1.add(b10); p1.add(t101);p1.add(t102);
		// p1.add(t3);
		//p1.add(b2); p1.add(t4);
		//p1.add(l3); p1.add(t5);
		//p1.add(b3);
		content.add(p1);
		b1.addActionListener(this);   
		b2.addActionListener(this);  
		b3.addActionListener(this); b7.addActionListener(this); b8.addActionListener(this); b9.addActionListener(this);  b10.addActionListener(this); 
		
		display();
		//t2.setText(""+a.read_bal());t23.setText(""+a.read_transactions());
		setSize(1400,290);    setVisible(true);}
	
	public void actionPerformed(ActionEvent e){
        
	  	Object target=e.getSource();

	 	if (target==b1){
	 		l.insert(t2.getText(), Integer.parseInt(t3.getText()));
	 		display();}
	 	if (target==b2){
	 		    
		        String res=l.youngest();
		        t4.setText(res);
		       
         }
	 	if (target==b3){
	 		 t6.setText(""+l.search(t5.getText())  );

     }
	 	if (target==b7){
	 		 t7.setText(""+l.oldest()  );

    }
	 	if (target==b8){
	 		t82.setText(""+l.count(t81.getText())  );

   }	 	
	 	if (target==b9){
		t92.setText(""+l.allOlderThan(Integer.parseInt(t91.getText()))  );
       }	
    if (target==b10){
	     t102.setText("SPARE"  );
// t102.setText(""+l.addAllAges()  );
//t102.setText(""+l.countOlder(Integer.parseInt(t101.getText())));

}
	 }

}