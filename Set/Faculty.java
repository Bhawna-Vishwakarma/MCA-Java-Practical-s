public class Faculty implements Comparable<Faculty>{
	int fid;
	String name;
	Double exp;

	public Faculty(int fid, String name, Double exp){
		this.fid=fid;
		this.name=name;
		this.exp=exp;
	}
	public int compareTo(Faculty f){
		return this.fid - f.fid;
	}
    public String toString(){
		return "\n"+fid+" "+name+" "+exp+"\n";
	} 
}
