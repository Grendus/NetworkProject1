import java.net.Socket;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class requestHandler implements Runnable 
{
	Socket socket;
	HashMap<String,String> urls;
	public requestHandler(Socket incomingSocket, HashMap<String,String> urlMap)
	{
		socket = incomingSocket;
		urls = urlMap;
	}
	
	public void run()
	{
		try
		{
			BufferedReader request = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String inputLine;
			while((inputLine=request.readLine()) !=null)
			{
				System.out.println(inputLine);
				System.out.println();
			}
		}
		catch (IOException e)
		{
			
		}
	}
}
