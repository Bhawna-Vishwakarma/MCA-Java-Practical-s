import java.awt.*;

public class AddTextArea 
{
	public static void main(String[] args) 
	{
		Frame f = new Frame();
		f.setVisible(true);
		f.setSize(500,700);
		f.setTitle("TextArea");
		f.setBackground(Color.pink);
		f.setLayout(new FlowLayout());
		
		Label la = new Label("Username: ");
		TextArea ta = new TextArea(3,25);
		ta.setText("bhawna");
		ta.appendText(" Vishwakarma");
		System.out.println(ta.getText());
		f.add(la);
		f.add(ta);
	}
}