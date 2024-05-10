import java.util.Scanner;
public class FirstLastCharacter {
    static void BeforeSpaceAndLastChar(String str)
    {
        for (int i = 0; i < str.length(); i++) 
        {
            if(i == str.length()-1)
            {
                System.out.println("Last Character of line is:"+ str.charAt(i));
            }
            if(str.charAt(i) == ' ')
            {
                System.out.println("before space Character of line is:"+ str.charAt(i-1));
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter String - ");
        String str = scan.nextLine();
        BeforeSpaceAndLastChar(str);
        scan.close();
    }
}
