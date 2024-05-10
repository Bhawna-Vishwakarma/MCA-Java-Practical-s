import java.util.Scanner;
public class SortArrayOfString
{
	static void printSortedStrArr(String strArr[])
	{	
		System.out.println("Sorted array is ->");				
		for(String str : strArr)
		{
			System.out.println("\t"+str +" ");				
		}
	}

	static String[] takeUserInputOfStringArr()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many strings you wants to enter..");
		int strArrSize = scan.nextInt();
		String[] strArr = new String[strArrSize];
		
		for(int i = 0; i < strArrSize; i++)
		{
			System.out.print("\nEnter ["+ i +"] index: ");
			strArr[i] = scan.next();
		}
		return strArr;
	}
	static String[] sortArrayOfString(String[] strArr)
	{
		for(int i=0; i< strArr.length-1; i++)
		{
			for(int j=i+1; j < strArr.length; j++)
			{
				//arr[i] is grater than arr[j] lexicographically comparision
				if(strArr[i].compareTo(strArr[j]) > 0) 
				{
					String temp = strArr[i];
					strArr[i] = strArr[j];
					strArr[j] = temp;
				}
			}
		}
		return strArr;
	}
	public static void main(String args[])
	{
		printSortedStrArr(sortArrayOfString(takeUserInputOfStringArr()));
	}
}