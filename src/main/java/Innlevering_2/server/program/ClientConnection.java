package Innlevering_2.server.program;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Waits for a client to connect
 *
 * @author Jesper Dahl Ellingsen
 */
public class ClientConnection
{
    private Socket clientConnection;
    private ServerSocket server;

    public ClientConnection(ServerSocket server)
    {
        this.server = server;
    }

    /**
     * Waits for a clients request to connect and accepts the request
     *
     * @return the socket that holds the connection
     */
    public Socket getConnection()
    {
        try
        {
            System.out.println("Waiting for client connection...");
            while(clientConnection == null)
                clientConnection = server.accept();

            System.out.println("New client connected!\n");
            return clientConnection;
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
