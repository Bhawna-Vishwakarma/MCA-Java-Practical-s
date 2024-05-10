import java.util.Scanner;
import java.lang.Exception;

public class UnderAgeException extends Exception
{
	UnderAgeException(String str){ 
		super(str); //call the constructor of super class (Exception) with message
	}
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age-");
		int age = scan.nextInt();
		
		try{
			if(age < 18){
				throw new UnderAgeException("You are under 18..");
			}else{
				System.out.println("Eligible for voting..");
			}
		}
		catch(UnderAgeException e){
			System.out.println(e.getMessage());
		}
	}
}