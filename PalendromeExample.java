import java.util.Scanner;
public class PalendromeExample{
	public static void main(String[] args)	{
		Scanner sc=new Scanner(System.in);
		String line=sc.next();
		int count =0;
		int length=line.length();
        for(int i=0;i<length;i++){
			for(int j=i+2;j<length;j++){
			String newvalue=line.substring(i,j);
            String reversevale=new StringBuilder(newvalue).reverse().toString();
			if(newvalue.equals(reversevale)){
				count++;
			}
			}
		}
		System.out.println("Number of palindrom are: "+count);
	
		
}
}
