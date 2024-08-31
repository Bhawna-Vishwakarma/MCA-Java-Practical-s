import java.awt.*;
import java.awt.event.*;
class MyClassImpl implements WindowListener 
{
	public void windowActivated(WindowEvent e) 
	{ 
		System.out.println("window activated"); 
	} 
	public void windowDeactivated(WindowEvent e) 
	{ 
		System.out.println("window deactivated"); 
	} 
	public void windowIconified(WindowEvent e) 
	{ 
		System.out.println("window iconified"); 
	} 
	public void windowDeiconified(WindowEvent e) 
	{ 
		System.out.println("window deiconified"); 
	} 
	public void windowClosed(WindowEvent e) 
	{ 
		System.out.println("window closed"); 
	} 
	public void windowClosing(WindowEvent e) 
	{ 
		System.exit(0); 
	} 
	public void windowOpened(WindowEvent e) 
	{ 
		System.out.println("window Opened"); 
	}
}
