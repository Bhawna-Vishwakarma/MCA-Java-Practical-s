import java.util.*;
public class  MySet5
{
	public static void main(String[] args) 
	{
		Faculty f1=new Faculty(102,"LN rao",24.0);
		Faculty f2=new Faculty(101,"Praveen",34.0);
		Faculty f3=new Faculty(105,"Narayana",14.0);
		Faculty f4=new Faculty(103,"Satish",30.0);
		Faculty f5=new Faculty(105,"Harikrishna",12.2);
		TreeSet<Faculty> ts1=new TreeSet<Faculty>(new SortByname());
		ts1.add(f1);
		ts1.add(f2);
		ts1.add(f3);
		ts1.add(f4);
		ts1.add(f5);
		System.out.println(ts1);
	}
}
