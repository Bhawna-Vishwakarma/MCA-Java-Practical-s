import java.util.*;
class VectorDemo 
{
	public static void main(String[] args) 
	{
		List<String> list = new Vector<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		list.add("Dry-fruits");

		for(String fruit : list){
			System.out.println(fruit);
		}
	}
}
