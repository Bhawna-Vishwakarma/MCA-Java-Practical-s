import java.awt.*;
class AddTextField 
{
	public static void main(String[] args) 
	{
		Frame f =new Frame();
		f.setVisible(true);
		f.setSize(600,600);
		f.setTitle("AddTextFiled");
		f.setBackground(Color.pink);
		TextField t = new TextField("Bhawna Vishwakarma");
		f.add(t);
	}
}
