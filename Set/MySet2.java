import java.util.*;
import com.naresh.example.Student;
public class  MySet2
{
	public static void main(String[] args) 
	{
		Student s1=new Student(101,"Archita","MCA",12050);
		Student s2=new Student(102,"Anjali","MCA",12050);
		Student s3=new Student(103,"Shrasti","MCA",12050);
		Student s4=new Student(104,"Archita","MCA",12050);
		Student s5=new Student(105,"Archita","MCA",12050);
		Student s6=new Student(105,"Archita","MCA",12050);
		Set<Student> s=new HashSet<Student>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		s.add(s6);
		System.out.println(s);
	}
}
