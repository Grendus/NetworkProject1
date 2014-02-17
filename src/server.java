import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.util.HashMap;
public class server {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		HashMap<String,String> urls = pathList();
		while(true)
		{
			try
			{
				ServerSocket RedRocker = new ServerSocket(8001);
				Socket BlueBomber = RedRocker.accept();
				(new requestHandler(BlueBomber, urls)).run();
			}
			catch(IOException e)
			{
				
			}
		}

	}
	
	private static HashMap<String,String> pathList()
	{
		HashMap<String,String> urlmap = new HashMap<String,String>();
		urlmap.put("/index.html", "index.html");
		return urlmap;
	}

}
