package Innlevering_2.server;

public class MainServer
{
    public static void main(String [] args)
    {
        Server server = new Server(3000);

        while(true)
        {
            ClientConnection conn = new ClientConnection(server.getServer());
            if(conn != null)
                // Todo: Threaded solution
                new ServerRuntime(conn);
        }
    }
}
