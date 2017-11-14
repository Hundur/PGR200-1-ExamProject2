package Innlevering_2.server;

public class Server
{
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
