import java.awt.*; 
import java.awt.event.*; 

class MyFrame extends Frame 
{ 
	MyFrame() 
	{ 
		this.setVisible(true); 
		this.setSize(500,500); 
		this.setBackground(Color.red); 
		this.setTitle("ClosingFrame"); 
		this.addWindowListener(new FrameClosingImpl()); 
	} 
}