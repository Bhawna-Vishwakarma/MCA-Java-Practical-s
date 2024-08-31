import java.util.Scanner;
import java.lang.Exception;

public class CheckSpeed
{
	public static void main(String args[])
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Driving speed -");
		int speed = scan.nextInt();
		try
		{
			if(speed > 120){
				throw new HighSpeedException("High Speed Driving..");
			}
			else if(speed < 20){
				throw new LowSpeedException("Low Speed Driving..");
			}
			else{
				System.out.println("Under Safe Driving..");
			}
		}
		catch (Exception e)
		{
			e.printStackTrace(); //by Deafult only e calls e.toString() method
		}
	}
}