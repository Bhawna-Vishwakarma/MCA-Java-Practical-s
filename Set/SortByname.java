public class SortByname implements java.util.Comparator<Faculty>{
	public int compare(Faculty f1,Faculty f2){
		return f1.name.compareTo(f2.name);
	}
}