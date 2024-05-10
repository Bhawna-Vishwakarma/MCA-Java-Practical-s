import java.util.*;
public class InsertionSort 
{
    void sortArr(int arr[], int arrSize)
    {
        int key,index;
        for(int i=1; i< arrSize; i++)
        {
            key = arr[i];
            index = i-1;

            while(index >= 0 && arr[index] > key) 
            {
                arr[index+1] = arr[index];// arr[1] = arr[0]
                index = index-1; 
            }
            arr[index + 1] = key;// arr[0] = arr[1]
        }
    }

    void printArr(int arr[], int arrSize)
    {
        for(int i=0; i<arrSize; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        InsertionSort obj = new InsertionSort();
        try{
            System.out.println("How many numbers would you enter..");
            int arrSize = scan.nextInt();  
            if (arrSize < 0) 
            {
                throw new IllegalArgumentException("Please Enter only positive value.");
            }
            else{
                int arr[] = new int[arrSize];
                for(int i=0; i<arrSize; i++)
                {
                    System.out.print("Enter arr["+i+"]- ");
                    arr[i] = scan.nextInt();
                }
                System.out.println("Befor sorting array is: ");
                obj.printArr(arr, arrSize);
                obj.sortArr(arr, arrSize);
                System.out.println("\nAfter sorting array is: ");
                obj.printArr(arr, arrSize);
            }      
        }catch(IllegalArgumentException err){
            System.out.println(err.getMessage());
        }
        finally{
            scan.close();
        }
    }
}
