import java.awt.*; 

public class LoginPage 
{ 
	public static void main(String[] args) 
	{ 
		Frame f = new Frame(); 
		f.setVisible(true); 
		f.setTitle("LoginPage"); 
		f.setBackground(Color.pink); 
		f.setSize(340,500); 
        f.setLayout(new GridLayout(2,2));
		Label l1 = new Label("username:");
		TextField tx1 = new TextField(25);
		TextField tx3 = new TextField(25);
		Label l2 = new Label("password:"); 
		TextField tx2 = new TextField(25); 
		Button b = new Button("login"); 

		f.setLayout(new FlowLayout()); 
		f.add(l1); 
		f.add(tx1);
		f.add(l2); 
		f.add(tx2);
		f.add(tx3);
		f.add(b); 
	} 
}