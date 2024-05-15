import java.lang.Exception;

public class UnderAgeException extends Exception
{
	UnderAgeException(String str){ 
		super(str); //call the constructor of super class (Exception) with message
	}
}
