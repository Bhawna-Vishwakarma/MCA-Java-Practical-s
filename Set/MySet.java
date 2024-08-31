import java.util.*;
public class  MySet
{
	public static void main(String[] args) 
	{
		Set s=new HashSet();
		s.add(101);
		s.add(101.999);
		s.add("AAA");
		s.add('a');
		s.add(false);
		System.out.println(s);
	}
}
