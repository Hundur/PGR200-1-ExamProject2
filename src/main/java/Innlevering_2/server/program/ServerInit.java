package Innlevering_2.server.program;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * Initialises the server
 *
 * @author Jesper Dahl Ellingsen
 */
public class ServerInit
{
    ServerSocket server;

    /**
     * Initialises the server
     *
     * @param serverPort The servers port that will be used
     */
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
