import java.awt.*; 
class MyFrame extends Frame 
{ 
	MyFrame() 
	{ 
		this.setVisible(true); 
		this.setSize(500,500); 
		this.setTitle("GridLayout"); 
		this.setBackground(Color.red); 
		this.setLayout(new GridLayout(3,3)); 
		for (int i=1;i<=9 ;i++ ) 
		{ 
			Button b=new Button(""+i); 
			this.add(b); 
		} 
	}
}