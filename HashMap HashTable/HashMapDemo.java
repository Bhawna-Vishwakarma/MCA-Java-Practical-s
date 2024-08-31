import java.util.*;
class HashMapDemo
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(101, "abbas");
		hm.put(101, "Ram");
		hm.put(102, "Shyam");
		hm.put(103, "Sita");
		System.out.println("---------- Hash Map ---------");
		for(Map.Entry m: hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("insertion Order and no Duplication..!");
	}
}
