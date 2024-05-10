import java.util.*;
public class PalindromString 
{
    
    public static int countPS(String str)
    {
        int count = 0;
        String rev = "";
        String words[] = str.split("\\s+");
        for( String word: words){
            rev = isPalindrome(word);
            if(word.equals(rev)){
                System.out.print(rev+" ");
                count++;
            }
        }
        return count;
    } 

    public static String isPalindrome(String word){
        String temp ="";
        for (int i = word.length()-1; i >=0 ; i--) {
            temp = temp + word.charAt(i);
        }      
        return temp;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = scan.nextLine();
        System.out.println("\nNumber of Palindrom Strings are: " + countPS(str));
        scan.close();
    }
}
