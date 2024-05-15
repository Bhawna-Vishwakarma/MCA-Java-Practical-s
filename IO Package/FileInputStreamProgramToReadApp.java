import java.io.*;
public class FileInputStreamProgramToReadApp
{
	public static void main(String args[]) throws Exception
	{
		//fileInputStream meand Read file and fileOutputStream means Write file
		FileInputStream fin = new FileInputStream("file.txt");

		int ch=0;
		while((ch = fin.read()) != -1)
		{
			System.out.println((char)ch);
		}
	}
}