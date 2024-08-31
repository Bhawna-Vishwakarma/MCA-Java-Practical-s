import java.util.Scanner;
public class BasicThread extends Thread
{
	public static void main(String args[])
	{
		BasicThread obj = new BasicThread();
		
		//get and set name of thread
		System.out.println("Default Name of thread is: "+ obj.getName());
		obj.setName("Myname");
		System.out.println("After setting Name of thread is: "+ obj.getName());
		System.out.println("Default Priority of thread is: "+ obj.getPriority());
		
		//get and set priority of thread
		obj.setPriority(Thread.MAX_PRIORITY);
		System.out.println("After setting maximum Priority of thread is: "+ obj.getPriority());
		obj.setPriority(Thread.MIN_PRIORITY);
		System.out.println("After setting minimum Priority of thread is: "+ obj.getPriority());
		obj.setPriority(7);
		obj.setPriority(Thread.NORM_PRIORITY);
		System.out.println("After setting normal/Default Priority of thread is: "+ obj.getPriority());
		
		System.out.println("After setting custom Priority of thread is: "+ obj.getPriority());
		
		//check daemon thread
		System.out.println("Checking Daemon thread is or not : "+ obj.isDaemon());


		//get state of thread
		System.out.println("State of thread is: "+ obj.getState());

		//get id of thread
		System.out.println("Thread " + Thread.currentThread().getId());
	}
}