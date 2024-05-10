import java.lang.Exception;
import java.util.Scanner;

public class HighSpeedException extends Exception
{
	HighSpeedException(String errMsg)
	{
		super(errMsg);
	}

	public static void main(String args[])
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Driving speed -");
		int speed = scan.nextInt();
		try
		{
			if(speed > 120){
				throw new HighSpeedException("High Speed Driving exception..");
			}
			else if(speed < 20){
				throw new HighSpeedException("Low Speed Driving exception..");
			}
			else{
				System.out.println("Under Safe Driving..");
			}
		}
		catch (HighSpeedException e)
		{
			System.out.println(e.getMessage());
		}
	}
}