import java.awt.*; 
class MyFrame extends Frame 
{ 
	Button b1,b2,b3,b4,b5; 
	MyFrame() 
	{ 
		this.setBackground(Color.green); 
		this.setSize(400,400); 
		this.setVisible(true); 
		this.setLayout(new BorderLayout()); 
		b1=new Button("Boys"); 
		b2=new Button("Girls"); 
		b3=new Button("management"); 
		b4=new Button("Teaching Staff"); 
		b5=new Button("non-teaching staff"); 
		this.add("North",b1); 
		this.add("Center",b2); 
		this.add("South",b3); 
		this.add("East",b4); 
		this.add("West",b5); 
	} 
}