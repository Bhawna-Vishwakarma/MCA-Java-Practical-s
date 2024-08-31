import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame
{
	MyFrame(){
		this.setVisible(true);
		this.setSize(500,500);
		this.setBackground(Color.red);
		this.setTitle("MyFrame");
		this.addWindowListener(new MyClassImpl());
	}
}
