import java.awt.*;
class Demo 
{
	public static void main(String[] args) 
	{
		MyFrame f = new MyFrame();
	}
}

/*
****PROVIDING CLOSEING OPTION THE FRAME****** 
import java.awt.*; 
import java.awt.event.*; 
class MyFrame extends Frame 
{ 
	MyFrame() 
	{ 
		this.setVisible(true); 
		this.setSize(500,500); 
		this.setBackground(Color.red); 
		this.setTitle("rattaiah"); 
		this.addWindowListener(new WindowAdapter() 
		{ 
			public void windowClosing(WindowEvent we) 
			{ 
			System.exit(0); 
			} 
		}); 
	} 
} 
class FrameEx 
{ 
	public static void main(String[] args) 
	{ 
		MyFrame f=new MyFrame(); 
	} 
}
