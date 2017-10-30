package EllJes16;

import java.io.IOException;
import java.net.ServerSocket;

public class Server
{
    ServerSocket server;

    public Server(int serverPort)
    {
        try
        {
            server = new ServerSocket(serverPort);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public ServerSocket getServer() { return server; }
}
