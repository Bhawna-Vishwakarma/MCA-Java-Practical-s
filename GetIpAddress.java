import java.net.InetAddress;
import java.net.UnknownHostException;
class GetIpAddress 
{
	public static void main(String[] args) 
	{
		try
		{
			InetAddress ina = InetAddress.getLocalHost();
			System.out.println("IP Address: "+ ina.getHostAddress());
			System.out.println("Host Name: "+ ina.getHostName());

		}
		catch (UnknownHostException uhe)
		{
			uhe.printStackTrace();
		}
	}
}
