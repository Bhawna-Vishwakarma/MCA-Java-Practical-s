import java.io.Serializable;

public class Student implements Serializable{
	int rollno;
	String name,course;

	Student(int rollno,String name,String course)
	{
		this.rollno = rollno;
		this.course = course;
		this.name = name;
	}
	
	public int getRollno(){
		return rollno;
	}
	
	public String getName(){
		return name;
	}
	
	public String getCourse(){
		return course;
	}

}
