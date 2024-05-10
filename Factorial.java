import java.util.*;
public class Factorial{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        Long num = scan.nextLong();
        if(num < 0){
            System.out.println("plese enter positive number");
        }
        Long fact =1l;
        for(int i=1; i<=num; i++)
        {
            fact *= i;
        }
        System.out.println("Factorial is: "+fact);
        scan.close();
    }
}