import java.net.Socket;
import java.io.*;

public class Client 
{
	public static void main(String[] args) throws Exception 
	{
		Socket s = new Socket("localhost",5555);
		InputStream fin = s.getInputStream();
		OutputStream fout = s.getOutputStream();
		DataInputStream din = new DataInputStream(fin);
		DataOutputStream dout = new DataOutputStream(fout);
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String msg = br.readLine();
			dout.writeUTF(msg);
			String rmsg = (String)din.readUTF();
			System.out.println(rmsg);
			if(rmsg.equals("bye")){
				break;
			}
		}
	}
}