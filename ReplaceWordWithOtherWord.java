import java.io.*;
import java.util.Scanner;
public class ReplaceWordWithOtherWord 
{
	public static void main(String[] args) throws Exception
	{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter word you want to replace: ");
			String word = scan.nextLine();
			System.out.println("Enter new word to replace: ");
			String newWord = scan.nextLine();

			BufferedReader br = new BufferedReader(new FileReader("demo.text"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("demo2.text"));
			String str;
			while((str = br.readLine()) != null)
			{
				System.out.println(word+" -> "+newWord);
				str = str.replace(word, newWord);
				bw.write(str);
				bw.flush(); //1st solution to write data into file
			}
			//bw.close(); //2nd solution for Writing data into file
			
	}
}
