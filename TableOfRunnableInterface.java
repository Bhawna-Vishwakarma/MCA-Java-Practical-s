import java.util.Scanner;
import java.lang.Thread;

public class TableOfRunnableInterface implements Runnable
{	
	Scanner scan = new Scanner(System.in);		
	public static void main(String args[])
	{	
		TableOfRunnableInterface obj = new TableOfRunnableInterface();
		Thread th = new Thread(obj);
		th.start();	
	}
	
	public void run()
	{
		System.out.print("Enter number to print table-");
		int num = scan.nextInt();
		for(int i=1; i<=10; i++)
		{
			System.out.println(i * num);
			/*try{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
			}*/
		}
	}

	

}

