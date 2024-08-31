import java.io.RandomAccessFile;
import java.io.IOException;

class RandomAccessFileDemo 
{
	public static void main(String[] args) 
	{
		try
		{
			RandomAccessFile raf = new RandomAccessFile("demo.txt","rw");
			raf.writeUTF("Hello, World!");
			raf.writeInt(12345);
			raf.writeDouble(3.14159);

			System.out.println("Current file pointer position: "+raf.getFilePointer());

			raf.seek(0);

			String str = raf.readUTF();
			int number = raf.readInt();
			double pi = raf.readDouble();

			System.out.println("Read String " + str);
			System.out.println("Read Integer " + number);
			System.out.println("Read Double " + pi);

			raf.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
