import java.awt.*; 
import java.awt.event.*; 
import java.sql.*;
class LoginAdvanced extends Frame implements ActionListener
{ 
	Label l1,l2; 
	TextField tx1,tx2; 
	Button b;
	String status=""; 
	LoginAdvanced() 
	{ 
		this.setVisible(true); 
		this.setSize(350,500); 
		this.setBackground(Color.magenta); 
		this.setTitle("Login"); 
		l1=new Label("username:"); 
		l2=new Label("password:"); 
		tx1=new TextField(25); 
		tx2=new TextField(25); 

		b=new Button("login"); 
		b.addActionListener(this);
		
		tx2.setEchoChar('*'); 
		
		this.setLayout(new FlowLayout()); 
		this.add(l1); 
		this.add(tx1); 
		this.add(l2); 
		this.add(tx2); 
		this.add(b);
	} 
	public void actionPerformed(ActionEvent ae) 
	{ 
	String uname=tx1.getText(); 
	String upwd=tx2.getText();
	try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bhawna2","root","");
	ResultSet rs=conn.createStatement().executeQuery("select * from userinfo where uid='"+uname+"' and upass='"+upwd+"'");
	if (rs.next()) 
	{ 
		status="login success";
	} 
	else
	{ 
		status="login failure"; 
	} 
	repaint();
	}
	catch(Exception e){}
	 
	}
	public void paint(Graphics g) 
	{ 
		Font f=new Font("arial",Font.BOLD,30);
		g.setFont(f); 
		this.setForeground(Color.white); 
		g.drawString("Status:----"+status,50,300); 
	} 
	public static void main(String ...a){
	new LoginAdvanced();
	}
} 