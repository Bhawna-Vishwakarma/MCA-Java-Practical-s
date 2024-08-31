import java.awt.*;

class AddList 
{
	public static void main(String[] args) 
	{
		Frame f = new Frame();
		f.setVisible(true);
		f.setSize(500,500);
		f.setTitle("List");
		f.setBackground(Color.magenta);
		f.setLayout(new FlowLayout());
		List l = new List(5, true);
		l.add("java");
		l.add("cpp");
		l.add("javascript");
		l.add(".net",0);
		l.remove(0);
		f.add(l);
		System.out.println(l.getSelectedItem());

	}
}
