import java.io.*;
public class WriteApp
{
	public static void main(String args[]) throws Exception
	{
		DataOutputStream dout = new DataOutputStream(new FileOutputStream(new File("demo.text"),true));
		//dout.writeInt(65);
		
		dout.writeUTF("\nAdded content by using DataOutputStream Class.");

		dout.close();
	}
}