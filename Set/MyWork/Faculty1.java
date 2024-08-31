public class Faculty1 implements Comparable<Faculty1>{
	private int fid;
	private String fname, fqualification;

	public Faculty1(int fid, String fname, String fqualification){
		this.fid=fid;
		this.fname=fname;
		this.fqualification=fqualification;
	}
	public int compareTo(Faculty1 f){
		return this.fid - f.fid;
	}
    public String toString(){
		return "{"+fid+", "+fname+", "+fqualification+"}";
	} 
}
