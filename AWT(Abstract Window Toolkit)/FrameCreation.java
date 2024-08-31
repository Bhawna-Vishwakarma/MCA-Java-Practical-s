import java.awt.*;
public class FrameCreation 
{
	public static void main(String[] args) 
	{
		//frame creation 
		Frame f=new Frame(); 
		//set visibility 
		f.setVisible(true); 
		//set the size of the frame 
		f.setSize(400,400); 
		//set the background 
		f.setBackground(Color.orange); 
		//set the title of the frame 
		f.setTitle("mMyframe");	
	}
}

/*create Frame class object otherwise extends Frame class
then create inherited class object to call methods of Frame class like -

class Test extends Frame 
{ 
	public static void main(String[] args) 
	{ 
		Test t=new Test(); 
		t.setVisible(true); 
		t.setSize(500,500); 
		t.setTitle("myframe"); 
		t.setBackground(Color.red); 
	}
}