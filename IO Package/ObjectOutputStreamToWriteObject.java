import java.io.*;
public class ObjectOutputStreamToWriteObject
{
	public static void main(String args[])
	{
		//firstly writeObject otherwise readObject doesn't works
		try{
			Student stuObj = new Student(101,"Bhawna","MCA");
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.txt"));
			oos.writeObject(stuObj);
			System.out.println("Write Successfully..");
		}
		catch(FileNotFoundException fnfe){
			fnfe.printStackTrace();
		}
		catch(IOException io){
			io.printStackTrace();
		}
	}
}