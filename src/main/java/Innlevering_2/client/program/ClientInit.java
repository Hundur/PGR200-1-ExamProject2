package Innlevering_2.client.program;

import java.io.IOException;
import java.net.Socket;

/**
 * Initialises the client
 *
 * @author Jesper Dahl Ellingsen
 */
public class ClientInit
{
    private Socket serverConnection;

    /**
     * Initialises the client and connects it to the server
     *
     * @param serverAdr Servers IPAdress
     * @param serverPort The port that the server has opened for this program
     */
    public ClientInit(String serverAdr, int serverPort)
    {
        try
        {
            System.out.println("Trying to establish connection...");
            serverConnection = new Socket(serverAdr, serverPort);
            System.out.println("Connected!\n");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public Socket getConnection()
    {
        return serverConnection;
    }
}