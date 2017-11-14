package Innlevering_2.client.program;

import java.io.IOException;
import java.net.Socket;

public class ClientInit
{
    private Socket serverConnection;

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