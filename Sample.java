import java.util.*;
class Sample 
{
	public static void main(String[] args) 
	{
		List<String> ts=new ArrayList<String>();
		ts.add("BHawna");
		ts.add("Shobhit");
		ts.add("Abhya");
		ts.add("Praveen");
		ts.add("Kshama");
		ts.add("Rajneesh");
		ts.add("Ram");
		ts.add("Shyaam");
		Collections.sort(ts);
		System.out.println(ts);
	}
}
