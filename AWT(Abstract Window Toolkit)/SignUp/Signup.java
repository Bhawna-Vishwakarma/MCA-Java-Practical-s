import java.awt.*;
import java.awt.event.*;

public class Signup extends Frame implements ActionListener
{	
	Label lb1,lb2,lb3; 
	TextField txt1,txt2,txt3; 
	Button btn;
	String status = "";
	Signup(){
		this.setVisible(true);
		this.setSize(380,600);
		this.setBackground(Color.green);
		this.setTitle("SignUp Pgae");
		this.setLayout(new FlowLayout());

		lb1 = new Label("Enter Your Name:");
		txt1 = new TextField(25);
		lb2 = new Label("Enter Your Email:");
		txt2 = new TextField(25);
		lb3 = new Label("Create Password:");
		txt3 = new TextField(25);
		btn = new Button("SignUp");
		btn.addActionListener(this);
		txt3.setEchoChar('*');
		this.add(lb1);
		this.add(txt1);
		this.add(lb2);
		this.add(txt2);
		this.add(lb3);
		this.add(txt3);
		this.add(btn);

	}	
	public void actionPerformed(ActionEvent ae) 
	{ 
	String uname= txt1.getText(); 
	String umail= txt2.getText();
	String upwd= txt3.getText();
	if (uname.equals("") || umail.equals("") || upwd.equals("")) 
	{ 
		status="Signup Failure";
	} 
	else
	{ 
		status="Signup Successful"; 
	} 
	repaint(); 
	}
	public void paint(Graphics g) 
	{ 
		Font f=new Font("arial",Font.BOLD,30);
		g.setFont(f); 
		this.setForeground(Color.white); 
		g.drawString("Status:----"+status,50,300); 
	}
	public static void main(String[] args) 
	{
		Signup obj = new Signup();
	}
}