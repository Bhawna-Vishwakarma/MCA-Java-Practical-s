import java.io.*;
public class ReadApp
{
	public static void main(String args[]) throws Exception
		{
			//DataInputStream din = new DataInputStream(new FileInputStream("demo.text"));
			//String str = din.readUTF();
			//System.out.println("Content is: \n"+str);
			
			
			try{
				DataInputStream din = new DataInputStream(new FileInputStream("demo.text"));
				String s = din.readLine();
				//String s = din.readChar();

				System.out.println(s);
			}
			catch (EOFException e)
			{
				System.out.println("End of file..");
			}
			
			//din.close();
		}
}

/*
readLine() - Deprecated method not properly convert bytes to characters.
readUTF() -  converts unicode string.... & retuns - EOFException, IOException, UFTDataformateException
*/