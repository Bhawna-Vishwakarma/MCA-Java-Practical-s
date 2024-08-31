import java.awt.*;

class AddCheckbox
{
	public static void main(String[] args) 
	{
		Frame f = new Frame();
		f.setVisible(true);
		f.setSize(500,500);
		f.setTitle("CheckBox");
		f.setBackground(Color.red);

		//Checkbox cb= new Checkbox("MCA",true);
		Checkbox cb= new Checkbox();
		cb.setLabel("Cehck");
		System.out.println(cb.getLabel());
		System.out.println(cb.getState());
		f.add(cb);
	}
}
