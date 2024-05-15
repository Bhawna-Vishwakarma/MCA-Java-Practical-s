import java.util.*;
class SortStringUsingList 
{
	public static void main(String[] args) 
	{
		List<String> ts=new ArrayList<String>();
		ts.add("BHawna");
		ts.add("Shobhit");
		ts.add("Abhya");
		ts.add("D Praveen");
		ts.add("Kshama");
		ts.add("Rajneesh");
		ts.add("Ram");
		ts.add("Shyaam");
		Collections.sort(ts);
		System.out.println(ts);
	}
}
