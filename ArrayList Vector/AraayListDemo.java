import java.util.*;
class AraayListDemo 
{
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		for(String fruit : list){
			System.out.println(fruit);
		}
	}
}
