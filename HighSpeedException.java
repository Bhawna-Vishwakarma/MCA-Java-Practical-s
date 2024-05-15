import java.lang.Exception;
import java.util.Scanner;

public class HighSpeedException extends Exception
{
	public HighSpeedException(String errMsg)
	{
		super(errMsg);
		//System.out.println("High Speed Driving..");
	}

}