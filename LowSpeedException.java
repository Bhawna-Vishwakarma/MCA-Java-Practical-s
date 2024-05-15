import java.lang.Exception;
import java.util.Scanner;

public class LowSpeedException extends Exception
{
	public LowSpeedException(String errMsg)
	{
		super(errMsg);
	}

}