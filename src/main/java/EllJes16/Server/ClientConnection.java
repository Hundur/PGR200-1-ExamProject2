package EllJes16.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientConnection
{
    private Socket clientConnection;
    private ServerSocket server;

    public ClientConnection(ServerSocket server)
    {
        this.server = server;
    }

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
