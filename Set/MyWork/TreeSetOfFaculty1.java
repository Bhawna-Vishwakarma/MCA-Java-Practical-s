import java.util.*;
public class  TreeSetOfFaculty1
{
	public static void main(String[] args) 
	{
		Faculty1 f1 = new Faculty1(101,"Ram","CEO");
		Faculty1 f2 = new Faculty1(102,"Shyam","Manager");
		TreeSet<Faculty1> ts1 = new TreeSet<Faculty1>();
		ts1.add(f1);
		ts1.add(f2);
		System.out.println(ts1);
	}
}
