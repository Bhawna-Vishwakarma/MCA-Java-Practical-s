import java.awt.*; 
class MyFrame extends Frame 
{ 
	MyFrame() 
	{ 
		this.setSize(400,400); 
		this.setVisible(true); 
		this.setLayout(new FlowLayout()); 
		this.setLayout(new CardLayout()); 
		Button b1=new Button("button1"); 
		Button b2=new Button("button2"); 
		Button b3=new Button("button3"); 
		Button b4=new Button("button4"); 
		Button b5=new Button("button5"); 
		this.add("First Card",b1); 
		this.add("Second Card",b2); 
		this.add("Thrid Card",b3); 
		this.add("Fourth Card",b4); 
		this.add("Fifth Card",b5); 
	} 
}