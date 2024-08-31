import java.util.*;
import com.naresh.example.Student;
public class  MySet3
{
	public static void main(String[] args) 
	{
		Student s1=new Student(107,"Archita","MCA");
		Student s2=new Student(102,"Anjali","MCA");
		Student s3=new Student(109,"Shrasti","MCA");
		Student s4=new Student(104,"Archita","MCA");
		Student s5=new Student(105,"Archita","MCA");
		Student s6=new Student(100,"Archita","MCA");
		Set<Student> s=new LinkedHashSet<Student>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		s.add(s6);
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		System.out.println(s.contains(s4));
		Iterator<Student> i=s.iterator();
		while(i.hasNext()){
		Student st=(Student)i.next();
		System.out.println(st);
		}
		System.out.println("---------------------");
		for(Student st1:s)
		System.out.println(st1);
	}
}
