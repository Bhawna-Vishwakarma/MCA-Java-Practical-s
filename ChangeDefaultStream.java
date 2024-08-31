import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
class ChangeDefaultStream 
{
	public static void main(String[] args) throws Exception
	{
		try
		{
			PrintStream prt1 = new PrintStream(new FileOutputStream("output.text"));
			PrintStream prt2 = new PrintStream(new FileOutputStream("error.text"));
			System.out.println("Hiii Kshama");
			try{
			int a=100/0;
			}
			catch(Exception e){
			e.printStackTrace();
			}
            System.setOut(prt1);
            System.setErr(prt2);

			System.out.println("this msg is redirected to the file.");
			System.err.println("this error msg is also redirected to the file.");
			int b=100/0;
		}
		catch (FileNotFoundException fnfe)
		{
			fnfe.printStackTrace();
		}
	}
}
