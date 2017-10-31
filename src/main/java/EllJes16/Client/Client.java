package EllJes16;

import java.io.IOException;
import java.net.Socket;

public class Client
{
    private Socket serverConnection;

    public Client(String serverAdr, int serverPort)
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