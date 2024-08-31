import java.awt.*;
class AddLable 
{
	public void paint(Graphics g)
	{
		Font f = new Font("arial",Font.BOLD,25);
		g.setFont(f);
	}
	public static void main(String[] args) 
	{
		Frame f =new Frame();
		f.setVisible(true);
		f.setSize(600,600);
		f.setTitle("AddLabel");
		f.setBackground(Color.magenta);
		Label l = new Label("Username");
		f.add(l);
	}
}
