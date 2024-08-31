import java.net.Socket;
import java.net.ServerSocket;
import java.io.*;

public class Server
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket server = new ServerSocket(5555);
		Socket s = server.accept();
		InputStream fin = s.getInputStream();
		OutputStream fout = s.getOutputStream();
		DataInputStream din =new DataInputStream(fin);
		DataOutputStream dout = new DataOutputStream(fout);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String rmsg = (String)din.readUTF();
			System.out.println(rmsg);
			if(rmsg.equals("bye")){
				break;
			}
			String msg = br.readLine();
			dout.writeUTF(msg);
		}
	}
}
