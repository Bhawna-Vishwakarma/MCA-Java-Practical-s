import java.util.*;
public class PerfactNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is perfact or not :");
        int num = scan.nextInt();
        int divisor = 0;
        for(int i = 1; i<=num/2; i++){
            if(num % i == 0){
                divisor += i;
            }
        }
        if(divisor == num){
            System.out.println(num +" is perfact number.");
         }else{
            System.out.println(num +" is not perfact number.");
         } 
        scan.close();  
    }
}
