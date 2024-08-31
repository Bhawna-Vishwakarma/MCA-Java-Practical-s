import java.io.*;
class SequenceStreamDemo 
{
	public static void main(String[] args) 
	{
		try
		{
			InputStream input1 = new FileInputStream("file.txt");
			InputStream input2 = new FileInputStream("demo.txt");

			SequenceInputStream seqIn = new SequenceInputStream(input1, input2);

			int data;
			while((data = seqIn.read()) != -1)
			{
				System.out.print((char)data);
			}
			
			seqIn.close();
			input1.close();
			input2.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
