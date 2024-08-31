import java.awt.*;
import java.awt.event.*;

class FrameClosingImpl extends WindowAdapter 
{ 
	public void windowClosing(WindowEvent we) 
	{ 
		System.out.println("Closing Frame Window");
		System.exit(0); 
	} 
}