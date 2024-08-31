import java.awt.*; 
import java.awt.event.*; 
class Calculator extends Frame implements ActionListener
{ 
	Label l1,l2; 
	TextField tx1,tx2; 
	Button addbtn,subbtn,mulbtn,divbtn,rembtn;
	int addition,subtract,multiply,division,reminder,check; 
	Calculator() 
	{ 
		this.setVisible(true); 
		this.setSize(380,500); 
		this.setBackground(Color.magenta); 
		this.setTitle("Calculator"); 
		l1=new Label("Enter first number:"); 
		l2=new Label("Enter second number:"); 
		tx1=new TextField(25); 
		tx2=new TextField(25); 

		addbtn=new Button("+");
		subbtn=new Button("-");
		mulbtn=new Button("*");
		divbtn=new Button("/");
		rembtn=new Button("%");

		addbtn.addActionListener(this);
		subbtn.addActionListener(this);
		mulbtn.addActionListener(this);
		divbtn.addActionListener(this);
		rembtn.addActionListener(this);

		
		this.setLayout(new FlowLayout()); 
		this.add(l1); 
		this.add(tx1); 
		this.add(l2); 
		this.add(tx2); 
		this.add(addbtn);
		this.add(subbtn);
		this.add(mulbtn);
		this.add(divbtn);
		this.add(rembtn);

	} 
	public void actionPerformed(ActionEvent ae) 
	{ 
		int num1= Integer.parseInt(tx1.getText()); 
		int num2= Integer.parseInt(tx2.getText());
		if(ae.getSource() == addbtn){ 
			addition = num1 + num2;
			check =1;
		}
		if(ae.getSource() == subbtn){ 
			subtract = num1 - num2;
			check=2;
		}
		if(ae.getSource() == mulbtn){ 
			multiply = num1 * num2;
			check=3;
		}
		if(ae.getSource() == divbtn){ 
			division = num1 / num2;
			check=4;
		}
		if(ae.getSource() == rembtn){ 
			reminder = num1 % num2;
			check=5;
		}
		repaint(); 
	}
	public void paint(Graphics g) 
	{ 
		Font f=new Font("arial",Font.BOLD,30);
		g.setFont(f); 
		this.setForeground(Color.white);
		if(check==1)
		g.drawString("Addition is:- "+addition,50,300);
		
		if(check==2)
		g.drawString("Subtraction is:- "+subtract,50,300);
		
		if(check==3)
		g.drawString("multiplication is:- "+multiply,50,300);
		
		if(check==4)
		g.drawString("Division is:- "+division,50,300);

		if(check==5)
		g.drawString("Reminder is:- "+reminder,50,300);

	} 
	public static void main(String[] args) 
	{
		Calculator l = new Calculator();
	}
} 