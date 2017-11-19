package Innlevering_2.server;

import Innlevering_2.server.program.ClientConnection;
import Innlevering_2.server.program.ServerInit;
import Innlevering_2.server.program.ServerRuntime;

/**
 * Starts the server
 *
 * @author Jesper Dahl Ellingsen
 */
public class Server
{
    /**
     * For every client connected, a new thread will be made for it
     *
     * @param args
     */
    public static void main(String [] args)
    {
        ServerInit server = new ServerInit(3000);

        while(true)
        {
            ClientConnection conn = new ClientConnection(server.getServer());

            if(conn != null)
                new Thread(new ServerRuntime(conn)).start();
        }
    }
}
