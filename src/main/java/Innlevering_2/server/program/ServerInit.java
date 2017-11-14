package Innlevering_2.server.program;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerInit
{
    ServerSocket server;

    public ServerInit(int serverPort)
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
